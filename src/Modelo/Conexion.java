/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection con;
    public Connection getConnection(){
        try {
            String myBD = "jdbc:mysql://vicente71.mysql.database.azure.com/cleanexpress?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD,"u20212915","Vicente71");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
