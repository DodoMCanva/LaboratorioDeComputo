package presentacion;

import BO.BOException;
import BO.BloqueoBO;
import BO.EstudianteBO;
import DTOLabComputo.BloqueoDTO;
import DTOLabComputo.EstudianteDTO;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilerias.Tabla;

/**
 *
 * @author Valeria
 */
public class frmBloqueo extends javax.swing.JFrame {

    /**
     * Creates new form frmBloqueo
     */
    public frmBloqueo() {
        initComponents();
        cargarEstudiantes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplBloquear = new javax.swing.JPanel();
        lblMotivo = new javax.swing.JLabel();
        lblEstudiante = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        scpMotivo = new javax.swing.JScrollPane();
        txaMotivo = new javax.swing.JTextArea();
        cbxEstudiantes = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bloqueo de Estudiante");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplBloquear.setBackground(new java.awt.Color(236, 236, 236));
        jplBloquear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMotivo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblMotivo.setText("Motivo:");
        jplBloquear.add(lblMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 60, 30));

        lblEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEstudiante.setText("Estudiante:");
        jplBloquear.add(lblEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 80, 30));

        btnGuardar.setBackground(new java.awt.Color(102, 204, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jplBloquear.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 120, 30));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setText("Bloquear Ordenador");
        jplBloquear.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        txaMotivo.setColumns(20);
        txaMotivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txaMotivo.setRows(5);
        scpMotivo.setViewportView(txaMotivo);

        jplBloquear.add(scpMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 290, 80));

        cbxEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jplBloquear.add(cbxEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 290, 30));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jplBloquear.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jplBloquear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmCatalogoBloqueos volver = new frmCatalogoBloqueos();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String motivo = txaMotivo.getText();
        String selectedEstudiante = (String) cbxEstudiantes.getSelectedItem();

        // Verificar que el motivo y el estudiante estén seleccionados
        if (motivo.isEmpty() || selectedEstudiante == null || selectedEstudiante.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un motivo y seleccione un estudiante.", "Error de validación", JOptionPane.WARNING_MESSAGE);
            return; // No continúa si la validación falla
        }

        // Asumiendo que el formato es "Nombre Estudiante - ID"
        String[] parts = selectedEstudiante.split(" - ");
        Long estudianteId = Long.parseLong(parts[1]); // Extraer el ID

        BloqueoDTO nuevoBloqueoDTO = new BloqueoDTO();
        nuevoBloqueoDTO.setMotivo(motivo);
        nuevoBloqueoDTO.setEstudianteId(estudianteId); // Asignar el ID al DTO

        BloqueoBO bloqueoBO = new BloqueoBO();
        try {
            bloqueoBO.agregarBloqueo(nuevoBloqueoDTO);
            JOptionPane.showMessageDialog(this, "Bloqueo registrado con éxito.");

            // Redirigir a la pantalla de catálogo de bloqueos
            frmCatalogoBloqueos volver = new frmCatalogoBloqueos();
            volver.setVisible(true);
            this.dispose(); // Cierra la ventana actual
        } catch (BOException ex) {
            JOptionPane.showMessageDialog(this, "Error al registrar el bloqueo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cargarEstudiantes() {
        EstudianteBO estudianteBO = new EstudianteBO();
        Tabla filtro = new Tabla(); // Crear filtro según sea necesario

        try {
            List<EstudianteDTO> estudiantes = estudianteBO.obtenerEstudiantes(filtro); // Maneja la excepción de manera adecuada
            for (EstudianteDTO estudiante : estudiantes) {
                // Suponiendo que tu DTO tiene un método getNombreCompleto()
                cbxEstudiantes.addItem(estudiante.getNombre() + " " + estudiante.getApellidoPaterno() + " " + estudiante.getApellidoMaterno() + " - " + estudiante.getEstudiante_ID());
            }
        } catch (BOException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los estudiantes: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxEstudiantes;
    private javax.swing.JPanel jplBloquear;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane scpMotivo;
    private javax.swing.JTextArea txaMotivo;
    // End of variables declaration//GEN-END:variables
}
