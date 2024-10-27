package Interfaces;

import BO.BOException;
import DTOLabComputo.EstudianteDTO;
import java.util.List;
import utilerias.Tabla;

public interface IEstudianteBO {
    //Consultas
    public List<EstudianteDTO> obtenerEstudiantes(Tabla Filtro) throws BOException;
    
    public List<EstudianteDTO> buscarporNombre(String nombre, Tabla Filtro) throws BOException;
    
    public EstudianteDTO consultar(Long id) throws BOException;
    
    //Modificaciones
    public void guardar(EstudianteDTO estudiante) throws BOException;
    
    public void editar(Long id, EstudianteDTO e) throws BOException;
    
    public void eliminar(Long id) throws BOException;
    
    //verificadores
    public void reglasNegocio(EstudianteDTO e) throws BOException;
    
    boolean autenticarEstudiante(Long id)throws BOException;
}
