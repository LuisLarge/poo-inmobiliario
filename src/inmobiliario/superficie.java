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
public class superficie extends inmueble{
    protected int precioM2;

    public superficie(int precioM2, String ubicacion, int m2) {
        super(ubicacion, m2);
        this.precioM2 = precioM2;
    }

    public superficie() {
    }

    public int getPrecioM2() {
        return precioM2;
    }

    public void setPrecioM2(int precioM2) {
        this.precioM2 = precioM2;
    }
    
     public void precio(){
         System.out.println("precio superficie:"+this.precioM2 *this.m2);
     };
    
}
