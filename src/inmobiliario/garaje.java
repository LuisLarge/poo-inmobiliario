
package inmobiliario;

/**
 *
 * @author Elkin Moreno
 */
public class garaje extends superficie  implements alquiler {
    protected String parte;
    public boolean alqui;
    
    public garaje() {
    }
    public garaje(String parte, int precioM2, String ubicacion, int m2) {
        super(precioM2, ubicacion, m2);
        this.parte = parte;
        this.alqui = false;
    }

    
    public boolean isAlqui() {
        return alqui;
    }

    public void setAlqui(boolean alqui) {
        this.alqui = alqui;
    }

    public String getParte() {
        return parte;
    }

    public void setParte(String parte) {
        this.parte = parte;
    }

    @Override
    public void alquilar() {
        System.out.println("alquilado");
        this.alqui=true;
        
    }

    @Override
    public String toString() {
        return "garaje{" + "parte=" + parte + ", alquilado=" + alqui + '}';
    }
    
    
}
