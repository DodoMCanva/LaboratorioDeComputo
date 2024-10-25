
package presentacion;

import DTOLabComputo.EstudianteDTO;

/**
 *
 * @author Equipo 3
 */
public class frmAgregarEsudiante extends javax.swing.JFrame {

    /**
     * Creates new form frmAgregarEsudiante
     */
    public frmAgregarEsudiante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfEstudiante = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApPaterno = new javax.swing.JLabel();
        lblApMaterno = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApPaterno = new javax.swing.JTextField();
        txtApMaterno = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        cbxCarrera = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Inf. Estudiante");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlInfEstudiante.setBackground(new java.awt.Color(236, 236, 236));
        pnlInfEstudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblId.setText("ID:");
        pnlInfEstudiante.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 40, 30));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNombre.setText("Nombre:");
        pnlInfEstudiante.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 80, 30));

        lblApPaterno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblApPaterno.setText("Apellido Paterno:");
        pnlInfEstudiante.add(lblApPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 140, 30));

        lblApMaterno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblApMaterno.setText("Apellido Materno:");
        pnlInfEstudiante.add(lblApMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 130, 30));

        lblContrasena.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblContrasena.setText("Contraseña:");
        pnlInfEstudiante.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 100, 30));

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEstado.setText("Estatus:");
        pnlInfEstudiante.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 70, 30));

        lblCarrera.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCarrera.setText("Carrera:");
        pnlInfEstudiante.add(lblCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, 30));

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlInfEstudiante.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 240, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setToolTipText("");
        pnlInfEstudiante.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 240, 30));

        txtApPaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlInfEstudiante.add(txtApPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 240, 30));

        txtApMaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlInfEstudiante.add(txtApMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 240, 30));

        txtContrasena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlInfEstudiante.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 240, 30));

        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlInfEstudiante.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 240, 30));

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
        pnlInfEstudiante.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 120, 30));

        cbxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciatura en Administración​", " ", "Licenciatura en Administración de Empresas Turísticas", " ", "Licenciatura en Administración Estratégica", " ", "Licenciatura en Arquitectura", " ", "Licenciatura en Ciencias de la Educación", " ", "Licenciatura en Ciencias del Ejercicio Físico", " ", "Licenciatura en Contaduría Pública", " ", "Licenciatura en Dirección de la Cultura Física y el Deporte", " ", "Licenciatura en Diseño Gráfico", " ", "Licenciatura en Derecho", " ", "Licenciatura en Economía y Finanzas", " ", "Licenciatura en Educación Artística y Gest​ión Cultural​​", " ", "Licenciatura en Educación Infantil​​", " ", "Licenciatura en Educación Inicial y Gestión de Instituciones", " ", "Licenciatura en Emprendimiento e​ Innovación", " ", "Licenciatura en Enfermería", " ", "Licenciatura en Gastronomía", " ", "Licenciatura en Mercadotecnia", " ", "Licenciatura en Psicología", " ", "Licenciatura en Tecnología de Alimentos", " ", "Ingeniería en Biosistemas", " ", "Ingeniería en Biotecnología", " ", "Ingeniería en Ciencias Ambientales", " ", "Ingeniería Civil", " ", "Ingeniería Electromecánica", " ", "Ingeniería en Electrónica", " ", "Ingeniería Industrial y de Sistemas", " ", "Ingeniería en Logística​​", " ", "Ingeniería en Manufactura​", " ", "Ingeniería en Mecatrónica", " ", "Ingeniería Química ​", " ", "Ingeniería en Software​", " ", "Me​dici​na Veterinaria y Zootecnia" }));
        cbxCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCarreraActionPerformed(evt);
            }
        });
        pnlInfEstudiante.add(cbxCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 240, 30));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        pnlInfEstudiante.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(pnlInfEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        EstudianteDTO nuevo = new EstudianteDTO();
        
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

    public void nuevoEstudiante(){}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxCarrera;
    private javax.swing.JLabel lblApMaterno;
    private javax.swing.JLabel lblApPaterno;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlInfEstudiante;
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
