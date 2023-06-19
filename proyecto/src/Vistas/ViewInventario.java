/*
 Consultar inventario: Los usuarios podrán ver la lista de productos disponibles en el inventario, así como buscar productos 
por nombre o categoría y ver su información detallada
 */
package Vistas;

import AccesoADatos.*;
import Clases.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ViewInventario extends javax.swing.JInternalFrame {

    private ProductoData productoData = new ProductoData();
    private DefaultTableModel modelo = new DefaultTableModel();

    public ViewInventario() {
        initComponents();
        armarCabecera();
        llenarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInventario = new javax.swing.JTable();
        jbtnSalir = new javax.swing.JButton();
        jrbActivos = new javax.swing.JRadioButton();
        jrbInactivos = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("INVENTARIO");

        jtInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtInventario);

        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jrbActivos.setText("PRODUCTOS ACTIVOS");
        jrbActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivosActionPerformed(evt);
            }
        });

        jrbInactivos.setText("PRODUCTOS INACTIVOS");
        jrbInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnSalir)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(jrbActivos)
                                    .addGap(35, 35, 35)
                                    .addComponent(jrbInactivos))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbActivos)
                    .addComponent(jrbInactivos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jbtnSalir)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jrbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivosActionPerformed
        // TODO add your handling code here:
        jrbActivos.setSelected(false);
        jrbInactivos.setSelected(true);
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jrbInactivosActionPerformed

    private void jrbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivosActionPerformed
        // TODO add your handling code here:
        jrbActivos.setSelected(true);
        jrbInactivos.setSelected(false);
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jrbActivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JRadioButton jrbActivos;
    private javax.swing.JRadioButton jrbInactivos;
    private javax.swing.JTable jtInventario;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {
        ArrayList<Object> titulos = new ArrayList();
        titulos.add("Id Producto");
        titulos.add("Nombre");
        titulos.add("Precio");
        titulos.add("Stock");
        for (Object titulo : titulos)
        {
            modelo.addColumn(titulo);
        }
        jtInventario.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = modelo.getRowCount() - 1;//le pide al modelo la cantidad de filas menos 1 ya que va de 0

        for (int i = filas; i >= 0; i--)
        {
            modelo.removeRow(i);
        }
    }

    private void llenarTabla() {
        List<Producto> todos = productoData.listaDeProductos();
//           
        if (jrbInactivos.isSelected())
        {
            List<Producto> productoStock = productoData.listaDeProductosInactivos();
            for (Producto p : productoStock)
            {
                modelo.addRow(new Object[]
                {
                    p.getIdProducto(), p.getDescripcion(), p.getPrecioActual(), p.getStock()
                });

            }
        } else if (jrbActivos.isSelected())
        {
            List<Producto> productoStock = productoData.listaDeProductosActivos();
            for (Producto p : productoStock)
            {
                modelo.addRow(new Object[]
                {
                    p.getIdProducto(), p.getDescripcion(), p.getPrecioActual(), p.getStock()
                });
            }
        }
    }
}
