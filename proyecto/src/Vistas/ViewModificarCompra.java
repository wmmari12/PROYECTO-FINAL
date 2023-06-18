package Vistas;

import AccesoADatos.*;
import Clases.*;
import java.time.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ViewModificarCompra extends javax.swing.JInternalFrame {

    private DetalleCData dCompra = new DetalleCData();
    private CompraData compraData = new CompraData();
    private ProductoData prodData = new ProductoData();
    private List<Compra> compras;
    private List<DetalleCompra> detallesCompra;

    public ViewModificarCompra() {
        initComponents();
        inicio();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jcbDetalleC = new javax.swing.JComboBox<>();
        jbtnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbIdCompra = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcbIdProducto = new javax.swing.JComboBox<>();
        jtfPrecio = new javax.swing.JTextField();
        jtnModificar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jbtnMostrarD = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcbCompra = new javax.swing.JComboBox<>();
        jbtnAgregar = new javax.swing.JButton();
        jbtnAnular = new javax.swing.JButton();
        jbtnActivar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("MODIFICAR DETALLE DE COMPRA");

        jLabel2.setText("SELECCIONAR FECHA");

        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("CANTIDAD");

        jLabel5.setText("NRO. COMPRA");

        jcbIdCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbIdCompraActionPerformed(evt);
            }
        });

        jLabel6.setText("SELECCIONAR DETALLE");

        jLabel7.setText("PRECIO");

        jLabel8.setText("COD. PRODUCTO");

        jtnModificar.setText("GUARDAR");
        jtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnModificarActionPerformed(evt);
            }
        });

        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jbtnMostrarD.setText("MOSTRAR DETALLE");
        jbtnMostrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarDActionPerformed(evt);
            }
        });

        jLabel4.setText("SELECCIONAR COMPRA");

        jcbCompra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCompraItemStateChanged(evt);
            }
        });
        jcbCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCompraActionPerformed(evt);
            }
        });

        jbtnAgregar.setText("AGREGAR DETALLE");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });

        jbtnAnular.setText("ANULAR COMPRA");
        jbtnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAnularActionPerformed(evt);
            }
        });

        jbtnActivar.setText("ACTIVAR COMPRA");
        jbtnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfPrecio)
                                    .addComponent(jcbIdCompra, 0, 356, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jtnModificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnSalir))
                                    .addComponent(jcbIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(206, 206, 206)
                                        .addComponent(jbtnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbtnBuscar))
                                        .addComponent(jcbCompra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnMostrarD))
                            .addComponent(jcbDetalleC, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnActivar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnBuscar)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAnular)
                    .addComponent(jbtnActivar))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbDetalleC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnMostrarD)
                    .addComponent(jbtnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtnModificar)
                    .addComponent(jbtnSalir))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // TODO add your handling code here:
        Date date = jdcFecha.getDate();
        if (date != null)
        {
            LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            jcbDetalleC.setEnabled(true);
            cargarCompras(fecha);
            Compra compraSelec = (Compra) jcbCompra.getSelectedItem();
            if (compraSelec == null)
            {
                cargarDetalles(compraSelec.getIdCompra());
            }
            if (jcbDetalleC.getSelectedItem() == null)
            {
                jbtnMostrarD.setEnabled(false);
            }
        }

    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnMostrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarDActionPerformed
        // TODO add your handling code here:

        activarCamposDetalle();

        DetalleCompra detalleC = (DetalleCompra) jcbDetalleC.getSelectedItem();
        jtfCantidad.setText(detalleC.getCantidad() + "");
        jtfPrecio.setText(detalleC.getPrecioCosto() + "");

        cargarCombo();

    }//GEN-LAST:event_jbtnMostrarDActionPerformed

    private void jtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnModificarActionPerformed
        // TODO add your handling code here:
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
        int idCompra = 0;
        int idProducto = 0;
        try
        {
            Producto p = (Producto) jcbIdProducto.getSelectedItem();
            idProducto = p.getIdProducto();

        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Error en id--" + e.getMessage());

        }

        if (cantSi && precioSi)
        {

            DetalleCompra detalleCompra = (DetalleCompra) jcbDetalleC.getSelectedItem();
            if (detalleCompra == null)
            {
                idCompra = ((Compra) jcbCompra.getSelectedItem()).getIdCompra();
                DetalleCompra det = new DetalleCompra(cant, precio, idCompra, idProducto);
                dCompra.guardarDetalleCompra(det);
                limpiar();

            } else
            {
                Compra c = (Compra) jcbIdCompra.getSelectedItem();
                idCompra = c.getIdCompra();
                int idDetalle = detalleCompra.getIdDetalle();
                DetalleCompra det = new DetalleCompra(idDetalle, cant, precio, idCompra, idProducto);
                dCompra.modificarDetalleCompra(det);
                limpiar();
            }
            jcbIdCompra.removeAllItems();
            jcbIdProducto.removeAllItems();
        }
    }//GEN-LAST:event_jtnModificarActionPerformed

    private void jcbCompraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCompraItemStateChanged
        if (evt.getSource() == jcbCompra)
        {
            actualizarVistaDetalle();
            if (jcbDetalleC.getSelectedItem() == null)
            {
                jbtnMostrarD.setEnabled(false);
            }
        }

    }//GEN-LAST:event_jcbCompraItemStateChanged

    private void jcbIdCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbIdCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbIdCompraActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAnularActionPerformed
        // TODO add your handling code here:
        Compra c = (Compra) jcbCompra.getSelectedItem();
        int idCompra = c.getIdCompra();
        compraData.modificarEstadoCompra(idCompra, 0);
        actualizarVistaCompra();

    }//GEN-LAST:event_jbtnAnularActionPerformed

    private void jcbCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCompraActionPerformed

    private void jbtnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActivarActionPerformed
        Compra c = (Compra) jcbCompra.getSelectedItem();
        int idCompra = c.getIdCompra();
        compraData.modificarEstadoCompra(idCompra, 1);
        //jcbCompra.removeAllItems();
        actualizarVistaCompra();

    }//GEN-LAST:event_jbtnActivarActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        activarCamposDetalle();
        jcbIdCompra.setEnabled(false);
        //jcbIdCompra.setSelectedItem(jcbCompra.getSelectedItem().toString());
        jcbDetalleC.removeAllItems();
        cargarCombo();
        jcbIdCompra.removeAllItems();
        //actualizarVistaDetalle();
    }//GEN-LAST:event_jbtnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbtnActivar;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnAnular;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnMostrarD;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<Compra> jcbCompra;
    private javax.swing.JComboBox<DetalleCompra> jcbDetalleC;
    private javax.swing.JComboBox<Compra> jcbIdCompra;
    private javax.swing.JComboBox<Producto> jcbIdProducto;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JButton jtnModificar;
    // End of variables declaration//GEN-END:variables

    private void inicio() {
        jcbDetalleC.setEnabled(false);
        jtfCantidad.setEnabled(false);
        jtfPrecio.setEnabled(false);
        jcbIdProducto.setEnabled(false);
        jcbIdCompra.setEnabled(false);
    }

    private void cargarCompras(LocalDate fecha) {
        jcbCompra.removeAllItems();
        compras = compraData.obtenerComprasPorFecha(fecha);
        for (Compra item : compras)
        {
            jcbCompra.addItem(item);

        }
    }

    private void cargarDetalles(int idCompra) {
        jcbDetalleC.removeAllItems();
        List<DetalleCompra> detallesCompras = dCompra.obtenerDetalleXcompra(idCompra);
        for (DetalleCompra item : detallesCompras)
        {
            jcbDetalleC.addItem(item);

        }
    }

    private void limpiar() {
        jtfCantidad.setText("");
        jtfPrecio.setText("");
        jdcFecha.getCalendar();

    }

    private void actualizarVistaCompra() {
        Date date = jdcFecha.getDate();
        if (date != null)
        {
            LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            jcbDetalleC.setEnabled(true);
            cargarCompras(fecha);
        }

        actualizarVistaDetalle();
    }

    private void actualizarVistaDetalle() {
        Compra compraSelec = (Compra) jcbCompra.getSelectedItem();
        if (compraSelec != null)
        {
            cargarDetalles(compraSelec.getIdCompra());

            boolean estado = compraSelec.isEstado();
            jbtnAnular.setEnabled(estado);
            jbtnMostrarD.setEnabled(estado);
            jbtnAgregar.setEnabled(estado);
            jbtnActivar.setEnabled(!estado);
        }
    }

    private void activarCamposDetalle() {
        jtfCantidad.setEnabled(true);
        jtfPrecio.setEnabled(true);
        jcbIdProducto.setEnabled(true);
        jcbIdCompra.setEnabled(true);
        jtfCantidad.setText("");
        jtfPrecio.setText("");
        jcbIdProducto.removeAllItems();
        jcbIdCompra.removeAllItems();

    }

    private void cargarCombo() {
        List<Compra> compras = compraData.listaDeComprasActivas();
        for (Compra item : compras)
        {
            jcbIdCompra.addItem(item);

        }
        List<Producto> productos = prodData.listaDeProductosActivos();
        for (Producto item : productos)
        {
            jcbIdProducto.addItem(item);

        }
    }
}