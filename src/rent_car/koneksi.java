/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class koneksi {

    private static Connection mysqlconfig;

    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://217.21.72.102:3306/u1694897_kel07";
            String username = "u1694897_smt1";
            String pass = "@polije.ac.id";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, username, pass);
        } catch (SQLException e) {
            System.err.println("koneksi gagal!" + e.getMessage());
        }
        return mysqlconfig;
    }
}