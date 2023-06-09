/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Clases.Compra;
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
    
    private Connection con = null;

    public CompraData() {

        con = Conexion.getConexion();

    }
    
    public void hacerCompra(Compra c){
        String sql = "INSERT INTO compra (idCompra,fecha,idProveedor) VALUES (?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, c.getIdCompra());
            ps.setDate(1, Date.valueOf(c.getFecha()));
            ps.setInt(3, c.getIdProveedor());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                c.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Compra realizada");
            }else{
                JOptionPane.showMessageDialog(null, "La compra no pudo ser realizada");
            }
            ps.close();;
            
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al generar Compra: " + ex.getMessage());
        }
        
    }
    
    public Compra modificarCompra(Compra c){
        
        String sql = "UPDATE compra SET idCompra, fecha, idProveedor WHERE idCompra";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, c.getIdCompra());
            ps.setDate(2, Date.valueOf(c.getFecha()));
            ps.setInt(3, c.getIdProveedor());
            
            int filas = ps.executeUpdate();
            
            
            if(filas==1){
                JOptionPane.showMessageDialog(null, "Compra modificada");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro la compra!"+ps.toString());
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al modificar Compra: "+ex.getMessage());
    }
        
        
    return c;
    }

    
    public Compra obtenerComprasPorId(int id){
        Compra c = null;
        String sql = "SELECT * FROM compra WHERE idCompra=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                c = new Compra();
                c.setIdCompra(rs.getInt("idVenta"));
                c.setFecha(rs.getDate("fecha").toLocalDate());
                c.setIdProveedor(rs.getInt("idProveedor"));
            }else{
                 JOptionPane.showMessageDialog(null, "No se encontraron compras con ese id!");
            }
            ps.close();
        }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener compras: "+ex.getMessage());        }

        return c;
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
                int idProv = rs.getInt("idProveedor");
                
                Compra compra = new Compra(idComp, fecha, idProv);
                compras.add(compra);
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al listar Compras: "+ex.getMessage());
        }

        return compras;
    }
    
    
}
