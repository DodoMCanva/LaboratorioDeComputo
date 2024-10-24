
package Interfaces;

import BO.BOException;
import Entidades.CentroLaboratorio;
import java.util.List;

/**
 *
 * @author Valeria
 */
public interface ILaboratorioBO {

    List<CentroLaboratorio> obtenerCentros() throws BOException;

    List<CentroLaboratorio> buscarPorNombre(String nombre) throws BOException;

    CentroLaboratorio consultar(Long id) throws BOException;

    void guardar(CentroLaboratorio cl) throws BOException;

    void editar(Long id, CentroLaboratorio cl) throws BOException;

    void eliminar(Long id) throws BOException;

    void reglasNegocio(CentroLaboratorio cl) throws BOException;

    void autenticarEstudiante(CentroLaboratorio cl) throws BOException;
}
