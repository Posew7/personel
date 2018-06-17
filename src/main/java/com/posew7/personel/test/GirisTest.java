
package com.posew7.personel.test;

import com.posew7.personel.dao.GirisDAO;
import com.posew7.personel.dto.Giris;


public class GirisTest {
    
    public static void main(String[] args) {
        
        Giris grs = new Giris();
        grs.setKullanici("yunus");
        grs.setSifre("12345");
        
        boolean sonuc = GirisDAO.giriseYetkiliMi(grs);
        
        if (sonuc) {
            System.out.println("yetkili");
        } else {
            System.out.println("hata");
        }
        
    }
    
    
}
