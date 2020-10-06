/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributeddatabase;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Asus
 */
public class DBconnect {
    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","rashed","66586");
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@192.168.43.4:1521:XE","mahatab","12345");

            //System.out.println("SUCCESS");
            return con;

        } catch (Exception e) {
            System.out.println(e);
            System.out.print("NOT SUCCESS");
            return null;
        }
    }
}

    

