package utilerias;

/**
 * Clase Tabla que representa la estructura de datos para la paginación
 * y la búsqueda en una tabla.
 * 
 * Equipo 3
 */
public class Tabla {

    private int limite;           // Número máximo de registros a mostrar por página
    private int pagina;           // Número de la página actual
    private String textoBusqueda;  // Texto de búsqueda para filtrar los resultados

    /**
     * Constructor de la clase Tabla.
     * 
     * @param limite El número máximo de registros por página.
     * @param pagina El número de la página actual.
     * @param textoBusqueda El texto de búsqueda para filtrar los registros.
     */
    public Tabla(int limite, int pagina, String textoBusqueda) {
        this.limite = limite;
        this.pagina = pagina;
        this.textoBusqueda = textoBusqueda;
    }

    /**
     * Obtiene el límite de registros por página.
     * 
     * @return El número máximo de registros a mostrar por página.
     */
    public int getLimite() {
        return limite;
    }

    /**
     * Obtiene el número de la página actual.
     * 
     * @return El número de la página actual.
     */
    public int getPagina() {
        return pagina;
    }

    /**
     * Obtiene el texto de búsqueda utilizado para filtrar resultados.
     * 
     * @return El texto de búsqueda.
     */
    public String getTextoBusqueda() {
        return textoBusqueda;
    }

}
