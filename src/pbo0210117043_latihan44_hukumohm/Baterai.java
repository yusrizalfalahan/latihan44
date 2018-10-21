/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan44_hukumohm;

/**
 *
 * @author Acer
 */
public class Baterai  {

    private float Kuatarus;
    private float Hambatan;

    public void Baterai() {
         
    
    }

    public  void  Baterai(float kuatarus, float hambatan) {
     this.Kuatarus= kuatarus ;
         this.Hambatan = hambatan;
    
        
    }

    public float getKuatarus() {
        return Kuatarus=4;
    }

    public float getHambatan() {
        return Hambatan=2;
    }
public float hitungtegangan(){
        return Kuatarus*Hambatan;
     
    
}
}
