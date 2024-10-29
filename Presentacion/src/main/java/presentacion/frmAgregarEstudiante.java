package presentacion;

import BO.BOException;
import BO.CarreraBO;
import BO.EstudianteBO;
import DTOLabComputo.CarreraDTO;
import DTOLabComputo.EstudianteDTO;
import Persistencias.CarreraDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo 3
 */
public class frmAgregarEstudiante extends javax.swing.JFrame {

    private EstudianteBO estudianteBO = new EstudianteBO();
    private CarreraBO carreraBO = new CarreraBO(new CarreraDAO());

    /**
     * Creates new form frmAgregarEsudiante
     */
    public frmAgregarEstudiante() {
        initComponents();
    }

    public frmAgregarEstudiante(Long estudianteId) throws BOException {
        initComponents();
        // Obtener el estudiante usando el estudianteId
        EstudianteDTO estudiante = estudianteBO.consultar(estudianteId);
        if (estudiante != null) {
            cargarDatosEstudiante(estudiante); // Llama al método para cargar datos en modo edición
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfEstudiante = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApPaterno = new javax.swing.JLabel();
        lblApMaterno = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApPaterno = new javax.swing.JTextField();
        txtApMaterno = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        cbxCarrera = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Inf. Estudiante");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlInfEstudiante.setBackground(new java.awt.Color(236, 236, 236));
        pnlInfEstudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNombre.setText("Nombres:");
        pnlInfEstudiante.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 80, 30));

        lblApPaterno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblApPaterno.setText("Apellido Paterno:");
        pnlInfEstudiante.add(lblApPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 140, 30));

        lblApMaterno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblApMaterno.setText("Apellido Materno:");
        pnlInfEstudiante.add(lblApMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 130, 30));

        lblContrasena.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblContrasena.setText("Contraseña:");
        pnlInfEstudiante.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 100, 30));

        lblCarrera.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCarrera.setText("Carrera:");
        pnlInfEstudiante.add(lblCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setToolTipText("");
        pnlInfEstudiante.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 240, 30));

        txtApPaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlInfEstudiante.add(txtApPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 240, 30));

        txtApMaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlInfEstudiante.add(txtApMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 240, 30));

        txtContrasena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlInfEstudiante.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 240, 30));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setText("Agregar Estudiante");
        pnlInfEstudiante.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(102, 204, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlInfEstudiante.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 120, 30));

        cbxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciatura en Administración​", "Licenciatura en Administración de Empresas Turísticas", "Licenciatura en Administración Estratégica", "Licenciatura en Arquitectura", "Licenciatura en Ciencias de la Educación", "Licenciatura en Ciencias del Ejercicio Físico", "Licenciatura en Contaduría Pública", "Licenciatura en Dirección de la Cultura Física y el Deporte", "Licenciatura en Diseño Gráfico", "Licenciatura en Derecho", "Licenciatura en Economía y Finanzas", "Licenciatura en Educación Artística y Gest​ión Cultural​​", "Licenciatura en Educación Infantil​​", "Licenciatura en Educación Inicial y Gestión de Instituciones", "Licenciatura en Emprendimiento e​ Innovación", "Licenciatura en Enfermería", "Licenciatura en Gastronomía", "Licenciatura en Mercadotecnia", "Licenciatura en Psicología", "Licenciatura en Tecnología de Alimentos", "Ingeniería en Biosistemas", "Ingeniería en Biotecnología", "Ingeniería en Ciencias Ambientales", "Ingeniería Civil", "Ingeniería Electromecánica", "Ingeniería en Electrónica", "Ingeniería Industrial y de Sistemas", "Ingeniería en Logística​​", "Ingeniería en Manufactura​", "Ingeniería en Mecatrónica", "Ingeniería Química ​", "Ingeniería en Software​", "Me​dici​na Veterinaria y Zootecnia" }));
        cbxCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCarreraActionPerformed(evt);
            }
        });
        pnlInfEstudiante.add(cbxCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 240, 30));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        pnlInfEstudiante.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(pnlInfEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        EstudianteDTO nuevo = new EstudianteDTO();
        //nuevo.setEstudiante_ID(Long.parseLong(txtId.getText()));
        nuevo.setNombre(txtNombre.getText());
        nuevo.setApellidoPaterno(txtApPaterno.getText());
        nuevo.setApellidoMaterno(txtApMaterno.getText());
        nuevo.setContraseña(txtContrasena.getText());

        CarreraDTO carreraSeleccionada = carreraBO.consultarPorNombre(cbxCarrera.getSelectedItem().toString());
        if (carreraSeleccionada != null) {
            nuevo.setCarrera(carreraSeleccionada);
        }

        if (estudianteId == null) {
            try {
                // Modo de agregar
                estudianteBO.guardar(nuevo);
            } catch (BOException ex) {
                Logger.getLogger(frmAgregarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                // Modo de edición
                estudianteBO.editar(estudianteId, nuevo);
            } catch (BOException ex) {
                Logger.getLogger(frmAgregarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        frmCatalogoEstudiantes ir = new frmCatalogoEstudiantes();
        ir.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmCatalogoEstudiantes volver = new frmCatalogoEstudiantes();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cbxCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCarreraActionPerformed
    private Long estudianteId = null; // Declaración de la variable de clase estudianteId
    // Método para cargar los datos del estudiante en los campos

    private void cargarDatosEstudiante(EstudianteDTO estudiante) {
        if (estudiante != null) { // Verificar que el estudiante no sea nulo
            this.estudianteId = estudiante.getEstudiante_ID(); // Asigna el ID del estudiante para edición
            txtNombre.setText(estudiante.getNombre());
            txtApPaterno.setText(estudiante.getApellidoPaterno());
            txtApMaterno.setText(estudiante.getApellidoMaterno());
            txtContrasena.setText(estudiante.getContraseña());

            // Selecciona la carrera del estudiante en el combo box
            String nombreCarrera = estudiante.getCarrera().getNombre();
            if (carreraExistente(nombreCarrera)) { // Verifica que la carrera esté en el ComboBox
                cbxCarrera.setSelectedItem(nombreCarrera);
            } else {
                System.out.println("Carrera no encontrada en el ComboBox: " + nombreCarrera);
            }

            lblTitulo.setText("Editar Estudiante"); // Cambia el título
        } else {
            System.out.println("Estudiante no válido.");
        }
    }

// Método adicional para verificar la existencia de la carrera en el ComboBox
    private boolean carreraExistente(String nombreCarrera) {
        for (int i = 0; i < cbxCarrera.getItemCount(); i++) {
            if (cbxCarrera.getItemAt(i).equals(nombreCarrera)) {
                return true;
            }
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxCarrera;
    private javax.swing.JLabel lblApMaterno;
    private javax.swing.JLabel lblApPaterno;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlInfEstudiante;
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
