
package inmobiliario;
/**
 *
 * @author Luis Large
 */
public class Inmobiliariaa {
    public static void main(String[] args) {
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
        
        /**
         *
         *garaje g= new garaje();
         * g.precio();
         * 
         */
    }
}
