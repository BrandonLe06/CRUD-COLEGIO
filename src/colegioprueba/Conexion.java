/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegioprueba;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Leonel Pineda
 */

public class Conexion 
{
    protected Connection conexion;
    private String url="jdbc:mysql://localhost:3306/colegio";
    private String user="root";
    private String ps="Desa123";
     public Conexion()
     {
        try
        {
            conexion=DriverManager.getConnection(url, user,ps);
            if(conexion!=null)
               System.out.println("Conexion Exitosa");            
        }catch(Exception e)
        {
            System.out.println("Error en conexion"+e.getMessage());
        }        
    }
}

