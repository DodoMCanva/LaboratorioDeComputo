package utilerias;
/**
 * Clase Utilidades que contiene métodos de utilidad para operaciones comunes.
 * 
 * Equip 3
 */
public class Utilidades {

    /**
     * Método que calcula el valor de OFFSET para una consulta SQL en MySQL
     * basado en el límite de resultados por página y el número de página.
     * 
     * @param limite El número máximo de resultados por página.
     * @param pagina El número de la página actual.
     * @return El valor de OFFSET para la consulta SQL.
     */
    public int RegresarOFFSETMySQL(int limite, int pagina) {
        // Si la página es menor o igual a 1, retorna 0 (inicio de los resultados)
        if (pagina <= 1) {
            return 0;
        }
        
        // Si la página es 2, el OFFSET es igual al límite (comienza en la segunda página)
        if (pagina == 2) {
            return limite;
        }

        // Calcula el OFFSET para páginas mayores a 2
        return ((int)(limite * (pagina - 1)));
    }
}
