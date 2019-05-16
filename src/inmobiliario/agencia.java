
package inmobiliario;
import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author Luis Large
 */
public class agencia {
    LinkedList <inmueble> ventas;
    LinkedList <inmueble> alquilados;
    LinkedList <inmueble> disponibles;
    public agencia() {
        this.ventas = new LinkedList<>() ;
        this.alquilados = new LinkedList<>();
        this.disponibles = new LinkedList<>();
    }
    public void Alquilarinmueble(alquiler I){
        if (!this.alquilados.contains(I)){
            I.alquilar();
            inmueble j=(inmueble) I;
        this.alquilados.add(j);
        }
    }
    public void vender(venta I){
        if(!this.ventas.contains(I)){
            I.vender();
            inmueble j=(inmueble) I;
            this.ventas.add(j);
        }
    }
    public void Malquileres(){
       for (Iterator i = alquilados.iterator(); i.hasNext();) {
         System.out.println(i.next());
      }
    }
    public void Mventas(){
        System.out.println("\n vendidos: ");
        for (Iterator i = ventas.iterator(); i.hasNext();) {
         System.out.println(i.next());
      }
    }   
}

