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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleVData {

    private Connection con = null;
    private ProductoData pd = new ProductoData();
    private VentaData vd = new VentaData();

    public DetalleVData() {

        con = Conexion.getConexion();

    }

    public void guardarDetalleVta(DetalleVenta dv) {
        // int idVenta, int idProducto        

        String sql = "INSERT INTO detalleVenta (cantidad,precioVenta,idVenta,idProducto) VALUES (?,?,?,?)";

        try
        {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dv.getCantidad());
            ps.setDouble(2, dv.getPrecioVenta());
            ps.setInt(3, dv.getIdVenta());
            ps.setInt(4, dv.getIdProducto());
            
            ProductoData productoD = new ProductoData();
            int stock = productoD.stockProducto(dv.getIdProducto());
            if (dv.getCantidad() <= stock)
            {

                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next())
                {

                    dv.setIdDetalleVenta(rs.getInt(1));
                    //modificarStock(int cant, int idP, int flag)//1=venta 2=compra
                    productoD.modificarStock(dv.getCantidad(), dv.getIdProducto(), 1);
                    JOptionPane.showMessageDialog(null, "Detalle creado");
                }

            } else
            {
                JOptionPane.showMessageDialog(null, "Stock insuficiente");
            }

            ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar producto: " + ex.getMessage());
        }
    }

    /*
    
     4- anular*/

    public List<DetalleVenta> obtenerDetalleXventa(int idVenta) {

        List<DetalleVenta> detalles = new ArrayList<>();
        DetalleVenta dv = null;
        String sql = "SELECT * FROM detalleventa WHERE idVenta = ?";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idVenta);
            ResultSet rs = ps.executeQuery();

            while (rs.next())
            {
                dv = new DetalleVenta();
                dv.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                dv.setCantidad(rs.getInt("cantidad"));
                dv.setPrecioVenta(rs.getDouble("precioVenta"));
                dv.setIdVenta(rs.getInt("idVenta"));
                dv.setIdProducto(rs.getInt("idProducto"));
                detalles.add(dv);
            }

        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al obtener el Detalle: " + ex.getMessage());
        }

        return detalles;
    }

    public DetalleVenta modificarDetalleVenta(DetalleVenta dv) {

        String sql = "UPDATE detalleVenta SET cantidad=?, precioVenta=?, idVenta=? , idProducto=? WHERE idDetalleVenta=?";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            ps.setInt(1, dv.getCantidad());
            ps.setDouble(2, dv.getPrecioVenta());
            ps.setInt(3, dv.getIdVenta());
            ps.setInt(4, dv.getIdProducto());
            ps.setInt(5, dv.getIdDetalleVenta());
            int filas = ps.executeUpdate();
            if (filas == 1)
            {
                JOptionPane.showMessageDialog(null, "Detalle de venta modificada");
            } else
            {
                JOptionPane.showMessageDialog(null, "No se encontro la venta!" + ps.toString());
            }
            ps.close();//cerramos la conexion
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al modificar Detalle de venta: " + ex.getMessage());
        }
        return dv;
    }
}
