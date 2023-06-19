
package Vistas;

import Clases.*;
import AccesoADatos.*;
import java.time.*;
import java.util.*;
import javax.swing.JOptionPane;


public class ViewModificarVenta extends javax.swing.JInternalFrame {

    private DetalleVData dVenta = new DetalleVData();
    private VentaData ventaData = new VentaData();
    private ProductoData prodData = new ProductoData();
    private List<Venta> ventas;
    
    public ViewModificarVenta() {
        initComponents();
        inicio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbVenta = new javax.swing.JComboBox<>();
        jbtnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jbtnModificar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jbtnBuscar = new javax.swing.JButton();
        jbtnActivar = new javax.swing.JButton();
        jbtnAnular = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jcbDetalleV = new javax.swing.JComboBox<>();
        jbtnMostrarD = new javax.swing.JButton();
        jcbIdVenta = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbIdProducto = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("MODIFICAR DETALLE DE VENTA");

        jLabel2.setText("SELECCIONAR FECHA");

        jLabel4.setText("SELECCIONAR VENTA");

        jbtnAgregar.setText("AGREGAR DETALLE");

        jLabel5.setText("NRO. VENTA");

        jLabel6.setText("PRECIO");

        jLabel7.setText("CANTIDAD");

        jbtnModificar.setText("GUARDAR");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jbtnSalir.setText("SALIR");

        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jbtnActivar.setText("ACTIVAR VENTA");

        jbtnAnular.setText("ANULAR VENTA");

        jLabel8.setText("SELECCIONAR DETALLE");

        jbtnMostrarD.setText("MOSTRAR DETALLE");
        jbtnMostrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarDActionPerformed(evt);
            }
        });

        jLabel3.setText("COD. PRODUCTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnBuscar))
                            .addComponent(jcbVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(jbtnMostrarD))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnActivar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnAnular))
                            .addComponent(jcbDetalleV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbIdVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfPrecio)
                            .addComponent(jcbIdProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnSalir)))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnActivar)
                    .addComponent(jbtnAnular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbDetalleV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnMostrarD)
                    .addComponent(jbtnAgregar))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSalir)
                    .addComponent(jbtnModificar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        
        Date date = jdcFecha.getDate();
        if (date != null)
        {
            LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            jcbDetalleV.setEnabled(true);
            cargarVentas(fecha);
            Venta ventaSelec = (Venta) jcbVenta.getSelectedItem();
            if (ventaSelec == null)
            {
                cargarDetalles(ventaSelec.getIdVenta());
            }
            if (jcbDetalleV.getSelectedItem() == null)
            {
                jbtnMostrarD.setEnabled(false);
            }
        }    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnMostrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarDActionPerformed
        activarCamposDetalle();

        DetalleVenta detalleV = (DetalleVenta) jcbDetalleV.getSelectedItem();
        jtfCantidad.setText(detalleV.getCantidad() + "");
        jtfPrecio.setText(detalleV.getPrecioVenta() + "");

        cargarCombo();
    }//GEN-LAST:event_jbtnMostrarDActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        
        int cant = 0;
        boolean cantSi = false;
        try
        {
            cant = Integer.parseInt(jtfCantidad.getText());
            cantSi = true;
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numérico para la cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
            jtfCantidad.setText("");
        }
        double precio = 0;
        boolean precioSi = false;
        try
        {
            precio = Double.parseDouble(jtfPrecio.getText());
            precioSi = true;
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numérico para la cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
            jtfPrecio.setText("");
        }
        int idVenta = 0;
        int idProducto = 0;
        Producto p=null;
        try
        {
            p = (Producto) jcbIdProducto.getSelectedItem();
//            idProducto = p.getIdProducto();

        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Error en producto" + e.getMessage());

        }
        Venta venta=null;
        if (cantSi && precioSi)
        {

            DetalleVenta detalleVenta = (DetalleVenta) jcbDetalleV.getSelectedItem();
            if (detalleVenta == null)
            {
                venta = (Venta) jcbVenta.getSelectedItem();
                DetalleVenta det = new DetalleVenta(cant, precio, venta, p);
                dVenta.guardarDetalleVta(det);
                limpiar();

            } else
            {
                venta = (Venta) jcbIdVenta.setSelectedItem();
                idVenta = c.getIdVenta();
                int idDetalle = detalleCompra.getIdDetalle();
                DetalleCompra det = new DetalleCompra(idDetalle, cant, precio, compra, p);
                dCompra.modificarDetalleCompra(det);
                limpiar();
            }
            jcbIdCompra.removeAllItems();
            jcbIdProducto.removeAllItems();
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnActivar;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnAnular;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnMostrarD;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<DetalleVenta> jcbDetalleV;
    private javax.swing.JComboBox<Producto> jcbIdProducto;
    private javax.swing.JComboBox<Venta> jcbIdVenta;
    private javax.swing.JComboBox<Venta> jcbVenta;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables

    private void inicio() {
        jcbDetalleV.setEnabled(false);
        jtfCantidad.setEnabled(false);
        jtfPrecio.setEnabled(false);
        jcbIdProducto.setEnabled(false);
        jcbIdVenta.setEnabled(false);    }

    private void cargarVentas(LocalDate fecha) {
        jcbVenta.removeAllItems();
        ventas = ventaData.obtenerVentasPorFecha(fecha);
        for (Venta item : ventas)
        {
            jcbVenta.addItem(item);

        }   
    }
    
    private void cargarDetalles(int idVenta){
        jcbDetalleV.removeAllItems();
        List<DetalleVenta> detallesVentas = dVenta.obtenerDetalleXventa(idVenta);
        for (DetalleVenta item : detallesVentas)
        {
            jcbDetalleV.addItem(item);

        }
    }

    private void activarCamposDetalle() {
        jtfCantidad.setEnabled(true);
        jtfPrecio.setEnabled(true);
        jcbIdProducto.setEnabled(true);
        jcbIdVenta.setEnabled(true);
        jtfCantidad.setText("");
        jtfPrecio.setText("");
        jcbIdProducto.removeAllItems();
        jcbIdVenta.removeAllItems();    }

    private void cargarCombo() {
        List<Venta> ventas = ventaData.listaDeVentasActivas();
        for (Venta item : ventas)
        {
            jcbIdVenta.addItem(item);

        }
        List<Producto> productos = prodData.listaDeProductosActivos();
        for (Producto item : productos)
        {
            jcbIdProducto.addItem(item);

        }    }

    private void limpiar() {
       jtfCantidad.setText("");
        jtfPrecio.setText("");
        jdcFecha.getCalendar();    }
}
