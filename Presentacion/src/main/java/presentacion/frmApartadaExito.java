package presentacion;

/**
 *
 * @author cesar
 */
public class frmApartadaExito extends javax.swing.JFrame {

    /**
     * Creates new form frmApartadaExito
     */
    public frmApartadaExito() {
        initComponents(); 
        setSize(603, 430);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblEstudianteNumero = new javax.swing.JLabel();
        lblNumeroPc = new javax.swing.JLabel();
        lblTituloEstudiante = new javax.swing.JLabel();
        lblNombreEstudiante = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(603, 430));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lblTitulo.setText("Computadora apartada con exito!");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compuITson.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 110, 40));

        lblEstudianteNumero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEstudianteNumero.setText("Numero:");
        jPanel1.add(lblEstudianteNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        lblNumeroPc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumeroPc.setText("NumeroPC");
        jPanel1.add(lblNumeroPc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, 20));

        lblTituloEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloEstudiante.setText("Estudiante:");
        jPanel1.add(lblTituloEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        lblNombreEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreEstudiante.setText("NombreEstudiante");
        jPanel1.add(lblNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipoazul.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       frmInicioSesionEstudiante ini= new frmInicioSesionEstudiante();
       ini.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEstudianteNumero;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreEstudiante;
    private javax.swing.JLabel lblNumeroPc;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloEstudiante;
    // End of variables declaration//GEN-END:variables
}
