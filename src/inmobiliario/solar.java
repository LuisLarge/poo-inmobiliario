
package inmobiliario;

/**
 *
 * @author Luis Large
 */
public class solar extends superficie implements venta{
    protected String zona;
    protected boolean vendido;
    

    public solar(String zona, int precioM2, String ubicacion, int m2) {
        super(precioM2, ubicacion, m2);
        this.zona = zona;
        this.vendido=false;
    }

    public solar() {
    }

    
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public void vender() {
        this.vendido= true;
     
    }

    @Override
    public String toString() {
        return "solar{" + "zona=" + zona + ", vendido=" + vendido + '}';
    }
    
}
