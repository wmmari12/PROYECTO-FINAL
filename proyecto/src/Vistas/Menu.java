
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
        jMenuItemDetalleC = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemDetalleV = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemInventario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemListaProv = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItemListaV = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Administrar");

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
        jMenu1.add(jMenuItemNvoProd);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Compra");

        jMenuItemDetalleC.setText("Nueva Compra");
        jMenu3.add(jMenuItemDetalleC);

        jMenuItem2.setText("Detalle de Compra");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Venta");

        jMenuItemDetalleV.setText("Nueva Venta");
        jMenu4.add(jMenuItemDetalleV);

        jMenuItem3.setText("Detalle de Venta");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Inventario");

        jMenuItemInventario.setText("Consultar Inventario");
        jMenu5.add(jMenuItemInventario);

        jMenuBar1.add(jMenu5);

        jMenu2.setText("Consulta");

        jMenuItemListaProv.setText("Cliente");
        jMenu2.add(jMenuItemListaProv);

        jMenuItem5.setText("Proveedor");
        jMenu2.add(jMenuItem5);

        jMenuItemListaV.setText("Compra");
        jMenuItemListaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaVActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemListaV);

        jMenuItem1.setText("Venta");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Salir");

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
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    }//GEN-LAST:event_jMenuItemNvoProvActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemListaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemListaVActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // SALIR
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemDetalleC;
    private javax.swing.JMenuItem jMenuItemDetalleV;
    private javax.swing.JMenuItem jMenuItemInventario;
    private javax.swing.JMenuItem jMenuItemListaProv;
    private javax.swing.JMenuItem jMenuItemListaV;
    private javax.swing.JMenuItem jMenuItemNvoCliente;
    private javax.swing.JMenuItem jMenuItemNvoProd;
    private javax.swing.JMenuItem jMenuItemNvoProv;
    private javax.swing.JMenuItem jMenuItemSalir;
    // End of variables declaration//GEN-END:variables
}
