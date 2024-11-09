/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rivo
 */
public class Config {
    Connection cn;
    public Config() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String login = "root";
            String pass = "";
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dbetudiant", login, pass);
            System.out.println("Connection dans la base reussi...");
        } catch (Exception e) {
            System.out.println("Erruer de connection!!!");
            System.out.println("bonjour");
            e.printStackTrace();
        }
    }
    public Connection maConnection(){
        return cn;
    }
    
    
    
}
