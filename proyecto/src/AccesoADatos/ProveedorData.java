/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Clases.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ProveedorData {

    private Connection con=null;

    public ProveedorData() {
        con=Conexion.getConexion();
    }
    public void guardarProveedor(Proveedor p) {
        
        String sql = "INSERT INTO proveedor (razonSocial,domicilio, telefono, estado) VALUES (?,?,?,?)";

        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getRazonSocial());
            ps.setString(2, p.getDomicilio());
            ps.setString(3, p.getTelefono() );
            ps.setBoolean(4, p.isEstado());

            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next()){
                p.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor añadido.");
            } else
            {
                JOptionPane.showMessageDialog(null, "El proveedor no pudo ser ingresado.");
            }
            ps.close();
            
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar proveedor: " + ex.getMessage());
        }
    }
    
    public Producto modificarProveedor(Proveedor p) {

        String sql = "UPDATE proveedor SET razonSocial=?,domicilio=?, telefono=?, estado=? WHERE idProducto=?";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            ps.setString(1, p.getRazonSocial());
            ps.setString(2, p.getDomicilio());
            ps.setString(3, p.getTelefono());
            ps.setBoolean(4, p.isEstado());
            
            int filas=ps.executeUpdate();
            if(filas==1){
                JOptionPane.showMessageDialog(null, "Proveedor modificado");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el Proveedor!"+ps.toString());
            }
        ps.close();//cerramos la conexion
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al modificar Producto: "+ex.getMessage());
    }
    return p;
}
    
    public void eliminarProducto(int id){
        
        try{
            String sql="UPDATE producto SET estado=0 WHERE idProducto=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            
            if(fila==1){
                 JOptionPane.showMessageDialog(null, "El producto ha sido dado de baja.");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el producto!");
            }
            ps.close(); 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al eliminar el producto: "+ex.getMessage());
        }
        
    }
    
    public Producto obtenerProductoPorId(int id) {
        Producto p = null;
        String sql = "SELECT * FROM producto WHERE idProducto = ?";
        PreparedStatement ps=null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p= new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecioActual(rs.getInt("precioActual"));
                p.setStock(rs.getInt("stock"));
                p.setEstado(rs.getBoolean("estado"));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el producto!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener el producto: "+ex.getMessage());        }

        return p;
    }

     
    public List<Producto> listaDeProductos() {
        
        List<Producto> productos = new ArrayList<>();

        try{
            String sql = "SELECT * FROM producto";
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idProducto");
                String desc = rs.getString("descripcion");
                Double precio = rs.getDouble("precioActual");
                int stock = rs.getInt("stock");
                boolean estado = rs.getBoolean("estado");

                Producto p = new Producto(id, desc, precio, stock, estado);
                productos.add(p);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al listar Clientes: "+ex.getMessage());

        }

        return productos;
    }


    
}
