/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import AccesoADatos.*;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;


public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Connection con=Conexion.getConexion();
        //ClienteData c=new ClienteData();
        //c.guardarCliente(new Cliente("33445566", "Perez", "Juan", "San Martin 200", "2664112233"));
        //System.out.println(c.obtenerClientePorId(7));
        //System.out.println(c.listaDeClientes());
        
//      CompraData c=new CompraData();
//      System.out.println(c.obtenerComprasPorFecha(LocalDate.of(2023, Month.JUNE, 8)));
        
//        ProductoData pd=new ProductoData();
//        pd.modificarStock(35, 1, 1);
//        
          DetalleVData dVD = new DetalleVData();
          DetalleVenta dv = new DetalleVenta(13, 200, 1, 3);
          //guardarDetalleVta(DetalleVenta dv) 
          //DetalleVenta(int cantidad, double precioVenta, int idVenta, int idProducto
          System.out.println("Detalle:" + dVD.obtenerDetalleXventa(1));
          

//        
    }
    
}
