
package Vistas;

import AccesoADatos.*;
import Clases.*;
import javax.swing.JOptionPane;


public class ViewProducto extends javax.swing.JInternalFrame {

    private ProductoData productoData;
    
    public ViewProducto() {
        this.productoData = null;
        initComponents();
        
        this.productoData = new ProductoData();
        jbtnLimpiar.setEnabled(true);
        jbtnBaja.setEnabled(true);
        jtfIdProducto.setEditable(false);
        jtfEstado.setEditable(false);
        jbtnModificar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlPrecio = new javax.swing.JLabel();
        jlStock = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jtfStock = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jtfDescripcion = new javax.swing.JTextField();
        jbtnGuardar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnBaja = new javax.swing.JButton();
        jbtnAlta = new javax.swing.JButton();
        jtfIdProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfEstado = new javax.swing.JTextField();
        jbtnBuscar = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("PRODUCTOS");

        jlPrecio.setText("PRECIO");

        jlStock.setText("STOCK");

        jLNombre.setText("NOMBRE");

        jbtnGuardar.setText("GUARDAR");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jbtnLimpiar.setText("LIMPIAR");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnBaja.setText("BAJA");
        jbtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBajaActionPerformed(evt);
            }
        });

        jbtnAlta.setText("ALTA");
        jbtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAltaActionPerformed(evt);
            }
        });

        jLabel7.setText("CÓDIGO");

        jLabel8.setText("ESTADO");

        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jbtnModificar.setText("MODIFICAR");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnAlta)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnBaja)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNombre)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(8, 8, 8)
                                            .addComponent(jtfIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlPrecio)
                                                .addComponent(jlStock)
                                                .addComponent(jLabel8))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jtfStock, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                                .addComponent(jtfPrecio)
                                                .addComponent(jtfDescripcion)
                                                .addComponent(jtfEstado)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtnSalir, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombre)
                    .addComponent(jbtnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecio)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSalir))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlStock)
                    .addComponent(jtfStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnAlta)
                    .addComponent(jbtnBaja)
                    .addComponent(jbtnLimpiar)
                    .addComponent(jbtnModificar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
         try
        {
            //Obtenemos los datos ingresados por el usuario
            String nombre = jtfDescripcion.getText();
            int stock=Integer.parseInt(jtfStock.getText());
            String stockStr=jtfStock.getText();
            try
            {
                stock = Integer.parseInt(stockStr);
                JOptionPane.showMessageDialog(null, "El Stock debe ser un numero", "Error", JOptionPane.ERROR_MESSAGE);


            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico valido para el Stock ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String precioStr =jtfPrecio.getText();
            double precio;
            try
            {
                precio = Double.parseDouble(precioStr);
                if(precio<1){
                    JOptionPane.showMessageDialog(null, "Ingrese un valor mayor que 1.", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfPrecio.setText("");
                    return;
                }
                     
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico para el precio.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Producto producto = new Producto(nombre, precio, stock, true);
            productoData.guardarProducto(producto);
            JOptionPane.showMessageDialog(this, "Producto añadido!", "¡ÉXITO!", JOptionPane.INFORMATION_MESSAGE);

            jtfIdProducto.setText(producto.getIdProducto() + "");
            jbtnLimpiar.setEnabled(true);
            jbtnBaja.setEnabled(true);
            jtfIdProducto.setEnabled(true);
            jtfStock.setText(producto.getStock()+ "");
            jtfEstado.setText("Activo");
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Datos invalidos, verifique su entrada " + ex.getMessage());
            jtfDescripcion.requestFocus();
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBajaActionPerformed
        // TODO add your handling code here:
        int idProducto = Integer.parseInt(jtfIdProducto.getText());
        productoData.bajaProducto(idProducto);
        JOptionPane.showMessageDialog(this, "El producto ha sido dado de Baja!", "¡ÉXITO!", JOptionPane.INFORMATION_MESSAGE);
        jtfEstado.setText("Inactivo");
        limpiar();
    }//GEN-LAST:event_jbtnBajaActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAltaActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(jtfIdProducto.getText());
        productoData.altaProducto(id);
        JOptionPane.showMessageDialog(this, "El producto ha sido dado de Alta!", "¡ÉXITO!", JOptionPane.INFORMATION_MESSAGE);
        jtfEstado.setText("Activo");
        limpiar();
    }//GEN-LAST:event_jbtnAltaActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed

    try{
       
        String nombre=jtfDescripcion.getText();
        Producto prod=new Producto();
        prod=productoData.buscarProductoXnombre(nombre);
        jtfDescripcion.setText(prod.getDescripcion());
        jtfPrecio.setText(prod.getPrecioActual()+"");
        jtfStock.setText(prod.getStock()+"");
        if(prod.isEstado()){
            jtfEstado.setText("Activo");
            jbtnAlta.setEnabled(false);
            jbtnBaja.setEnabled(true);
        }else{
            jtfEstado.setText("Inactivo");
            jbtnAlta.setEnabled(true);
            jbtnBaja.setEnabled(false);
        }
        jtfIdProducto.setText(prod.getIdProducto()+"");
        jbtnModificar.setEnabled(true);
        jbtnGuardar.setEnabled(false);
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Datos invalidos, verifique su entrada ");
            jtfDescripcion.requestFocus();
        }
        
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
            
            int id=Integer.parseInt(jtfIdProducto.getText());
            String descrip = jtfDescripcion.getText();
            
            String cantStr =jtfStock.getText();
            int cant;
            try
            {
                cant = Integer.parseInt(cantStr);
                if(cant<0){
                    JOptionPane.showMessageDialog(null, "Ingrese un valor mayor o igual que cero para la cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfStock.setText("");
                    return;
                }
                     
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero para la cantidad", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String precioStr=jtfPrecio.getText();
            double precio;
            try
            {
                precio = Double.parseDouble(precioStr);
                if(precio<0){
                    JOptionPane.showMessageDialog(null, "Ingrese un valor mayor o igual que cero para el precio.", "Error", JOptionPane.ERROR_MESSAGE);
                    jtfPrecio.setText("");
                    return;
                }
                     
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero para el precio", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Producto p = new Producto(id, descrip, precio, cant);
            productoData.modificarProducto(p);
            JOptionPane.showMessageDialog(this, "El producto ha sido dado modificado!", "¡ÉXITO!", JOptionPane.INFORMATION_MESSAGE);
            
            limpiar();
            jtfIdProducto.setText("");
            jbtnBaja.setEnabled(true);
            jbtnGuardar.setEnabled(true);
    }//GEN-LAST:event_jbtnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnAlta;
    private javax.swing.JButton jbtnBaja;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlStock;
    private javax.swing.JTextField jtfDescripcion;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfIdProducto;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfStock;
    // End of variables declaration//GEN-END:variables
private void limpiar(){
    jtfDescripcion.setText("");
    jtfPrecio.setText("");
    jtfStock.setText("");
    jtfIdProducto.setText("");
    jtfEstado.setText("");
}

}


