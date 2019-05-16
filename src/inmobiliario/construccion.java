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
public abstract class construccion extends inmueble {
    protected String estado;

    public construccion(String estado, String ubicacion, int m2) {
        super(ubicacion, m2);
        this.estado = estado;
    }
    
    

  
    public construccion() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   

    abstract public void precio();

    @Override
    public String toString() {
        return "construccion{" + "estado=" + estado + '}';
    }
    
}
