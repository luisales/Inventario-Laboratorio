/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Velasquez
 */
public class Conectar {
    
    private static Connection conn;
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String user ="root";
    private static final String password ="123";
    private static final String url ="jdbc:mysql://localhost:3306/laboratios";
    
    public Conectar()
    {
        conn=null;
        try
        {
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, password);
            if(conn!=null)
            {
                System.out.println("Conexion hecha");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Error al conectar");
        }         
    }
    
    public Connection getConnection()
    {
        return conn;
    }
    
    public void desconectar()
    {
        conn=null;
        if(conn==null)
        {
            System.out.println("Conexion desconectada");
        }
    }
}
