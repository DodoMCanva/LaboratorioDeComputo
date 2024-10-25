package presentacion;

import BO.BOException;
import BO.CentroLaboratorioBO;
import DTOLabComputo.centroLabDTO;
import java.awt.List;
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
public class frmCatalogoLaboratorio extends javax.swing.JFrame {

    private int pag = 0;
    private final static int LIMITE = 10;
    private CentroLaboratorioBO clBO = new CentroLaboratorioBO();

    public frmCatalogoLaboratorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplCatalogoLaboratorio = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLaboratorio = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnAgregarLab = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblNumPagina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catálogo Laboratorio de Cómputo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplCatalogoLaboratorio.setBackground(new java.awt.Color(236, 236, 236));
        jplCatalogoLaboratorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jplCatalogoLaboratorio.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tblLaboratorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Hora inicio", "Hora fin", "Campus", "Ordenadores", "Editar", "Eliminar"
            }
        ));
        jScrollPane1.setViewportView(tblLaboratorio);

        jplCatalogoLaboratorio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 790, 260));
        jplCatalogoLaboratorio.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 580, 30));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        jplCatalogoLaboratorio.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, 30));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setText("Laboratorio Cómputo");
        jplCatalogoLaboratorio.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        btnAgregarLab.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgregarLab.setText("Agregar");
        btnAgregarLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLabActionPerformed(evt);
            }
        });
        jplCatalogoLaboratorio.add(btnAgregarLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 110, 30));

        btnAtras.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jplCatalogoLaboratorio.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, 25));

        btnSiguiente.setBackground(new java.awt.Color(153, 153, 153));
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jplCatalogoLaboratorio.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, 25));

        lblNumPagina.setText("numPagina");
        jplCatalogoLaboratorio.add(lblNumPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, 25));

        getContentPane().add(jplCatalogoLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmMenuAdministrador volver = new frmMenuAdministrador();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLabActionPerformed
        frmAgregarLaboratorio ir = new frmAgregarLaboratorio();
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarLabActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtrasActionPerformed
    /*
    private void cargarTabla() {
        try {
            Tabla filtro = this.obtenerFiltrosTabla();
            List<centroLabDTO> Lista = this.clBO.obtenerLaboratoriosTabla(filtro);
            this.BorrarRegistrosTabla();
            this.AgregarRegistrosTabla(Lista);
            if (Lista.size() == 0 && pag > 0) {
                pag--;
            }
            lblNumPagina.setText("Página " + (pag + 1));
        } catch (BOException ex) {
            this.BorrarRegistrosTabla();
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarRegistrosTabla(List<centroLabDTO> lista) {
        if (lista == null) {
            return;
        }
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblLaboratorio.getModel();
        lista.forEach(row -> {
            Object[] fila = new Object[5];
            String direccion = row.getCalle() + " " + row.getCodigoPostal() + ", " + row.getCiudad() + ", " + row.getEstado();
            fila[0] = row.getNombre();
            fila[1] = direccion;
            fila[2] = "Función";  // Texto del botón de función
            fila[3] = "Salas";    // Texto del botón de salas
            fila[4] = "Eliminar"; // Texto del botón de eliminar
            modeloTabla.addRow(fila);
        });
    }
     */
    private void BorrarRegistrosTablaClientes() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblLaboratorio.getModel();
        if (modeloTabla.getRowCount() > 0) {
            for (int row = modeloTabla.getRowCount() - 1; row > -1; row--) {
                modeloTabla.removeRow(row);
            }
        }
    }

    private void cargarConfiguracionInicialTabla() {
        TableColumnModel modeloColumnas = this.tblLaboratorio.getColumnModel();
        ActionListener onOrdenadoresClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*IConexionBD conexionBD = new ConexionBD();
                IFuncionDAO funcionDAO = new FuncionDAO(conexionBD);
                int n = 0;
                try {
                    n = obtener();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(frmCatalogoLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
                }
                frmCatalogoFunciones catalogoFunciones = new frmCatalogoFunciones(n);
                catalogoFunciones.setVisible(true);
                dispose();
                 */
            }
        };
        modeloColumnas.getColumn(4).setCellRenderer(new JButtonRenderer("Ordenadores"));
        modeloColumnas.getColumn(4).setCellEditor(new JButtonCellEditor("Ordenadores", onOrdenadoresClickListener));

        // Configurar botón "Salas"
        ActionListener onEditarClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*IConexionBD conexionBD = new ConexionBD();
                ISalaDAO salaDAO = new SalaDAO(conexionBD);
                int n = 0;
                try {
                    n = obtener();
                } catch (PersistenciaException ex) {
                    Logger.getLogger(frmCatalogoSucursales.class.getName()).log(Level.SEVERE, null, ex);
                }
                frmCatalogoSalas catalogoSalas = new frmCatalogoSalas(n);
                catalogoSalas.setVisible(true);
                dispose();
                 */
            }

        };
        modeloColumnas.getColumn(5).setCellRenderer(new JButtonRenderer("Editar"));
        modeloColumnas.getColumn(5).setCellEditor(new JButtonCellEditor("Editar", onEditarClickListener));

        // Configurar botón "Eliminar"
        ActionListener onEliminarClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    eliminar();
                } catch (Exception ex) {
                    Logger.getLogger(frmCatalogoLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        modeloColumnas.getColumn(6).setCellRenderer(new JButtonRenderer("Eliminar"));
        modeloColumnas.getColumn(6).setCellEditor(new JButtonCellEditor("Eliminar", onEliminarClickListener));
    }

    private void eliminar() throws BOException {
        long id = this.getIdSeleccionadoTabla();
        clBO.eliminar(id);
        //cargarTabla();
    }

    private int obtener() {
        return this.getIdSeleccionadoTabla();
    }

    private int getIdSeleccionadoTabla()  {

        //SucursalDAO sucursalDAO = new SucursalDAO();
        int idS = 0;
        int indiceFilaSeleccionada = this.tblLaboratorio.getSelectedRow();
        if (indiceFilaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) this.tblLaboratorio.getModel();
            int indiceColumnaId = 0;
            String idSocioSeleccionado = (String) modelo.getValueAt(indiceFilaSeleccionada, indiceColumnaId);
            //idS = sucursalDAO.buscarIdporNombre(idSocioSeleccionado);
            return idS;

        } else {
            return 0;
        }
    }

    private void BorrarRegistrosTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblLaboratorio.getModel();
        if (modeloTabla.getRowCount() > 0) {
            for (int row = modeloTabla.getRowCount() - 1; row > -1; row--) {
                modeloTabla.removeRow(row);
            }
        }
    }

    private Tabla obtenerFiltrosTabla() {
        return new Tabla(this.LIMITE, this.pag, txtBuscar.getText());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLab;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jplCatalogoLaboratorio;
    private javax.swing.JLabel lblNumPagina;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblLaboratorio;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
