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

public class ProductoData {

    private Connection con = null;

    public ProductoData() {

        con = Conexion.getConexion();

    }

    public void guardarProducto(Producto p) {

        String sql = "INSERT INTO producto (descripcion,precioActual,stock,estado) VALUES (?,?,?,?)";

        try
        {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getDescripcion());
            ps.setDouble(2, p.getPrecioActual());
            ps.setInt(3, p.getStock());
            ps.setBoolean(4, p.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next())
            {
                p.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido.");
            } else
            {
                JOptionPane.showMessageDialog(null, "El producto no pudo ser ingresado.");
            }
            ps.close();

        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar producto: " + ex.getMessage());
        }
    }
    
    public Producto buscarProducto(int id) {

        Producto p = null;
        String sql = "SELECT * FROM producto WHERE idProducto=? AND estado = 1";//AND estado = 1  creamos la consulta a enviar

        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            ps.setInt(1, id);//1 es el primer atributo que buscamos con where y id es el valor a buscar
            ResultSet rs = ps.executeQuery();//guardamos el resultado obtenido de la base de datos

            if (rs.next())
            {//se posiciona en la primer fila de la busqueda
                p = new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecioActual(rs.getDouble("precioActual"));
                p.setStock(rs.getInt("stock"));
                p.setEstado(rs.getBoolean("estado"));

            } else
            {
                JOptionPane.showMessageDialog(null, "No existe el producto buscado");
            }
            ps.close();//cerramos la conexion
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto: " + ex.getMessage());
        }
        return p;
    }
    public int stockProducto(int id) {
        
        int stock=0;
        Producto p = null;
        String sql = "SELECT stock FROM producto WHERE idProducto=? AND estado = 1";//AND estado = 1  creamos la consulta a enviar

        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            ps.setInt(1, id);//1 es el primer atributo que buscamos con where y id es el valor a buscar
            ResultSet rs = ps.executeQuery();//guardamos el resultado obtenido de la base de datos

            if (rs.next())
            {
                p = new Producto();
                stock=rs.getInt("stock");

            } else
            {
                JOptionPane.showMessageDialog(null, "No existe el producto buscado");
            }
            ps.close();//cerramos la conexion
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto: " + ex.getMessage());
        }
        return stock;
    }

    public Producto buscarProductoXnombre(String nombre) {

        Producto p = null;
        String sql = "SELECT * FROM producto WHERE descripcion=? AND estado = 1";//AND estado = 1  creamos la consulta a enviar

        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            ps.setString(1, nombre);//1 es el primer atributo que buscamos con where y id es el valor a buscar
            ResultSet rs = ps.executeQuery();//guardamos el resultado obtenido de la base de datos

            if (rs.next())
            {//se posiciona en la primer fila de la busqueda
                p = new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecioActual(rs.getDouble("precioActual"));
                p.setStock(rs.getInt("stock"));
                p.setEstado(rs.getBoolean("estado"));

            } else
            {
                JOptionPane.showMessageDialog(null, "No existe el producto buscado");
            }
            ps.close();//cerramos la conexion
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto: " + ex.getMessage());
        }
        return p;
    }

    public Producto modificarProducto(Producto p) {

        String sql = "UPDATE producto SET descripcion=?, precioActual=?, estado=? WHERE idProducto=?";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos
            ps.setString(1, p.getDescripcion());
            ps.setDouble(2, p.getPrecioActual());
            ps.setBoolean(3, p.isEstado());
            ps.setInt(4, p.getIdProducto());
            int filas = ps.executeUpdate();
            if (filas == 1)
            {
                JOptionPane.showMessageDialog(null, "Producto modificado");
            } else
            {
                JOptionPane.showMessageDialog(null, "No se encontro el Producto!" + ps.toString());
            }
            ps.close();//cerramos la conexion
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al modificar Producto: " + ex.getMessage());
        }
        return p;
    }

    public void modificarStock(int cant, int idP, int flag) {

        //el flag es para indetificar si es una compra o una venta, 1:venta 2:compra
        String sql = "UPDATE producto SET stock=? WHERE idProducto=?";
        PreparedStatement ps = null;
       
        try
        {
            Producto aux=buscarProducto(idP);//buscamos el producto por id
            int stockActual = aux.getStock();//guardamos el stock actual

            switch (flag)
            {
                case 1://venta
                    if (cant <= stockActual){//vendemos producto
                        stockActual -= cant;
                        JOptionPane.showMessageDialog(null, "Venta realizada");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cantidad insuficiente! El stock actual es: "+stockActual);
                    }
                    break;

                case 2://compra
                    stockActual += cant;
                    JOptionPane.showMessageDialog(null, "Compra realizada");
                    break;
            }
            
            ps = con.prepareStatement(sql);//envia la sentencia sql a la base de datos

            ps.setInt(1,stockActual);//modificamos el stock con el calculo del stock actual
            ps.setInt(2, idP);
            int filas = ps.executeUpdate();
            
            if (filas == 1)
            {
                JOptionPane.showMessageDialog(null, "Consulta realizada con exito!");
            } 
            
            ps.close();//cerramos la conexion
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al modificar stock: " + ex.getMessage());
        }

    }

    public void bajaProducto(int id) {

        try
        {
            String sql = "UPDATE producto SET estado=0 WHERE idProducto=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1)
            {
                JOptionPane.showMessageDialog(null, "El producto ha sido dado de baja.");
            } else
            {
                JOptionPane.showMessageDialog(null, "No se encontro el producto!");
            }
            ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al eliminar el producto: " + ex.getMessage());
        }

    }
    
     public void altaProducto(int id){
        
        try{
            String sql="UPDATE cliente SET estado=1 WHERE idProducto=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            
            if(fila==1){
                 JOptionPane.showMessageDialog(null, "El Producto ha sido dado de alta.");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el Producto!");
            }
            ps.close(); 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al eliminar Producto: "+ex.getMessage());
        }
        
    }

    public List<Producto> listaDeProductos() {

        List<Producto> productos = new ArrayList<>();

        try
        {
            String sql = "SELECT * FROM producto";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                int id = rs.getInt("idProducto");
                String desc = rs.getString("descripcion");
                Double precio = rs.getDouble("precioActual");
                int stock = rs.getInt("stock");
                boolean estado = rs.getBoolean("estado");

                Producto p = new Producto(id, desc, precio, stock, estado);
                productos.add(p);
            }
            ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, " Error al listar Clientes: " + ex.getMessage());

        }

        return productos;
    }
    
    public List<Producto> listaDeProductosInactivos() {

        List<Producto> productos = new ArrayList<>();

        try
        {
            String sql = "SELECT * FROM producto WHERE estado=0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                int id = rs.getInt("idProducto");
                String desc = rs.getString("descripcion");
                Double precio = rs.getDouble("precioActual");
                int stock = rs.getInt("stock");
                boolean estado = rs.getBoolean("estado");

                Producto p = new Producto(id, desc, precio, stock, estado);
                productos.add(p);
            }
            ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, " Error al listar Clientes: " + ex.getMessage());

        }

        return productos;
    }
    
    public List<Producto> listaDeProductosActivos() {

        List<Producto> productos = new ArrayList<>();

        try
        {
            String sql = "SELECT * FROM producto WHERE estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                int id = rs.getInt("idProducto");
                String desc = rs.getString("descripcion");
                Double precio = rs.getDouble("precioActual");
                int stock = rs.getInt("stock");
                boolean estado = rs.getBoolean("estado");

                Producto p = new Producto(id, desc, precio, stock, estado);
                productos.add(p);
            }
            ps.close();
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, " Error al listar Clientes: " + ex.getMessage());

        }

        return productos;
    }
    
}
