/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.Connection;


public class VentaData {
    
    private Connection con=null;

    public VentaData() {
        
        con=Conexion.getConexion();

    }
    
    
}
