package presentacion;

import DTOLabComputo.EstudianteDTO;
import DTOLabComputo.computadoraDTO;
import java.awt.HeadlessException;

/**
 *
 * @author Equipo 3
 */
public class frmConfirmacion extends javax.swing.JFrame {
    private Long ide, idCentro;
    /**
     * Creates new form frmConfirmacion
     */
    public frmConfirmacion(computadoraDTO comp, EstudianteDTO est, Long idcentro) {
        initComponents();
        setSize(603, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        this.ide = est.getEstudiante_ID();
        this.idCentro = idcentro;
    }

    public frmConfirmacion()  {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPC = new javax.swing.JLabel();
        btnConfirmacion = new javax.swing.JButton();
        btnSoftware = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNumPC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Computadora seleccionada");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipoazul.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Numero:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 100, 30));

        lblPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compuITson.png"))); // NOI18N
        jPanel1.add(lblPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        btnConfirmacion.setBackground(new java.awt.Color(51, 153, 255));
        btnConfirmacion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnConfirmacion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmacion.setText("Confirmar Seleccion");
        btnConfirmacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        btnSoftware.setBackground(new java.awt.Color(51, 153, 255));
        btnSoftware.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSoftware.setForeground(new java.awt.Color(255, 255, 255));
        btnSoftware.setText("Software");
        btnSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoftwareActionPerformed(evt);
            }
        });
        jPanel1.add(btnSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, 40));

        jLabel2.setText("Para ver el software que tiene esta PC ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel4.setText("da click aqui");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        lblNumPC.setText("Numero PC");
        jPanel1.add(lblNumPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoftwareActionPerformed
        frmSoftwareVista sf = new frmSoftwareVista();
        sf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSoftwareActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmSeleccionPC sel = new frmSeleccionPC(this.ide, this.idCentro);
        sel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnConfirmacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmacionActionPerformed
        crearSesion();
        frmApartadaExito ex = new frmApartadaExito();
        ex.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnConfirmacionActionPerformed

    private void crearSesion(){
    
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmacion;
    private javax.swing.JButton btnSoftware;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNumPC;
    private javax.swing.JLabel lblPC;
    // End of variables declaration//GEN-END:variables
}
