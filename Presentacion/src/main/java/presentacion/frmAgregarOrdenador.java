package presentacion;

/**
 *
 * @author Equipo 3
 */
public class frmAgregarOrdenador extends javax.swing.JFrame {
    private Long id = null;
    
    public frmAgregarOrdenador(Long id) {
        initComponents();
        this.id = id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplInfOrdenadores = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblIp = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtIp = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agrefar Inf. Ordenadores");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplInfOrdenadores.setBackground(new java.awt.Color(236, 236, 236));
        jplInfOrdenadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblId.setText("ID:");
        jplInfOrdenadores.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 20, 30));

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jplInfOrdenadores.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 240, 30));

        lblIp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblIp.setText("IP:");
        jplInfOrdenadores.add(lblIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 20, 30));

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNumero.setText("Número:");
        jplInfOrdenadores.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 70, 30));

        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jplInfOrdenadores.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 240, 30));

        txtIp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIp.setToolTipText("");
        jplInfOrdenadores.add(txtIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 240, 30));

        btnGuardar.setBackground(new java.awt.Color(102, 204, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jplInfOrdenadores.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 120, 30));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setText("Agregar Ordenador");
        jplInfOrdenadores.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jplInfOrdenadores.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jplInfOrdenadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        frmCatalogoOrdenadores ir = new frmCatalogoOrdenadores(this.id);
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmCatalogoOrdenadores volver = new frmCatalogoOrdenadores(this.id);
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jplInfOrdenadores;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIp;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
