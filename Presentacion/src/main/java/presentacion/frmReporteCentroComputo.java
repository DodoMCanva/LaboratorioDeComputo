/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
//import org.controlsfx.control.CheckComboBox;
/**
 *
 * @author Valeria
 */
public class frmReporteCentroComputo extends javax.swing.JFrame {

    /**
     * Creates new form frmReporteCentroComputo
     */
    public frmReporteCentroComputo() {
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

        pnlRepCentroC = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        lblCentro = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        lblFechaInicio = new javax.swing.JLabel();
        lblFechaFin = new javax.swing.JLabel();
        cbxCentro = new javax.swing.JComboBox<>();
        dtcFechaInicio = new com.toedter.calendar.JDateChooser();
        dtcFechaFin = new com.toedter.calendar.JDateChooser();
        slpRepCentro = new javax.swing.JScrollPane();
        tblRepCentro = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte de Centro de Computo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRepCentroC.setBackground(new java.awt.Color(255, 255, 255));
        pnlRepCentroC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(204, 0, 0));
        txtTitulo.setText("Reporte Centro de Computo");
        pnlRepCentroC.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        lblCentro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCentro.setText("Centro:");
        pnlRepCentroC.add(lblCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        lblCarrera.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCarrera.setText("Carrera:");
        pnlRepCentroC.add(lblCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 30));

        lblFechaInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaInicio.setText("Fecha Inicio:");
        pnlRepCentroC.add(lblFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, 30));

        lblFechaFin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFechaFin.setText("Fecha Fin:");
        pnlRepCentroC.add(lblFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, 30));

        cbxCentro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlRepCentroC.add(cbxCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 240, 30));

        dtcFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        pnlRepCentroC.add(dtcFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, 25));

        dtcFechaFin.setBackground(new java.awt.Color(255, 255, 255));
        pnlRepCentroC.add(dtcFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 120, 25));

        tblRepCentro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Num. Computadora", "Cant. Alumnos ", "Min. Uso día", "Min. Inactivo"
            }
        ));
        slpRepCentro.setViewportView(tblRepCentro);

        pnlRepCentroC.add(slpRepCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 530, 250));

        btnConsultar.setBackground(new java.awt.Color(102, 204, 255));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        pnlRepCentroC.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 130, 40));

        getContentPane().add(pnlRepCentroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        frmPdfReporteCentroComputo consultar = new frmPdfReporteCentroComputo();
        consultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultarActionPerformed

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
//            java.util.logging.Logger.getLogger(frmReporteCentroComputo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmReporteCentroComputo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmReporteCentroComputo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmReporteCentroComputo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmReporteCentroComputo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JComboBox<String> cbxCentro;
    private com.toedter.calendar.JDateChooser dtcFechaFin;
    private com.toedter.calendar.JDateChooser dtcFechaInicio;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCentro;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JPanel pnlRepCentroC;
    private javax.swing.JScrollPane slpRepCentro;
    private javax.swing.JTable tblRepCentro;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
