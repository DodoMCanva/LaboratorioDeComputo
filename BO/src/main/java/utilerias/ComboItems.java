package utilerias;
/**
 * Clase ComboItems que representa un elemento para ser utilizado en un JComboBox.
 * Contiene atributos para almacenar el nombre y el ID del elemento.
 * 
 * Equipo 3
 */
public class ComboItems {
    
    private String nombre; // Nombre del item
    private String id; // ID del item
    
    /**
     * Constructor que inicializa ambos atributos: id y nombre.
     * 
     * @param id El ID del item.
     * @param nombre El nombre del item.
     */
    public ComboItems(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    /**
     * Constructor que inicializa solo el atributo id.
     * 
     * @param id El ID del item.
     */
    public ComboItems(String id) {
        this.id = id;
    }

    /**
     * Método que obtiene el nombre del item.
     * 
     * @return El nombre del item.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del item.
     * 
     * @param aNombre El nuevo nombre para el item.
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Método que obtiene el ID del item.
     * 
     * @return El ID del item.
     */
    public String getId() {
        return id;
    }

    /**
     * Método que establece el ID del item.
     * 
     * @param aId El nuevo ID para el item.
     */
    public void setId(String aId) {
        id = aId;
    }
    
    /**
     * Método toString que devuelve una representación en forma de cadena del item.
     * 
     * @return El nombre del item como representación en cadena.
     */
    @Override
    public String toString() {
        return this.nombre;
    }
    
    /**
     * Método equals que compara el ID del item actual con otro objeto.
     * 
     * @param item El objeto con el que se compara.
     * @return true si los IDs son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object item) {
        return this.id.equals(((ComboItems) item).id);
    }
}
