package presentacion;

import BO.BOException;
import BO.CentroLaboratorioBO;
import BO.ComputadoraBO;
import DTOLabComputo.computadoraDTO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo 3
 */
public class frmAgregarOrdenador extends javax.swing.JFrame {

    private Long idc = null;
    private CentroLaboratorioBO clbo = new CentroLaboratorioBO();
    private ComputadoraBO cbo = new ComputadoraBO();

    public frmAgregarOrdenador(Long idc) {
        initComponents();
        this.idc = idc;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplInfOrdenadores = new javax.swing.JPanel();
        lblIp = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtIp = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        cboxTipo = new javax.swing.JComboBox<>();
        lblNumero1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agrefar Inf. Ordenadores");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplInfOrdenadores.setBackground(new java.awt.Color(236, 236, 236));
        jplInfOrdenadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblIp.setText("IP:");
        jplInfOrdenadores.add(lblIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 20, 30));

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNumero.setText("Tipo:");
        jplInfOrdenadores.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 40, 30));

        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jplInfOrdenadores.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 240, 30));

        txtIp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIp.setToolTipText("");
        jplInfOrdenadores.add(txtIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 240, 30));

        btnGuardar.setBackground(new java.awt.Color(102, 204, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jplInfOrdenadores.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 120, 30));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setText("Agregar Ordenador");
        jplInfOrdenadores.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jplInfOrdenadores.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cboxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativa", "Seleccion", "Estudiantil" }));
        jplInfOrdenadores.add(cboxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 230, 30));

        lblNumero1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNumero1.setText("Número:");
        jplInfOrdenadores.add(lblNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 70, 30));

        getContentPane().add(jplInfOrdenadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        computadoraDTO nueva = new computadoraDTO();
        nueva.setIP(txtIp.getText());
        nueva.setNumeroPC(Integer.parseInt(txtNumero.getText()));
        nueva.setTipoUsuario(cboxTipo.getSelectedItem().toString());
        try {
            nueva.setCentro(clbo.consultar(idc));
            cbo.guardar(idc, nueva);
        } catch (BOException ex) {
            Logger.getLogger(frmAgregarOrdenador.class.getName()).log(Level.SEVERE, null, ex);
        }

        frmCatalogoOrdenadores ir = new frmCatalogoOrdenadores(idc);
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmCatalogoOrdenadores volver = new frmCatalogoOrdenadores(idc);
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboxTipo;
    private javax.swing.JPanel jplInfOrdenadores;
    private javax.swing.JLabel lblIp;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
