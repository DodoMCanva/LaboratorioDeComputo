package presentacion;

import BO.BOException;
import BO.ComputadoraBO;
import BO.EstudianteBO;
import DTOLabComputo.computadoraDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import utilerias.JButtonCellEditor;
import utilerias.JButtonRenderer;
import utilerias.Tabla;

/**
 *
 * @author Equipo 3
 */
public class frmSeleccionPC extends javax.swing.JFrame {

    private Long idE, idC, idCentro;
    private int pag = 0;
    private final static int LIMITE = 8;
    private ComputadoraBO cBO = new ComputadoraBO();
    private EstudianteBO eBO = new EstudianteBO();

    public frmSeleccionPC(Long idE, Long idCentro) {
        initComponents();
        setSize(603, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        cargarConfiguracionInicialTabla();
        cargarTabla();
        this.idE = idE;
        this.idCentro = 1L;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompus = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipoazul.png"))); // NOI18N
        lblLogo.setText("jLabel8");
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Selecciona tu computadora");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        tblCompus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "ID", "Computadora", "Seleccionar"
            }
        ));
        jScrollPane1.setViewportView(tblCompus);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 540, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        frmInicioSesionEstudiante ini = new frmInicioSesionEstudiante();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cargarTabla() {
        /*try {
            Tabla filtro = this.obtenerFiltrosTabla();
            BorrarRegistrosTabla();
            agregarRegistrosTabla(filtro);
            if (this.cBO.obtenerComputadorasTablaSeleccion(idC, filtro).isEmpty() && pag > 0) {
                pag--;
                cargarTabla();
            }
        } catch (BOException ex) {
            BorrarRegistrosTabla();
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }*/
    }

    private void agregarRegistrosTabla(Tabla filtro) throws BOException {
        if (this.cBO.obtenerComputadorasTabla(idC, filtro) == null) {
            return;
        }
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblCompus.getModel();
        this.cBO.obtenerComputadorasTabla(idC, filtro).forEach(row -> {
            Object[] fila = new Object[3];
            fila[0] = row.getComputadora_ID();
            fila[1] = row.getNumeroPC();
            fila[2] = "Seleccionar";
            modeloTabla.addRow(fila);
        });
    }

    private void cargarConfiguracionInicialTabla() {
        TableColumnModel modeloColumnas = this.tblCompus.getColumnModel();
        ActionListener onEliminarClickListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = getIdSeleccionadoTabla();
                    seleccionar(cBO.consultar(Long.valueOf(id)));
                } catch (BOException ex) {
                    Logger.getLogger(frmCatalogoLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        modeloColumnas.getColumn(2).setCellRenderer(new JButtonRenderer("Seleccionar"));
        modeloColumnas.getColumn(2).setCellEditor(new JButtonCellEditor("Seleccionar", onEliminarClickListener));
    }

    private int getIdSeleccionadoTabla() {
        int idS = 0;
        int indiceFilaSeleccionada = this.tblCompus.getSelectedRow();
        if (indiceFilaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) this.tblCompus.getModel();
            int indiceColumnaId = 0;
            Object idSeleccionado = modelo.getValueAt(indiceFilaSeleccionada, indiceColumnaId);
            try {
                if (idSeleccionado instanceof Integer) {
                    idS = (Integer) idSeleccionado;
                } else if (idSeleccionado instanceof Long) {
                    idS = ((Long) idSeleccionado).intValue(); // Convierte Long a int
                } else if (idSeleccionado instanceof String) {
                    idS = Integer.parseInt((String) idSeleccionado);
                } else {
                    System.out.println("Tipo de dato inesperado para el ID: " + idSeleccionado.getClass().getName());
                }
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir ID: " + e.getMessage());
            }
        }
        return idS;
    }

    private void BorrarRegistrosTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblCompus.getModel();
        if (modeloTabla.getRowCount() > 0) {
            for (int row = modeloTabla.getRowCount() - 1; row > -1; row--) {
                modeloTabla.removeRow(row);
            }
        }
    }

    public void seleccionar(computadoraDTO com) {
        frmConfirmacion ir = new frmConfirmacion(com, eBO.consultar(idE), idCentro);
        ir.setVisible(true);
        this.dispose();
    }

    private Tabla obtenerFiltrosTabla() {
        return new Tabla(this.LIMITE, this.pag, "");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTable tblCompus;
    // End of variables declaration//GEN-END:variables
}
