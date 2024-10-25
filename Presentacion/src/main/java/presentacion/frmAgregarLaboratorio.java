package presentacion;

import BO.BOException;
import BO.CentroLaboratorioBO;
import DTOLabComputo.centroLabDTO;
import java.time.LocalTime;

/**
 *
 * @author Equipo 3
 */
public class frmAgregarLaboratorio extends javax.swing.JFrame {

    public frmAgregarLaboratorio() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplInfLaboratorios = new javax.swing.JPanel();
        lblHoraInicio = new javax.swing.JLabel();
        lblHoraFin = new javax.swing.JLabel();
        lblCampus = new javax.swing.JLabel();
        txtHoraFin = new javax.swing.JTextField();
        txtMinutosFin = new javax.swing.JTextField();
        cbxCampus = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        txtMinutosInicio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agrefar Inf. Laboratorios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplInfLaboratorios.setBackground(new java.awt.Color(236, 236, 236));
        jplInfLaboratorios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHoraInicio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblHoraInicio.setText("Hora Inicio:");
        jplInfLaboratorios.add(lblHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 80, 30));

        lblHoraFin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblHoraFin.setText("Hora fin:");
        jplInfLaboratorios.add(lblHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 60, 30));

        lblCampus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCampus.setText("Campus:");
        jplInfLaboratorios.add(lblCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 60, 30));

        txtHoraFin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jplInfLaboratorios.add(txtHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 40, 30));

        txtMinutosFin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMinutosFin.setToolTipText("");
        jplInfLaboratorios.add(txtMinutosFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 40, 30));

        cbxCampus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Campus Obregón Náinari", "Campus Obregón Centro", "Campus Navojoa", "Campus Guaymas", "Campus Empalme" }));
        jplInfLaboratorios.add(cbxCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 240, 30));

        btnGuardar.setBackground(new java.awt.Color(102, 204, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jplInfLaboratorios.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 120, 30));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setText("Agregar Laboratorio");
        jplInfLaboratorios.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jplInfLaboratorios.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setText(":");
        jplInfLaboratorios.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 20, -1));

        jLabel2.setText(":");
        jplInfLaboratorios.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 20, -1));

        txtHoraInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHoraInicio.setToolTipText("");
        jplInfLaboratorios.add(txtHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 40, 30));

        txtMinutosInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMinutosInicio.setToolTipText("");
        jplInfLaboratorios.add(txtMinutosInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 40, 30));

        getContentPane().add(jplInfLaboratorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
        frmCatalogoLaboratorio ir = new frmCatalogoLaboratorio();
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmCatalogoLaboratorio volver = new frmCatalogoLaboratorio();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    public void guardar() {
        centroLabDTO lab = new centroLabDTO();
        String horaInicio = txtHoraInicio.getText(); 
        String minutosInicio = txtMinutosInicio.getText();
        LocalTime inicio = LocalTime.of(Integer.parseInt(horaInicio), Integer.parseInt(minutosInicio));
        String horaFin = txtHoraFin.getText(); 
        String minutosFin = txtMinutosFin.getText();
        LocalTime fin = LocalTime.of(Integer.parseInt(horaFin), Integer.parseInt(minutosFin));
        lab.setCampus(cbxCampus.getSelectedItem().toString());
        lab.setHoraInicio(inicio);
        lab.setHoraInicio(fin);
        
        CentroLaboratorioBO cl = new CentroLaboratorioBO();
        try {
            cl.guardar(lab);
        } catch (BOException e) {
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxCampus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jplInfLaboratorios;
    private javax.swing.JLabel lblCampus;
    private javax.swing.JLabel lblHoraFin;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtMinutosFin;
    private javax.swing.JTextField txtMinutosInicio;
    // End of variables declaration//GEN-END:variables
}
