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
import java.util.ArrayList;
import java.util.List;
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
                System.out.println("Proveedor añadido.");
            } else
            {
                System.out.println("El proveedor no pudo ser ingresado.");
            }
            ps.close();
            
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar proveedor: " + ex.getMessage());
        }
    }
    
    public Proveedor modificarProveedor(Proveedor p) {

        String sql = "UPDATE proveedor SET razonSocial=?,domicilio=?, telefono=?, estado=? WHERE idProveedor=?";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            ps.setString(1, p.getRazonSocial());
            ps.setString(2, p.getDomicilio());
            ps.setString(3, p.getTelefono());
            ps.setBoolean(4, p.isEstado());
            ps.setInt(5, p.getIdProveedor());
            
            int filas=ps.executeUpdate();
            if(filas==1){
                System.out.println("Proveedor modificado");
            }else{
                System.out.println("No se encontro el Proveedor!"+ps.toString());
            }
        ps.close();//cerramos la conexion
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al modificar Producto: "+ex.getMessage());
    }
    return p;
}
    
    public void bajaProveedor(int id){
        
        try{
            String sql="UPDATE proveedor SET estado=0 WHERE idProveedor=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            
            if(fila==1){
                 System.out.println("El Proveedor ha sido dado de baja.");
            }else{
                System.out.println("No se encontro el Proveedor!");
            }
            ps.close(); 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al dar de baja el Proveedor: "+ex.getMessage());
        }
        
    }
    
    public void altaProveedor(int id){
        
        try{
            String sql="UPDATE cliente SET estado=1 WHERE idCliente=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            
            if(fila==1){
                 System.out.println("El cliente ha sido dado de alta.");
            }else{
                System.out.println("No se encontro el cliente!");
            }
            ps.close(); 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al eliminar Cliente: "+ex.getMessage());
        }
        
    }
    
    public Proveedor obtenerProveedorPorNombre(String nombre) {
        
        Proveedor p = null;
        String sql = "SELECT * FROM proveedor WHERE razonSocial = ?";
        PreparedStatement ps=null;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p= new Proveedor();
                p.setIdProveedor(rs.getInt("idProveedor"));
                p.setRazonSocial(rs.getString("razonSocial"));
                p.setDomicilio(rs.getString("domicilio"));
                p.setTelefono(rs.getString("telefono"));
                p.setEstado(rs.getBoolean("estado"));
            }else{
                System.out.println("No se encontro el Proveedor!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener el Proveedor: "+ex.getMessage());        }

        return p;
    }
    
    public Proveedor obtenerProveedorPorId(int id) {
        
        Proveedor p = null;
        String sql = "SELECT * FROM proveedor WHERE idProveedor = ?";
        PreparedStatement ps=null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p= new Proveedor();
                p.setIdProveedor(id);
                p.setRazonSocial(rs.getString("razonSocial"));
                p.setDomicilio(rs.getString("domicilio"));
                p.setTelefono(rs.getString("telefono"));
                p.setEstado(rs.getBoolean("estado"));
            }else{
                System.out.println("No se encontro el Proveedor!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener el Proveedor: "+ex.getMessage());        }

        return p;
    }

     
    public List<Proveedor> listaDeProveedores() {
        
        List<Proveedor> proveedores = new ArrayList<>();

        try{
            String sql = "SELECT * FROM Proveedor";
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idProveedor");
                String razon = rs.getString("razonSocial");
                String dom = rs.getString("domicilio");
                String tel = rs.getString("telefono");
                boolean estado = rs.getBoolean("estado");

                Proveedor p = new Proveedor(id, razon, dom, tel, estado);
                proveedores.add(p);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al obtener lista de Proveedores: "+ex.getMessage());

        }

        return proveedores;
    }


    
}
