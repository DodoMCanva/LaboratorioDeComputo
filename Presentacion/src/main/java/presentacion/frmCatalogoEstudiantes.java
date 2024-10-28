package presentacion;

import BO.BOException;
import BO.EstudianteBO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class frmCatalogoEstudiantes extends javax.swing.JFrame {

    private int pag = 0;
    private final static int LIMITE = 10;
    private EstudianteBO estudianteBO = new EstudianteBO();

    public frmCatalogoEstudiantes() {
        initComponents();

        cargarTabla();
        cargarConfiguracionInicialTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplCatalogoEstudiantes = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnAgregarEst = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblNumPagina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catálogo Estudiantes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplCatalogoEstudiantes.setBackground(new java.awt.Color(236, 236, 236));
        jplCatalogoEstudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jplCatalogoEstudiantes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jplCatalogoEstudiantes.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Carrera", "Contraseña", "Estatus", "Editar", "Eliminar"
            }
        ));
        jScrollPane1.setViewportView(tblEstudiantes);

        jplCatalogoEstudiantes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 790, 230));
        jplCatalogoEstudiantes.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 580, 30));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jplCatalogoEstudiantes.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, 30));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setText("Estudiantes");
        jplCatalogoEstudiantes.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        btnAgregarEst.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgregarEst.setText("Agregar");
        btnAgregarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstActionPerformed(evt);
            }
        });
        jplCatalogoEstudiantes.add(btnAgregarEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 110, 30));

        btnAtras.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jplCatalogoEstudiantes.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, 25));

        btnSiguiente.setBackground(new java.awt.Color(153, 153, 153));
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jplCatalogoEstudiantes.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, 25));

        lblNumPagina.setText("Pagina 1");
        jplCatalogoEstudiantes.add(lblNumPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, 25));

        getContentPane().add(jplCatalogoEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmMenuAdministrador volver = new frmMenuAdministrador();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstActionPerformed
        frmAgregarEstudiante ir = new frmAgregarEstudiante();
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarEstActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (pag > 0) {
            this.pag--;
            lblNumPagina.setText("Página " + (pag + 1));
            cargarTabla();
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        this.pag++;
        lblNumPagina.setText("Página " + (pag + 1));
        cargarTabla();
    }//GEN-LAST:event_btnSiguienteActionPerformed

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
            Tabla filtro = obtenerFiltrosTabla();
            borrarRegistrosTabla();
            agregarRegistrosTabla(filtro);
        } catch (BOException ex) {
            borrarRegistrosTabla();
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarRegistrosTabla(Tabla filtro) throws BOException {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblEstudiantes.getModel();
        estudianteBO.obtenerEstudiantes(filtro).forEach(row -> {
            Object[] fila = new Object[7];
            String nombreCompelto = row.getNombre() + " " + row.getApellidoPaterno() + " " + row.getApellidoMaterno();
            fila[0] = row.getEstudiante_ID();
            fila[1] = nombreCompelto;
            fila[2] = row.getCarrera().getNombre();
            fila[3] = row.getContraseña();
            fila[4] = row.isEstaEgresado();
            fila[5] = "Eliminar";
            fila[6] = "Eliminar";
            modeloTabla.addRow(fila);
        });
    }

    private void cargarTablaBusqueda(String nombre) {
        try {
            Tabla filtro = this.obtenerFiltrosTabla();
            borrarRegistrosTabla();
            lblNumPagina.setText("Página " + (pag + 1));
            if (this.estudianteBO.buscarporNombre(nombre, filtro).isEmpty() && pag > 0) {
                pag--;
                cargarTabla();
            } else {
                agregarRegistrosTablaBusqueda(nombre, filtro);
            }
        } catch (BOException ex) {
            borrarRegistrosTabla();
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarRegistrosTablaBusqueda(String nombre, Tabla filtro) throws BOException {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblEstudiantes.getModel();
        estudianteBO.obtenerEstudiantes(filtro).forEach(row -> {
            Object[] fila = new Object[7];
            String nombreCompelto = row.getNombre() + " " + row.getApellidoPaterno() + " " + row.getApellidoMaterno();
            fila[0] = row.getEstudiante_ID();
            fila[1] = nombreCompelto;
            fila[2] = row.getCarrera().getNombre();
            fila[3] = row.getContraseña();
            fila[4] = row.isEstaEgresado();
            fila[5] = "Eliminar";
            fila[6] = "Eliminar";
            modeloTabla.addRow(fila);
        });
    }

    private void cargarConfiguracionInicialTabla() {
    TableColumnModel modeloColumnas = tblEstudiantes.getColumnModel();

    ActionListener onEditarClickListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            long idSeleccionado = getIdSeleccionadoTabla(); // Obtener ID del estudiante seleccionado
            if (idSeleccionado != 0) { // Verifica que haya un estudiante seleccionado
                frmAgregarEstudiante editarEstudiante = new frmAgregarEstudiante(idSeleccionado);
                editarEstudiante.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(frmCatalogoEstudiantes.this, "Por favor selecciona un estudiante para editar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    };
    modeloColumnas.getColumn(5).setCellRenderer(new JButtonRenderer("Editar"));
    modeloColumnas.getColumn(5).setCellEditor(new JButtonCellEditor("Editar", onEditarClickListener));

    ActionListener onEliminarClickListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int id = getIdSeleccionadoTabla();
            if (id != 0) {
                estudianteBO.eliminar(Long.valueOf(id));
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(frmCatalogoEstudiantes.this, "Por favor selecciona un estudiante para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    };
    modeloColumnas.getColumn(6).setCellRenderer(new JButtonRenderer("Eliminar"));
    modeloColumnas.getColumn(6).setCellEditor(new JButtonCellEditor("Eliminar", onEliminarClickListener));
}

    private int getIdSeleccionadoTabla() {
        int idS = 0;
        int indiceFilaSeleccionada = this.tblEstudiantes.getSelectedRow();
        if (indiceFilaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) this.tblEstudiantes.getModel();
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

    private void borrarRegistrosTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblEstudiantes.getModel();
        modeloTabla.setRowCount(0);
    }

    public void editar(Long id) {
        frmAgregarEstudiante ir = new frmAgregarEstudiante(id);
        ir.setVisible(true);
        this.dispose();
    }

    private Tabla obtenerFiltrosTabla() {
        return new Tabla(this.LIMITE, this.pag, txtBuscar.getText());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEst;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jplCatalogoEstudiantes;
    private javax.swing.JLabel lblNumPagina;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
