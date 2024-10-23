package presentacion;

/**
 *
 * @author Valeria
 */
public class frmMenuReportes extends javax.swing.JFrame {

    /**
     * Creates new form frmReportes
     */
    public frmMenuReportes() {
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

        jplMenuReportes = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnRepCarrera = new javax.swing.JButton();
        btnRepCentroComputo = new javax.swing.JButton();
        btnRepBloqueos = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reportes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplMenuReportes.setBackground(new java.awt.Color(236, 236, 236));
        jplMenuReportes.setToolTipText("");
        jplMenuReportes.setName(""); // NOI18N
        jplMenuReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setText("Generar reporte");
        jplMenuReportes.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 180, -1));

        btnRepCarrera.setBackground(new java.awt.Color(102, 204, 255));
        btnRepCarrera.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnRepCarrera.setText("Reporte de Carreras");
        btnRepCarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRepCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepCarreraActionPerformed(evt);
            }
        });
        jplMenuReportes.add(btnRepCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 230, 50));

        btnRepCentroComputo.setBackground(new java.awt.Color(102, 204, 255));
        btnRepCentroComputo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnRepCentroComputo.setText("Reporte de centro de computo");
        btnRepCentroComputo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRepCentroComputo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepCentroComputoActionPerformed(evt);
            }
        });
        jplMenuReportes.add(btnRepCentroComputo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 230, 50));

        btnRepBloqueos.setBackground(new java.awt.Color(102, 204, 255));
        btnRepBloqueos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnRepBloqueos.setText("Reporte de Bloqueos");
        btnRepBloqueos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRepBloqueos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepBloqueosActionPerformed(evt);
            }
        });
        jplMenuReportes.add(btnRepBloqueos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 230, 50));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jplMenuReportes.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jplMenuReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRepCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepCarreraActionPerformed

    }//GEN-LAST:event_btnRepCarreraActionPerformed

    private void btnRepCentroComputoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepCentroComputoActionPerformed
        frmReporteCentroComputo ir = new frmReporteCentroComputo();
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRepCentroComputoActionPerformed

    private void btnRepBloqueosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepBloqueosActionPerformed

    }//GEN-LAST:event_btnRepBloqueosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmMenuAdministrador volver = new frmMenuAdministrador();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
//
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
//            java.util.logging.Logger.getLogger(frmMenuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmMenuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmMenuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmMenuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmMenuReportes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRepBloqueos;
    private javax.swing.JButton btnRepCarrera;
    private javax.swing.JButton btnRepCentroComputo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jplMenuReportes;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}