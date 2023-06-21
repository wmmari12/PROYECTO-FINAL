package Vistas;

import AccesoADatos.*;
import Clases.*;
import java.util.*;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

public class ViewCompra extends javax.swing.JInternalFrame {

    private CompraData compraData = new CompraData();
    private ProveedorData proveedorData = new ProveedorData();
    private DetalleCData detCompra = new DetalleCData();
    private ProductoData productoData = new ProductoData();
    private List<Producto> productos;
    private List<Proveedor> proveedores;
    private List<DetalleCData> detalles = new ArrayList();

    public ViewCompra() {
        initComponents();
        cargaProveedores();
        inicio();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbProveedor = new javax.swing.JComboBox<>();
        jbtnGuardar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfIdCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbProductos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jbtnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jbtnNvaCompra = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("NUEVA COMPRA");

        jLabel2.setText("FECHA: ");

        jLabel3.setText("PROVEEDOR: ");

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

        jLabel5.setText("NRO.  COMPRA");

        jtfIdCompra.setEditable(false);

        jLabel6.setText("ELEGIR PRODUCTO:");

        jLabel7.setText("CANTIDAD");

        jLabel8.setText("PRECIO UNITARIO");

        jtfPrecio.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("CARGAR  PRODUCTOS");

        jbtnAgregar.setText("AGREGAR PRODUCTO");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });

        jLabel4.setText("PRECIO TOTAL");

        jbtnNvaCompra.setText("NUEVA COMPRA");
        jbtnNvaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNvaCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtnGuardar)
                                        .addGap(88, 88, 88)
                                        .addComponent(jbtnNvaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(45, 45, 45)
                            .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(166, 166, 166)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel4))
                                    .addGap(184, 184, 184)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnAgregar)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnSalir))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jtfIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnNvaCompra))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jbtnSalir)
                    .addComponent(jbtnAgregar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        try
        {
            Date date = jdcFecha.getDate();
            LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Proveedor provSelec = (Proveedor) jcbProveedor.getSelectedItem();

            Compra compra = new Compra(fecha, provSelec);
            compraData.hacerCompra(compra);
            JOptionPane.showMessageDialog(this, "La compra ha sido realizada!", "¡ÉXITO!", JOptionPane.INFORMATION_MESSAGE);

            jtfIdCompra.setText(compra.getIdCompra() + "");
            //habilitamos las opciones de la compra de productos y cargamos los productos
            cargaProductos();

            jcbProductos.setEnabled(true);
            jtfCantidad.setEnabled(true);
            jtfPrecio.setEnabled(true);
            jbtnAgregar.setEnabled(true);

            jbtnGuardar.setEnabled(false);
            jdcFecha.setEnabled(false);
            jcbProveedor.setEditable(false);
            jbtnNvaCompra.setEnabled(true);

        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar la compra, verifique sus datos." + ex.getMessage());

        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed

        try
        {

            int idCompra = Integer.parseInt(jtfIdCompra.getText());
            Compra compra = compraData.obtenerComprasPorId(idCompra);
            Producto prodSelec = (Producto) jcbProductos.getSelectedItem();

//            int cant = Integer.parseInt(jtfCantidad.getText());
            int cant=0;
            try
            {
                cant = Integer.parseInt(jtfCantidad.getText());
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico para la cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
                jtfCantidad.setText("");
            }
            jtfPrecio.setText(prodSelec.getPrecioActual() + "");
            double precio = prodSelec.getPrecioActual();

            double total = cant * precio;
            jtfTotal.setText(total + "");
            jtfTotal.setEditable(false);
            jtfPrecio.setEditable(false);
            DetalleCompra detalleCompra = new DetalleCompra(cant, precio, compra, prodSelec);
            detCompra.guardarDetalleCompra(detalleCompra);
            JOptionPane.showMessageDialog(this, "Producto agregado", "¡ÉXITO!", JOptionPane.INFORMATION_MESSAGE);

            cargaProductos();

            limpiar();

            jbtnGuardar.setEnabled(false);
            jdcFecha.setEnabled(false);
            jcbProveedor.setEditable(false);
            jbtnNvaCompra.setEnabled(true);

        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar la compra, verifique sus datos." + ex.getMessage());

        }

    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnNvaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNvaCompraActionPerformed
        // TODO add your handling code here:
        limpiar();
        inicio();

    }//GEN-LAST:event_jbtnNvaCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnNvaCompra;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<Producto> jcbProductos;
    private javax.swing.JComboBox<Proveedor> jcbProveedor;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfIdCompra;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfTotal;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables

    private void cargaProveedores() {
        jcbProveedor.removeAllItems();
        List<Proveedor> proveedores = proveedorData.listaDeProveedores();
        for (Proveedor item : proveedores)
        {
            jcbProveedor.addItem(item);
        }
    }

    private void cargaProductos() {
        jcbProductos.removeAllItems();
        List<Producto> productos = productoData.listaDeProductos();
        for (Producto item : productos)
        {
            jcbProductos.addItem(item);
        }
    }

    private void limpiar() {
        jtfCantidad.setText("");
        jtfPrecio.setText("");
        jtfTotal.setText("");
        jtfIdCompra.setText("");
        jdcFecha.getCalendar();
    }

    private void inicio() {
        jcbProductos.setEnabled(false);
        jtfCantidad.setEnabled(false);
        jtfPrecio.setEnabled(false);
        jtfTotal.setEnabled(false);
        jbtnAgregar.setEnabled(false);
        jbtnNvaCompra.setEnabled(false);
        jbtnGuardar.setEnabled(true);
        jdcFecha.setEnabled(true);
        jcbProveedor.setEditable(true);

    }

}
