/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Clases.Compra;
import Clases.Proveedor;
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


public class CompraData {
    
    private ProveedorData proveedorD=new ProveedorData();
    
    private Connection con = null;

    public CompraData() {

        con = Conexion.getConexion();

    }
    
    private Proveedor nuevoProveedor(int id){
        ProveedorData proveedor=new ProveedorData();
        return proveedor.obtenerProveedorPorId(id);
    }
    
    public void hacerCompra(Compra c){
        String sql = "INSERT INTO compra (fecha,idProveedor,estado) VALUES (?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDate(1, Date.valueOf(c.getFecha()));
            ps.setInt(2, c.getProveedor().getIdProveedor());
            ps.setBoolean(3, true);
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                c.setIdCompra(rs.getInt(1));
                System.out.println("Compra realizada");
            }else{
                System.out.println("La compra no pudo ser realizada");
            }
            ps.close();;
            
        } catch (SQLException ex)
        {
            System.out.println("Error al generar Compra: " + ex.getMessage());
        }
        
    }
    
    public Compra modificarCompra(Compra c){
        
        String sql = "UPDATE compra SET fecha=?, idProveedor=?, estado=? WHERE idCompra=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            
            ps.setDate(1, Date.valueOf(c.getFecha()));
            ps.setInt(2, c.getProveedor().getIdProveedor());
            ps.setBoolean(3, c.isEstado());
            ps.setInt(4, c.getIdCompra());
            
            int filas = ps.executeUpdate();
            
            
            if(filas==1){
                System.out.println("Compra modificada");
            }else{
                System.out.println("No se encontro la compra!"+ps.toString());
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al modificar Compra: "+ex.getMessage());
    }
        
    return c;
    }
    
    public List<Compra> obtenerComprasPorFecha(LocalDate fecha){
        
        List<Compra> listaCompras = new ArrayList<>();
        
        Compra c = null;
        String sql = "SELECT * FROM compra WHERE fecha=? AND estado=1";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                c = new Compra();
                c.setIdCompra(rs.getInt("idCompra"));
                c.setFecha(rs.getDate("fecha").toLocalDate());
                
                Proveedor p= nuevoProveedor(rs.getInt("idProveedor"));
                c.setProveedor(p);
                
                c.setEstado(rs.getBoolean("estado"));
                listaCompras.add(c);
//          
            }
            if(listaCompras.size()==0){
                JOptionPane.showMessageDialog(null, "No se encontraron compras ese dia.");
            }
            ps.close();
        }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener compras: "+ex.getMessage());        }

        return listaCompras;
    }
    
    public List<Compra> listaDeCompras(){
        List<Compra> compras = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM compra";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                int idComp = rs.getInt("idCompra");
                LocalDate fecha = rs.getDate("fecha").toLocalDate();
                
                Proveedor p= proveedorD.obtenerProveedorPorId(rs.getInt("idProveedor"));
                boolean estado=rs.getBoolean("estado");
                
                Compra compra = new Compra(idComp, fecha, p,estado);
                compras.add(compra);
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al listar Compras: "+ex.getMessage());
        }

        return compras;
    }
    public List<Compra> listaDeComprasActivas(){
        List<Compra> compras = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM compra WHERE estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                int idComp = rs.getInt("idCompra");
                LocalDate fecha = rs.getDate("fecha").toLocalDate();
                Proveedor p= proveedorD.obtenerProveedorPorId(rs.getInt("idProveedor"));
                boolean estado=rs.getBoolean("estado");
                
                Compra compra = new Compra(idComp, fecha, p,estado);
                compras.add(compra);
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al listar Compras: "+ex.getMessage());
        }

        return compras;
    }
    public Compra obtenerComprasPorId(int id){
        
        Compra c = null;
        String sql = "SELECT * FROM compra WHERE idCompra=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                c = new Compra();
                c.setIdCompra(id);
                c.setFecha(rs.getDate("fecha").toLocalDate());
                
                Proveedor p= nuevoProveedor(rs.getInt("idProveedor"));
                c.setProveedor(p);
                
                c.setEstado(rs.getBoolean("estado"));
                
//          
            }
            
            ps.close();
        }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener compras: "+ex.getMessage());        }

        return c;
    }
    
    public void modificarEstadoCompra(int id,int estado){
        
        try{
            String sql="UPDATE compra SET estado=? WHERE idCompra=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, estado);
            ps.setInt(2, id);
            
            int fila=ps.executeUpdate();
            
            if(fila==1){
                 JOptionPane.showMessageDialog(null, "La compra ha sido modificada");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro la compra!");
            }
            ps.close(); 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al anular compra: "+ex.getMessage());
        }
        
    }
    
    
}
