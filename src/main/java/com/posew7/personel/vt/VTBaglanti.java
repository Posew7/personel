
package com.posew7.personel.vt;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VTBaglanti {
    
    public static Connection baglantiAc(){
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pbs", "postgres", "postgres");
                    
            return conn;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        
    }
    
    public static void baglantiKapa(Connection p_conn){
        try {
            p_conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
