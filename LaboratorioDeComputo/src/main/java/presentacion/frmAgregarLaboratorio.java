
package presentacion;

/**
 *
 * @author Valeria
 */
public class frmAgregarLaboratorio extends javax.swing.JFrame {

    /**
     * Creates new form frmAgregarLaboratorio
     */
    public frmAgregarLaboratorio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplInfLaboratorios = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblHoraInicio = new javax.swing.JLabel();
        lblHoraFin = new javax.swing.JLabel();
        lblCampus = new javax.swing.JLabel();
        txtHoraFin = new javax.swing.JTextField();
        txtHoraInicio = new javax.swing.JTextField();
        cbxCampus = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agrefar Inf. Laboratorios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplInfLaboratorios.setBackground(new java.awt.Color(236, 236, 236));
        jplInfLaboratorios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblId.setText("ID:");
        jplInfLaboratorios.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 30, 30));

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jplInfLaboratorios.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 240, 30));

        lblHoraInicio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblHoraInicio.setText("Hora Inicio:");
        jplInfLaboratorios.add(lblHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 80, 30));

        lblHoraFin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblHoraFin.setText("Hora fin:");
        jplInfLaboratorios.add(lblHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 60, 30));

        lblCampus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCampus.setText("Campus:");
        jplInfLaboratorios.add(lblCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 60, 30));

        txtHoraFin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jplInfLaboratorios.add(txtHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 240, 30));

        txtHoraInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHoraInicio.setToolTipText("");
        jplInfLaboratorios.add(txtHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 240, 30));

        cbxCampus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Campus Obregón Náinari", "Campus Obregón Centro", "Campus Navojoa", "Campus Guaymas", "Campus Empalme" }));
        jplInfLaboratorios.add(cbxCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 240, 30));

        btnGuardar.setBackground(new java.awt.Color(102, 204, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        jplInfLaboratorios.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 120, 30));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setText("Agregar Laboratorio");
        jplInfLaboratorios.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        lblContrasena.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblContrasena.setText("Contraseña:");
        jplInfLaboratorios.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 90, 30));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNombre.setText("Nombre:");
        jplInfLaboratorios.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 70, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setToolTipText("");
        jplInfLaboratorios.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 240, 30));

        txtContrasena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jplInfLaboratorios.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 240, 30));

        getContentPane().add(jplInfLaboratorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmAgregarLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmAgregarLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmAgregarLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmAgregarLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmAgregarLaboratorio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxCampus;
    private javax.swing.JPanel jplInfLaboratorios;
    private javax.swing.JLabel lblCampus;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblHoraFin;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
