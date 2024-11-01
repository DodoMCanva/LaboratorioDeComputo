package presentacion;

/**
 *
 * @author Equipo 3
 */
public class frmCompuApartada extends javax.swing.JFrame {

    /**
     * Creates new form frmCompuApartada
     */
    public frmCompuApartada() {
        initComponents();
        setSize(603, 430);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreEstudiante = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtContraseEstudi = new javax.swing.JTextField();
        lblTituloComp = new javax.swing.JLabel();
        lblNumeroComputadora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipooogri.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 280, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setText("Computadora apartada por:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        lblNombreEstudiante.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblNombreEstudiante.setText("Nombre");
        jPanel1.add(lblNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel2.setText("ingrese Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        txtContraseEstudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseEstudiActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseEstudi, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 160, 40));

        lblTituloComp.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblTituloComp.setText("Computadora NO.:");
        jPanel1.add(lblTituloComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        lblNumeroComputadora.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblNumeroComputadora.setText("NumeroPC");
        jPanel1.add(lblNumeroComputadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pollo-fotor-bg-remover-2024102212595.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        btnIngresar.setBackground(new java.awt.Color(51, 153, 255));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseEstudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseEstudiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseEstudiActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        frmInicioExitoso ex = new frmInicioExitoso();
        ex.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCompuApartada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreEstudiante;
    private javax.swing.JLabel lblNumeroComputadora;
    private javax.swing.JLabel lblTituloComp;
    private javax.swing.JTextField txtContraseEstudi;
    // End of variables declaration//GEN-END:variables
}
