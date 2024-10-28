
package Persistencias;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class ReporteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> obtenerReporteComputadoras() {
        String query = "SELECT c.nombreCentro, pc.numeroPC, COUNT(s.estudiante), "
                + "SUM(TIMESTAMPDIFF(MINUTE, s.fechaInicio, s.fechaFin)), "
                + "SUM(TIMESTAMPDIFF(MINUTE, c.horaApertura, c.horaCierre)) - SUM(TIMESTAMPDIFF(MINUTE, s.fechaInicio, s.fechaFin)) "
                + "FROM CentroLaboratorio c JOIN c.computadoras pc JOIN pc.sesiones s "
                + "GROUP BY c.nombreCentro, pc.numeroPC";

        TypedQuery<Object[]> typedQuery = entityManager.createQuery(query, Object[].class);
        return typedQuery.getResultList();
    }
}
