/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliario;

/**
 *
 * @author Estudiante
 */
public class Inmobiliario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        superficie p= new superficie(100, "santa marta", 16);
        p.precio();
        
        local c1=new local(200, "nuevo", "santa marta", 18);
        c1.precio();
        solar s1=new solar("urbana", 100, "santa marta", 100);
        
        agencia a1=new agencia();
        a1.Alquilarinmueble(c1);
        a1.Malquileres();
        a1.vender(s1);
        a1.Mventas();
        
    }
    
}
