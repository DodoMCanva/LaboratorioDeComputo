
package presentacion;

/**
 *
 * @author Valeria
 */
public class frmReporteCarreras extends javax.swing.JFrame {

    public frmReporteCarreras() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplRepCarrera = new javax.swing.JPanel();
        txtTitlo = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        lblFechaInicio = new javax.swing.JLabel();
        lblFechaFin = new javax.swing.JLabel();
        dtcFechaInicio = new com.toedter.calendar.JDateChooser();
        dtcFechaFin = new com.toedter.calendar.JDateChooser();
        slpRepCarreras = new javax.swing.JScrollPane();
        tblTablaRepCarreras = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        btnVistaPrevia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte de Carreras");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplRepCarrera.setBackground(new java.awt.Color(255, 255, 255));
        jplRepCarrera.setToolTipText("Reporte de Carreras");
        jplRepCarrera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitlo.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtTitlo.setForeground(new java.awt.Color(204, 0, 0));
        txtTitlo.setText("Reporte Carreras");
        jplRepCarrera.add(txtTitlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        lblCarrera.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCarrera.setText("Carrera:");
        jplRepCarrera.add(lblCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        lblFechaInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaInicio.setText("Fecha Inicio:");
        jplRepCarrera.add(lblFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 30));

        lblFechaFin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaFin.setText("Fecha Fin:");
        jplRepCarrera.add(lblFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, 30));

        dtcFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        jplRepCarrera.add(dtcFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 120, 25));

        dtcFechaFin.setBackground(new java.awt.Color(255, 255, 255));
        jplRepCarrera.add(dtcFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 120, 25));

        tblTablaRepCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Min. Uso día", "Cant. Alumnos "
            }
        ));
        slpRepCarreras.setViewportView(tblTablaRepCarreras);

        jplRepCarrera.add(slpRepCarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 530, 250));

        btnConsultar.setBackground(new java.awt.Color(102, 204, 255));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jplRepCarrera.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 130, 40));

        btnVistaPrevia.setText("Vista Previa");
        btnVistaPrevia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaPreviaActionPerformed(evt);
            }
        });
        jplRepCarrera.add(btnVistaPrevia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        getContentPane().add(jplRepCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        frmPdfReporteCarrera consultar = new frmPdfReporteCarrera();
        consultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnVistaPreviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaPreviaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVistaPreviaActionPerformed

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
//            java.util.logging.Logger.getLogger(frmReporteCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmReporteCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmReporteCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmReporteCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmReporteCarreras().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnVistaPrevia;
    private com.toedter.calendar.JDateChooser dtcFechaFin;
    private com.toedter.calendar.JDateChooser dtcFechaInicio;
    private javax.swing.JPanel jplRepCarrera;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JScrollPane slpRepCarreras;
    private javax.swing.JTable tblTablaRepCarreras;
    private javax.swing.JLabel txtTitlo;
    // End of variables declaration//GEN-END:variables
}
