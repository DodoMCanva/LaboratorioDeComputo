package presentacion;

/**
 *
 * @author Valeria
 */
public class frmMenuAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuAdministrador
     */
    public frmMenuAdministrador() {
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

        jplMenuAdm = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btbReportes = new javax.swing.JButton();
        btnEstudiantes = new javax.swing.JButton();
        btnLabComputo = new javax.swing.JButton();
        btnBloqueos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Adminstrador");
        setPreferredSize(new java.awt.Dimension(630, 490));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplMenuAdm.setBackground(new java.awt.Color(236, 236, 236));
        jplMenuAdm.setToolTipText("");
        jplMenuAdm.setName(""); // NOI18N
        jplMenuAdm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setText("Seleccione que desea administrar");
        jplMenuAdm.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 350, -1));

        btbReportes.setBackground(new java.awt.Color(102, 204, 255));
        btbReportes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btbReportes.setText("Reportes");
        btbReportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jplMenuAdm.add(btbReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 200, 50));

        btnEstudiantes.setBackground(new java.awt.Color(102, 204, 255));
        btnEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEstudiantes.setText("Estudiantes");
        btnEstudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiantesActionPerformed(evt);
            }
        });
        jplMenuAdm.add(btnEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 200, 50));

        btnLabComputo.setBackground(new java.awt.Color(102, 204, 255));
        btnLabComputo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLabComputo.setText("Laboratorio Computo");
        btnLabComputo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnLabComputo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabComputoActionPerformed(evt);
            }
        });
        jplMenuAdm.add(btnLabComputo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 200, 50));

        btnBloqueos.setBackground(new java.awt.Color(102, 204, 255));
        btnBloqueos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnBloqueos.setText("Bloqueos");
        btnBloqueos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jplMenuAdm.add(btnBloqueos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 200, 50));

        getContentPane().add(jplMenuAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLabComputoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabComputoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLabComputoActionPerformed

    private void btnEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiantesActionPerformed
        frmCatalogoEstudiantes ir = new frmCatalogoEstudiantes();
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEstudiantesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbReportes;
    private javax.swing.JButton btnBloqueos;
    private javax.swing.JButton btnEstudiantes;
    private javax.swing.JButton btnLabComputo;
    private javax.swing.JPanel jplMenuAdm;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
