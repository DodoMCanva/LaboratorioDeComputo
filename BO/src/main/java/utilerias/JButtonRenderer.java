package utilerias;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * Clase JButtonRenderer que implementa TableCellRenderer para renderizar un botón en las celdas de una JTable.
 * Equipo 3 
 */
public class JButtonRenderer implements TableCellRenderer {

    private final JButton button; // Botón que se mostrará en la celda
    
    /**
     * Constructor que inicializa el JButtonRenderer con un texto para el botón.
     * 
     * @param text El texto que se mostrará en el botón.
     */
    public JButtonRenderer(String text) {
        this.button = new JButton(text); // Crea un nuevo botón con el texto especificado
    }
    
    /**
     * Método que obtiene el componente para renderizar la celda de la tabla.
     * 
     * @param table La JTable que contiene la celda.
     * @param value El valor de la celda que se está renderizando.
     * @param isSelected Indica si la celda está seleccionada.
     * @param hasFocus Indica si la celda tiene el foco.
     * @param row La fila de la celda.
     * @param column La columna de la celda.
     * @return El componente (botón) para renderizar la celda.
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return this.button; // Devuelve el botón como el componente del renderer
    }
}
