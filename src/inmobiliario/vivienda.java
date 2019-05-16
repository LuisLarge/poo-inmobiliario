
package inmobiliario;

/**
 *
 * @author Luis Large
 */
public class vivienda extends construccion implements venta {
    protected int precio;
    protected int numHabitaciones;
    protected String piso;
    protected boolean vendido;

    public vivienda() {
    }

    public vivienda(int precio, int numHabitaciones, String piso, String estado, String ubicacion, int m2) {
        super(estado, ubicacion, m2);
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.piso = piso;
        this.vendido = false;
    }
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }  
    @Override
    public void vender() {
        this.vendido=true;
        
    }

    @Override
    public void precio() {
        
    }

    @Override
    public String toString() {
        return "vivienda{" + "precio=" + precio + ", numHabitaciones=" + numHabitaciones + ", piso=" + piso + ", vendido=" + vendido + '}';
    }
    
}
