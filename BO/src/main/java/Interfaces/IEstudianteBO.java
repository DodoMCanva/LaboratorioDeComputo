package Interfaces;

import DTOLabComputo.EstudianteDTO;
import java.util.List;
import utilerias.Tabla;

public interface IEstudianteBO {
    //Consultas
    public List<EstudianteDTO> obtenerEstudiantes(Tabla Filtro);
    
    public List<EstudianteDTO> buscarporNombre(String nombre, Tabla Filtro);
    
    public EstudianteDTO consultar(int id);
    
    //Modificaciones
    public void guardar(EstudianteDTO estudiante);
    
    public void editar();
    
    public void eliminar();
    
    //verificadores
    public void reglasNegocio(EstudianteDTO e);
    
    public void autenticarCliente(EstudianteDTO estudiante);
    
}
