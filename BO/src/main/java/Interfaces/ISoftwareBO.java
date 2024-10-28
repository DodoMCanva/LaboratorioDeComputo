    package Interfaces;

import DTOLabComputo.SoftwareDTO;

/**
 * Interfaz ISoftwareBO que define los métodos relacionados con la lógica de negocio para la entidad Software.
 * Proporciona métodos para consultar información sobre software.
 * 
 * Equipo 3
 */
public interface ISoftwareBO {

    /**
     * Consulta un software por su nombre.
     * 
     * @param Software El nombre del software a consultar.
     * @return Un objeto SoftwareDTO que representa el software consultado.
     */
    public SoftwareDTO consultarPorNombre(String Software);
}
