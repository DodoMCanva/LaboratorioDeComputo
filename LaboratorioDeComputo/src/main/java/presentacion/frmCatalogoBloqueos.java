package presentacion;

/**
 *
 * @author Valeria
 */
public class frmCatalogoBloqueos extends javax.swing.JFrame {

    /**
     * Creates new form frmCatalogoBloqueos
     */
    public frmCatalogoBloqueos() {
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

        jplCatalogoBloqueos = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBloqueos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnBloquear = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblNumPagina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catálogo Bloqueos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplCatalogoBloqueos.setBackground(new java.awt.Color(236, 236, 236));
        jplCatalogoBloqueos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jplCatalogoBloqueos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jplCatalogoBloqueos.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tblBloqueos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Folio", "Fecha inicio", "Fecha fin", "Motivo", "Estudiante", "Finalizar"
            }
        ));
        jScrollPane1.setViewportView(tblBloqueos);

        jplCatalogoBloqueos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 790, 260));
        jplCatalogoBloqueos.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 580, 30));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        jplCatalogoBloqueos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, 30));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setText("Bloqueos");
        jplCatalogoBloqueos.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        btnBloquear.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnBloquear.setText("Bloquear ordenador");
        btnBloquear.setToolTipText("");
        btnBloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloquearActionPerformed(evt);
            }
        });
        jplCatalogoBloqueos.add(btnBloquear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 180, 30));

        btnAtras.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atras");
        jplCatalogoBloqueos.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, 25));

        btnSiguiente.setBackground(new java.awt.Color(153, 153, 153));
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        jplCatalogoBloqueos.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, 25));

        lblNumPagina.setText("numPagina");
        jplCatalogoBloqueos.add(lblNumPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, 25));

        getContentPane().add(jplCatalogoBloqueos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloquearActionPerformed
        frmBloqueo ir = new frmBloqueo();
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBloquearActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      frmMenuAdministrador ir = new frmMenuAdministrador();
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
//            java.util.logging.Logger.getLogger(frmCatalogoBloqueos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmCatalogoBloqueos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmCatalogoBloqueos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmCatalogoBloqueos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmCatalogoBloqueos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBloquear;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jplCatalogoBloqueos;
    private javax.swing.JLabel lblNumPagina;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblBloqueos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
