/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import AccesoADatos.*;
import java.sql.Connection;


public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Connection con=Conexion.getConexion();
        ClienteData c=new ClienteData();
        //c.guardarCliente(new Cliente("33445566", "Perez", "Juan", "San Martin 200", "2664112233"));
        //System.out.println(c.obtenerClientePorId(7));
        //System.out.println(c.listaDeClientes());
        
    }
    
}
