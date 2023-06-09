/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Clases.DetalleVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class DetalleVData {
    
    private Connection con = null;

    public DetalleVData() {
        
    
        con = Conexion.getConexion();

    }
    
    
    
    public void  guardarDetalleVta(DetalleVenta dv) {

        
        String sql = "INSERT INTO detalleVenta (cantidad,precioVenta,idVenta,idProducto) VALUES (?,?,?,?)";

        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dv.getCantidad());
            ps.setDouble(2, dv.getPrecioVenta());
            ps.setInt(3, dv.getIdVenta());
            ps.setInt(4, dv.getIdProducto());
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next()){
                dv.setIdDetalleVenta(rs.getInt(1));
//                ProductoData productoD= new ProductoData();
//                productoD.modificarStock()
                JOptionPane.showMessageDialog(null, "Detalle creado");
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
}
