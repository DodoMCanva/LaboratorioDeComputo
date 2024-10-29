package presentacion;

import BO.BOException;
import BO.CentroLaboratorioBO;
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
        cargarTabla();
        cargarConfiguracionInicialTabla();
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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Hora inicio", "Hora fin", "Campus", "Nombre", "Ordenadores", "Editar", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLaboratorio);

        jplCatalogoLaboratorio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 790, 260));
        jplCatalogoLaboratorio.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 580, 30));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jplCatalogoLaboratorio.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 90, 70, 30));

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
        this.pag++;
        int imp = pag + 1;
        lblNumPagina.setText("Página " + imp);
        this.cargarTabla();
        btnAtras.setEnabled(true);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (pag == 0) {
            btnAtras.setEnabled(false);
        } else {
            this.pag--;
            int impresion = pag + 1;
            lblNumPagina.setText("Página " + impresion);
            this.cargarTabla();
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombre = txtBuscar.getText();
        if (!nombre.isEmpty()) {
            this.cargarTablaBusqueda(nombre);
        } else {
            this.dispose();
            frmCatalogoLaboratorio c = new frmCatalogoLaboratorio();
            c.setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cargarTabla() {
        try {
            Tabla filtro = this.obtenerFiltrosTabla();
            BorrarRegistrosTabla();
            agregarRegistrosTabla(filtro);
            lblNumPagina.setText("Página " + (pag + 1));
            if (this.clBO.obtenerLaboratoriosTabla(filtro).isEmpty() && pag > 0) {
                pag--;
                cargarTabla();
            }
        } catch (BOException ex) {
            BorrarRegistrosTabla();
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarRegistrosTabla(Tabla filtro) throws BOException {
        if (this.clBO.obtenerLaboratoriosTabla(filtro) == null) {
            return;
        }
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblLaboratorio.getModel();
        this.clBO.obtenerLaboratoriosTabla(filtro).forEach(row -> {
            Object[] fila = new Object[8];
            fila[0] = row.getCentroLab_ID();
            fila[1] = row.getHoraInicio();
            fila[2] = row.getHoraFin();
            fila[3] = row.getCampus();
            fila[4] = row.getNombre();
            fila[5] = "Ordenadores";
            fila[6] = "Editar";
            fila[7] = "Eliminar";
            modeloTabla.addRow(fila);
        });
    }

    private void cargarTablaBusqueda(String nombre) {
        try {
            Tabla filtro = this.obtenerFiltrosTabla();
            BorrarRegistrosTabla();
            lblNumPagina.setText("Página " + (pag + 1));
            if (this.clBO.buscarporNombre(nombre, filtro).isEmpty() && pag > 0) {
                pag--;
                cargarTabla();
            }else{
                agregarRegistrosTablaBusqueda(nombre, filtro);
            }
        } catch (BOException ex) {
            BorrarRegistrosTabla();
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarRegistrosTablaBusqueda(String nombre, Tabla filtro) throws BOException {
        if (this.clBO.buscarporNombre(nombre, filtro)== null) {
            return;
        }
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblLaboratorio.getModel();
        this.clBO.buscarporNombre(nombre, filtro).forEach(row -> {
            Object[] fila = new Object[8];
            fila[0] = row.getCentroLab_ID();
            fila[1] = row.getHoraInicio();
            fila[2] = row.getHoraFin();
            fila[3] = row.getCampus();
            fila[4] = row.getNombre();
            fila[5] = "Ordenadores";
            fila[6] = "Editar";
            fila[7] = "Eliminar";
            modeloTabla.addRow(fila);
        });
    }

    private void cargarConfiguracionInicialTabla() {
        TableColumnModel modeloColumnas = this.tblLaboratorio.getColumnModel();
        ActionListener onOrdenadoresClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = getIdSeleccionadoTabla();
                Ordenadores(Long.valueOf(id));

            }
        };
        modeloColumnas.getColumn(5).setCellRenderer(new JButtonRenderer("Ordenadores"));
        modeloColumnas.getColumn(5).setCellEditor(new JButtonCellEditor("Ordenadores", onOrdenadoresClickListener));

        ActionListener onEditarClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = getIdSeleccionadoTabla();
                editar(Long.valueOf(id));
            }

        };
        modeloColumnas.getColumn(6).setCellRenderer(new JButtonRenderer("Editar"));
        modeloColumnas.getColumn(6).setCellEditor(new JButtonCellEditor("Editar", onEditarClickListener));

        ActionListener onEliminarClickListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = getIdSeleccionadoTabla();
                    clBO.eliminar(Long.valueOf(id));
                    cargarTabla();
                } catch (BOException ex) {
                    Logger.getLogger(frmCatalogoLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        modeloColumnas.getColumn(7).setCellRenderer(new JButtonRenderer("Eliminar"));
        modeloColumnas.getColumn(7).setCellEditor(new JButtonCellEditor("Eliminar", onEliminarClickListener));
    }

    private int getIdSeleccionadoTabla() {
        int idS = 0;
        int indiceFilaSeleccionada = this.tblLaboratorio.getSelectedRow();
        if (indiceFilaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) this.tblLaboratorio.getModel();
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
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblLaboratorio.getModel();
        if (modeloTabla.getRowCount() > 0) {
            for (int row = modeloTabla.getRowCount() - 1; row > -1; row--) {
                modeloTabla.removeRow(row);
            }
        }
    }

    public void editar(Long id) {
        frmAgregarLaboratorio ir = new frmAgregarLaboratorio(id);
        ir.setVisible(true);
        this.dispose();
    }

    public void Ordenadores(Long id) {
        frmCatalogoOrdenadores ir = new frmCatalogoOrdenadores(id);
        ir.setVisible(true);
        this.dispose();
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
