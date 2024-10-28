package Persistencias;

import Entidades.Computadora;
import Entidades.Sesion;
import java.sql.Date;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author Equipo 3
 */
public class SesionDAO {

    public List<Sesion> findSesionesByCentroComputoAndDateRange(Long centroComputoId, Date startDate, Date endDate) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Sesion> cq = cb.createQuery(Sesion.class);
        Root<Sesion> sesion = cq.from(Sesion.class);
        Join<Sesion, Computadora> computadora = sesion.join("computadora");

        Predicate centroComputoPredicate = cb.equal(computadora.get("centroLab").get("id"), centroComputoId);
        Predicate fechaInicioPredicate = cb.greaterThanOrEqualTo(sesion.get("fechaInicio"), startDate);
        Predicate fechaFinPredicate = cb.lessThanOrEqualTo(sesion.get("fechaFin"), endDate);

        cq.select(sesion).where(cb.and(centroComputoPredicate, fechaInicioPredicate, fechaFinPredicate));

        return entityManager.createQuery(cq).getResultList();
    }
}

