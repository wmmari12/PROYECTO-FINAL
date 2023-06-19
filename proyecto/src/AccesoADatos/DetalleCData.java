/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Clases.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleCData {
    private Connection con = null;
      
    private ProductoData pd=new ProductoData();
    private CompraData cd = new CompraData();
    public DetalleCData() {
        
    
        con = Conexion.getConexion();

    }
    
    public void  guardarDetalleCompra(DetalleCompra dc) {
 // int idVenta, int idProducto        
        
        String sql = "INSERT INTO detalleCompra (cantidad, precioCosto, idCompra, idProducto) VALUES (?,?,?,?)";

        try{
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dc.getCantidad());
            ps.setDouble(2, dc.getPrecioCosto());
            ps.setInt(3, dc.getCompra().getIdCompra());
            ps.setInt(4, dc.getProducto().getIdProducto());
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next()){
                dc.setIdDetalle(rs.getInt(1));
                ProductoData productoD= new ProductoData();
                //modificarStock(int cant, int idP, int flag)//1=venta 2=compra
                productoD.modificarStock(dc.getCantidad(),dc.getProducto().getIdProducto(),2);
                //JOptionPane.showMessageDialog(null, "Detalle creado");
            } else
            {
                JOptionPane.showMessageDialog(null, "El detalle esta mal.");
            }
            
            ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar producto: " + ex.getMessage());
        }
    }
    
    public List<DetalleCompra> obtenerDetalleXcompra(int idCompra) {
        
        List<DetalleCompra> detalles = new ArrayList<>();
        DetalleCompra dc = null;
        String sql = "SELECT * FROM detalleCompra WHERE idCompra = ?";
        PreparedStatement ps=null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                dc=new DetalleCompra();
                dc.setIdDetalle(rs.getInt("idDetalle"));
                dc.setCantidad(rs.getInt("cantidad"));
                dc.setPrecioCosto(rs.getDouble("precioCosto"));
                
                Compra c = cd.obtenerComprasPorId(rs.getInt("idCompra"));
                
                dc.setCompra(c);
                
                Producto p=pd.buscarProducto(rs.getInt("idProducto"));
                dc.setProducto(p);
                detalles.add(dc);
            }

        } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al obtener el Detalle: "+ex.getMessage());        }

        return detalles;
    }
    
    public DetalleCompra modificarDetalleCompra(DetalleCompra dc) { 

        String sql = "UPDATE detalleCompra SET cantidad=?, precioCosto=?, idCompra=? , idProducto=? WHERE idDetalle=?";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            ps.setInt(1, dc.getCantidad());
            ps.setDouble(2, dc.getPrecioCosto());
            ps.setInt(3, dc.getCompra().getIdCompra());
            ps.setInt(4, dc.getProducto().getIdProducto());
            ps.setInt(5, dc.getIdDetalle());
            int filas = ps.executeUpdate();
            if (filas == 1)
            {
               
                ProductoData productoD= new ProductoData();
                //modificarStock(int cant, int idP, int flag)//1=venta 2=compra
                productoD.modificarStock(dc.getCantidad(),dc.getProducto().getIdProducto(),2);
                JOptionPane.showMessageDialog(null, "Detalle creado");
            
                JOptionPane.showMessageDialog(null, "Detalle de Compra modificada");
            } else
            {
                JOptionPane.showMessageDialog(null, "No se encontro la Compra!" + ps.toString());
            }
            ps.close();//cerramos la conexion
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al modificar Detalle de Compra: " + ex.getMessage());
        }
        return dc;
    } 

}
