
package inmobiliario;

/**
 *
 * @author Elkin Moreno
 */
public class inmueble {
    protected String ubicacion;
    protected int m2;

    public inmueble() {
    }

    public inmueble(String ubicacion, int m2) {
        this.ubicacion = ubicacion;
        this.m2 = m2;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getM2() {
        return m2;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }
    
    
}
