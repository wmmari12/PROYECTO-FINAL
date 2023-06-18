
package Vistas;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNvoCliente = new javax.swing.JMenuItem();
        jMenuItemNvoProv = new javax.swing.JMenuItem();
        jMenuItemNvoProd = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemCompra = new javax.swing.JMenuItem();
        jMenuItemDetalleC = new javax.swing.JMenuItem();
        jMenuVenta = new javax.swing.JMenu();
        jMenuItemVenta = new javax.swing.JMenuItem();
        jMenuItemDetalleV = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemInventario = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setLayout(null);

        jMenu1.setText("Administrar");
        jMenu1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        jMenuItemNvoCliente.setText("Cliente");
        jMenuItemNvoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNvoClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNvoCliente);

        jMenuItemNvoProv.setText("Proveedor");
        jMenuItemNvoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNvoProvActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNvoProv);

        jMenuItemNvoProd.setText("Producto");
        jMenuItemNvoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNvoProdActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNvoProd);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Compra");
        jMenu3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        jMenuItemCompra.setText("Nueva Compra");
        jMenuItemCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCompraActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemCompra);

        jMenuItemDetalleC.setText("Modificar Compra");
        jMenuItemDetalleC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDetalleCActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemDetalleC);

        jMenuBar1.add(jMenu3);

        jMenuVenta.setText("Venta");
        jMenuVenta.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        jMenuItemVenta.setText("Nueva Venta");
        jMenuItemVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVentaActionPerformed(evt);
            }
        });
        jMenuVenta.add(jMenuItemVenta);

        jMenuItemDetalleV.setText("Modificar Venta");
        jMenuItemDetalleV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDetalleVActionPerformed(evt);
            }
        });
        jMenuVenta.add(jMenuItemDetalleV);

        jMenuBar1.add(jMenuVenta);

        jMenu5.setText("Inventario");
        jMenu5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        jMenuItemInventario.setText("Consultar Inventario");
        jMenuItemInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInventarioActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemInventario);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Salir");
        jMenu6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemSalir);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNvoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNvoClienteActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewCliente vc=new ViewCliente();//crer nueva ventana
        vc.setVisible(true);//hacerla visible
        escritorio.add(vc);//agregarla al escritorio
        escritorio.moveToFront(vc);//llevarla al frente
    }//GEN-LAST:event_jMenuItemNvoClienteActionPerformed

    private void jMenuItemNvoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNvoProvActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewProveedor vprov=new ViewProveedor();//crer nueva ventana
        vprov.setVisible(true);//hacerla visible
        escritorio.add(vprov);//agregarla al escritorio
        escritorio.moveToFront(vprov);//llevarla al frente
    }//GEN-LAST:event_jMenuItemNvoProvActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // SALIR
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemDetalleVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDetalleVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemDetalleVActionPerformed

    private void jMenuItemVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVentaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewVenta vv=new ViewVenta();//crer nueva ventana
        vv.setVisible(true);//hacerla visible
        escritorio.add(vv);//agregarla al escritorio
        escritorio.moveToFront(vv);//llevarla al frente
    }//GEN-LAST:event_jMenuItemVentaActionPerformed

    private void jMenuItemCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCompraActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewCompra vCompra=new ViewCompra();//crer nueva ventana
        vCompra.setVisible(true);//hacerla visible
        escritorio.add(vCompra);//agregarla al escritorio
        escritorio.moveToFront(vCompra);//llevarla al frente
    }//GEN-LAST:event_jMenuItemCompraActionPerformed

    private void jMenuItemNvoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNvoProdActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewProducto vp=new ViewProducto();//crer nueva ventana
        vp.setVisible(true);//hacerla visible
        escritorio.add(vp);//agregarla al escritorio
        escritorio.moveToFront(vp);//llevarla al frente
    }//GEN-LAST:event_jMenuItemNvoProdActionPerformed

    private void jMenuItemInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInventarioActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewInventario vi=new ViewInventario();//crer nueva ventana
        vi.setVisible(true);//hacerla visible
        escritorio.add(vi);//agregarla al escritorio
        escritorio.moveToFront(vi);//llevarla al frente
        
        
    }//GEN-LAST:event_jMenuItemInventarioActionPerformed

    private void jMenuItemDetalleCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDetalleCActionPerformed
        // TODO add your handling code here: modificar compra
        escritorio.removeAll();//removemos todo
        escritorio.repaint();
        ViewModificarCompra vmc=new ViewModificarCompra();//crer nueva ventana
        vmc.setVisible(true);//hacerla visible
        escritorio.add(vmc);//agregarla al escritorio
        escritorio.moveToFront(vmc);//llevarla al frente
    }//GEN-LAST:event_jMenuItemDetalleCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCompra;
    private javax.swing.JMenuItem jMenuItemDetalleC;
    private javax.swing.JMenuItem jMenuItemDetalleV;
    private javax.swing.JMenuItem jMenuItemInventario;
    private javax.swing.JMenuItem jMenuItemNvoCliente;
    private javax.swing.JMenuItem jMenuItemNvoProd;
    private javax.swing.JMenuItem jMenuItemNvoProv;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemVenta;
    private javax.swing.JMenu jMenuVenta;
    // End of variables declaration//GEN-END:variables
}
