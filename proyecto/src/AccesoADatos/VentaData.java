/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Clases.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class VentaData {
    
    private Connection con=null;
    private ClienteData clienteD=new ClienteData();

    public VentaData() {
        
        con=Conexion.getConexion();

    }
    
    private Cliente nuevoCliente(int id){
        return clienteD.obtenerClientePorId(id);
    }
    
    public void realizarVenta(Venta v) {
        
        String sql = "INSERT INTO venta(fecha, idCliente,estado) VALUES (?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(v.getFecha()));
            ps.setInt(2, v.getCliente().getIdCliente());
            ps.setBoolean(3, true);
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                v.setIdVenta(rs.getInt(1));
                //JOptionPane.showMessageDialog(null, "La venta fue cargada con exito");
            }
            ps.close();
            
        }catch (SQLException ex)
        {JOptionPane.showMessageDialog(null, "Error al realizar Venta" + ex.getMessage());
         }
    }
    
    public Venta modificarVenta(Venta v) {
        
        String sql = "UPDATE venta SET fecha=?, idCliente=? estado=? WHERE idVenta=?";
       PreparedStatement ps = null;
    try
    {
        ps = con.prepareStatement(sql);
        ps.setDate(1, Date.valueOf(v.getFecha()));
        ps.setInt(2, v.getCliente().getIdCliente());
        ps.setBoolean(3, v.isEstado());
        
        int filas=ps.executeUpdate();
        if(filas==1){
            JOptionPane.showMessageDialog(null, "Venta modificada");
        }else{
            JOptionPane.showMessageDialog(null, "Error al modificar Venta: " + ps.toString());

        }
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al modificar Venta: "+ex.getMessage());
    }
    return v;
}
    
    public Venta obtenerVentaPorId(int id){
        
        Venta v = null;
        String sql = "SELECT * FROM venta WHERE idVenta = ? AND estado=1";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                v = new Venta();
                v.setIdVenta(id);
                v.setFecha(rs.getDate("fecha").toLocalDate());
                v.setEstado(rs.getBoolean("estado"));
                Cliente cliente=nuevoCliente(rs.getInt("idCliente"));
                v.setCliente(cliente);
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro la venta!");

            }
    }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener Venta: "+ex.getMessage());        }

        return v;
    

}
    
    public List<Venta> obtenerVentasPorFecha(LocalDate fecha){
        
        List<Venta> listaVentas = new ArrayList<>();
        
        Venta venta = null;
        String sql = "SELECT * FROM venta WHERE fecha=? AND estado=1";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                venta = new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setFecha(rs.getDate("fecha").toLocalDate());
                
                Cliente cliente= nuevoCliente(rs.getInt("idCliente"));
                venta.setCliente(cliente);
                
                venta.setEstado(rs.getBoolean("estado"));
                listaVentas.add(venta);
//          
            }
            if(listaVentas.size()==0){
                JOptionPane.showMessageDialog(null, "No se encontraron ventas ese dia.");
            }
            ps.close();
        }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener ventas: "+ex.getMessage());        }

        return listaVentas;
    }
    public List<Venta> listaDeVentas(){
        
        List<Venta> ventas = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM venta";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                int idVta = rs.getInt("idVenta");
                LocalDate fecha = rs.getDate("fecha").toLocalDate();
                Cliente cliente=clienteD.obtenerClientePorId(rs.getInt("idCliente"));
                boolean estado= rs.getBoolean("estado");
                
                Venta venta = new Venta(idVta,fecha,cliente,estado);
                ventas.add(venta);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al listar Ventas: "+ex.getMessage());
        }
    
        return ventas;
    }
    
    public List<Venta> listaDeVentasActivas(){
        
        List<Venta> ventas = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM venta WHERE estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                int idVta = rs.getInt("idVenta");
                LocalDate fecha = rs.getDate("fecha").toLocalDate();
                Cliente cliente=clienteD.obtenerClientePorId(rs.getInt("idCliente"));
                
                Venta venta = new Venta(fecha,cliente);
                ventas.add(venta);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al listar Ventas: "+ex.getMessage());
        }
    
        return ventas;
    }
}
