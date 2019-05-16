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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void precio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "vivienda{" + "precio=" + precio + ", numHabitaciones=" + numHabitaciones + ", piso=" + piso + ", vendido=" + vendido + '}';
    }
    
}
