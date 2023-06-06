/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author solmedina
 */
public class Conexion {
    private static final String url = "jdbc:mysql://localhost:3306/inventario";
 
    private static final String usuario = "usuario1";
    private static String contraseña = "";

    private static Connection connection;

    //no se crean instancias de la conexion ppor ser construsctor privado
    private Conexion() {
    }

    public static Connection getConexion() {

        //si es nula es porque nadie ha llamado a este metodo
        if (connection == null)
        {

            try
            {
            Class.forName("org.mariadb.jdbc.Driver");

             connection = DriverManager.getConnection(url,usuario,contraseña);
                System.out.println("conexion existosa");

            } catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la bd--" + ex.getMessage());
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(null, "Error al cargar los drivers");
            }

        }
        return connection;
    }
}
