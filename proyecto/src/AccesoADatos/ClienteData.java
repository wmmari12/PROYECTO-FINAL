 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Clases.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteData {

    private Connection con = null;

    public ClienteData() {

        con = Conexion.getConexion();

    }

    public void guardarCliente(Cliente c) {
        
        String sql = "INSERT INTO cliente (dni,apellido,nombre,domicilio,telefono) VALUES (?,?,?,?,?)";

        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, c.getDni());//en la DB no hay dni
            ps.setString(2, c.getApellido());
            ps.setString(3, c.getNombre());
            ps.setString(4, c.getDomicilio());
            ps.setString(5, c.getTelefono());

            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next()){
                c.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente añadido.");
            } else
            {
                JOptionPane.showMessageDialog(null, "El cliente no pudo ser ingresado.");
            }
            ps.close();
            
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar Cliente: " + ex.getMessage());
        }
    }
    
    public Cliente modificarCliente(Cliente c) {

        String sql = "UPDATE cliente SET apellido=?, nombre=?, domicilio=?, telefono=? WHERE idCliente=?";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            ps.setString(1, c.getApellido());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getDomicilio());
            ps.setString(4, c.getTelefono());
            ps.setInt(5, c.getIdCliente());
            int filas=ps.executeUpdate();
            if(filas==1){
                JOptionPane.showMessageDialog(null, "Cliente modificado");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el cliente!"+ps.toString());
            }
        ps.close();//cerramos la conexion
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al modificar Cliente: "+ex.getMessage());
    }
    return c;
}
    
    public void eliminarCliente(int id){
        
        try{
            String sql="UPDATE cliente SET estado=0 WHERE idCliente=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            
            if(fila==1){
                 JOptionPane.showMessageDialog(null, "El cliente ha sido dado de baja.");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el cliente!");
            }
            ps.close(); 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al eliminar Cliente: "+ex.getMessage());
        }
        
    }
    
    public Cliente obtenerClientePorId(int id) {
        Cliente c = null;
        String sql = "SELECT * FROM cliente WHERE idCliente = ?";
        PreparedStatement ps=null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                c= new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setDni(rs.getString("dni"));
                c.setApellido(rs.getString("apellido"));
                c.setNombre(rs.getString("nombre"));
                c.setDomicilio(rs.getString("domicilio"));
                c.setTelefono(rs.getString("telefono"));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el cliente!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener Cliente: "+ex.getMessage());        }

        return c;
    }

     
    public List<Cliente> listaDeClientes() {
        
        List<Cliente> clientes = new ArrayList<>();

        try{
            String sql = "SELECT * FROM cliente";
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idCliente");
                String dni = rs.getString("dni");
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                String domicilio = rs.getString("domicilio");
                String telefono = rs.getString("telefono");

                Cliente cliente = new Cliente(id, dni, apellido, nombre, domicilio, telefono);
                clientes.add(cliente);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al listar Clientes: "+ex.getMessage());

        }

        return clientes;
    }

      
}
