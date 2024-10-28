package utilerias;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;

/**
 * Clase JButtonCellEditor que implementa TableCellEditor para permitir el uso de un botón en las celdas de una JTable.
 * Equipo 3
 * 
 */
public class JButtonCellEditor implements TableCellEditor {

    private final JButton button; // Botón que se utilizará como editor de celda
    private int row; // Fila actual del editor
    private ActionListener actionListener; // Listener para manejar la acción del botón

    /**
     * Constructor que inicializa el JButtonCellEditor.
     * 
     * @param text El texto que se mostrará en el botón.
     * @param actionListener El ActionListener que se ejecutará al presionar el botón.
     */
    public JButtonCellEditor(String text, ActionListener actionListener) {
        this.button = new JButton(text);
        this.actionListener = actionListener;
        // Agrega un ActionListener al botón
        this.button.addActionListener((ActionEvent evt) -> {
            // Llama al ActionListener proporcionado cuando se presiona el botón
            this.actionListener.actionPerformed(
                new ActionEvent(this.button, ActionEvent.ACTION_PERFORMED, this.row + "")
            );
        });
    }
    
    /**
     * Método que obtiene el componente para editar la celda.
     * 
     * @param table La JTable que contiene la celda.
     * @param value El valor de la celda que se está editando.
     * @param isSelected Indica si la celda está seleccionada.
     * @param row La fila de la celda.
     * @param column La columna de la celda.
     * @return El componente (botón) para editar la celda.
     */
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.row = row; // Almacena la fila actual
        return this.button; // Devuelve el botón como el componente del editor
    }

    /**
     * Método que obtiene el valor de la celda editada.
     * 
     * @return El valor de la celda editada (en este caso, siempre devuelve true).
     */
    @Override
    public Object getCellEditorValue() {
        return true; // Se puede modificar para devolver un valor diferente si es necesario
    }

    /**
     * Método que indica si la celda es editable.
     * 
     * @param anEvent El evento que causa la edición.
     * @return true si la celda es editable, false en caso contrario.
     */
    @Override
    public boolean isCellEditable(EventObject anEvent) {
        return true; // La celda siempre es editable
    }

    /**
     * Método que indica si la celda debe ser seleccionada.
     * 
     * @param anEvent El evento que causa la selección.
     * @return true si la celda debe ser seleccionada, false en caso contrario.
     */
    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return true; // Siempre selecciona la celda
    }

    /**
     * Método que se llama para detener la edición de la celda.
     * 
     * @return true si la edición se detuvo con éxito.
     */
    @Override
    public boolean stopCellEditing() {
        return true; // Siempre permite detener la edición
    }

    /**
     * Método que se llama para cancelar la edición de la celda.
     */
    @Override
    public void cancelCellEditing() {
        // No se necesita implementación adicional
    }

    /**
     * Método que agrega un CellEditorListener.
     * 
     * @param l El listener que se agregará.
     */
    @Override
    public void addCellEditorListener(CellEditorListener l) {
        // No se necesita implementación adicional
    }

    /**
     * Método que elimina un CellEditorListener.
     * 
     * @param l El listener que se eliminará.
     */
    @Override
    public void removeCellEditorListener(CellEditorListener l) {
        // No se necesita implementación adicional
    }
}