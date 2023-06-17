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
        cargaProductos();
        armarCabecera();
        llenarTabla();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInventario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jbtnBuscar = new javax.swing.JButton();
        jtfProductoBuscado = new javax.swing.JTextField();
        jcbProductos = new javax.swing.JComboBox<>();
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

        jLabel2.setText("PRODUCTO");

        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jtfProductoBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProductoBuscadoActionPerformed(evt);
            }
        });

        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jrbActivos.setText("ACTIVOS");
        jrbActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivosActionPerformed(evt);
            }
        });

        jrbInactivos.setText("INACTIVOS");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfProductoBuscado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jcbProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(25, 25, 25)
                        .addComponent(jbtnBuscar)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(639, Short.MAX_VALUE)
                        .addComponent(jbtnSalir)))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jrbActivos)
                        .addGap(177, 177, 177)
                        .addComponent(jrbInactivos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbtnBuscar)
                    .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jtfProductoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbActivos)
                    .addComponent(jrbInactivos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnSalir)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfProductoBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProductoBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProductoBuscadoActionPerformed

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

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jrbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivosActionPerformed
        // TODO add your handling code here:
        jrbActivos.setSelected(true);
        jrbInactivos.setSelected(false);
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jrbActivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<Producto> jcbProductos;
    private javax.swing.JRadioButton jrbActivos;
    private javax.swing.JRadioButton jrbInactivos;
    private javax.swing.JTable jtInventario;
    private javax.swing.JTextField jtfProductoBuscado;
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

        private void cargaProductos() {
        jcbProductos.removeAllItems();
        List<Producto> productos= productoData.listaDeProductos();
        for(Producto item: productos){
            jcbProductos.addItem(item);
        }      
    }
        
        private void borrarFilas() {
        int filas=modelo.getRowCount()-1;//le pide al modelo la cantidad de filas menos 1 ya que va de 0
        
        for (int i = filas; i >=0; i--)
        {
            modelo.removeRow(i);
        }    }
        
        
        private void llenarTabla(){
            Producto producto=(Producto) jcbProductos.getSelectedItem();
            List<Producto> todos = productoData.listaDeProductos();
//            for (Producto p : todos) {
//                        modelo.addRow(new Object[]
//                                {
//                                    p.getIdProducto(),p.getDescripcion(),p.getPrecioActual(),p.getStock()
//                                });
//                    }
            
            
            if(jrbInactivos.isSelected()){
                List<Producto> productoStock = productoData.listaDeProductosInactivos();
                for(Producto p : productoStock){
                    modelo.addRow(new Object[]{p.getIdProducto(),p.getDescripcion(),p.getPrecioActual(),p.getStock()});
                    
                }
            }else if(jrbActivos.isSelected()){
                    List<Producto> productoStock = productoData.listaDeProductosActivos();
                    for (Producto p : productoStock) {
                        modelo.addRow(new Object[]{p.getIdProducto(),p.getDescripcion(),p.getPrecioActual(),p.getStock()});
                    }
                  }
        }
}
