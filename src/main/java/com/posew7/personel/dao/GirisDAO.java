
package com.posew7.personel.dao;

import com.posew7.personel.dto.Giris;
import com.posew7.personel.vt.VTBaglanti;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GirisDAO {
    
    public static boolean giriseYetkiliMi(Giris p_giris){
        
        Connection conn = null;
        
        try {
            
            String vtSifre = null; 
            
            conn = VTBaglanti.baglantiAc();
            String sorgu = "select sifre from giris where kullanici = ?";
            PreparedStatement ps = conn.prepareStatement(sorgu);
            ps.setString(1, p_giris.getKullanici());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                vtSifre = rs.getString("sifre");
            }
            rs.close();
            ps.close();
            
            if (p_giris.getSifre().equals(vtSifre)) {
                
                return true;
            } else {
                return false;
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        } finally{
            VTBaglanti.baglantiKapa(conn);
        }
        
        
    }
    
    
}
