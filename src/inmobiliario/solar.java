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
