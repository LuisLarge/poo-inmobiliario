
package inmobiliario;

/**
 *
 * @author Luis Large
 */
public class local extends construccion implements alquiler {
   
    protected int valorxm2;
    protected boolean alqui;
    public local() {
    }
    public local(int valorxm2, String estado, String ubicacion, int m2) {
        super(estado, ubicacion, m2);
        this.valorxm2 = valorxm2;
        this.alqui = false;
    }
    public void setValorxm2(int valorxm2) {
        this.valorxm2 = valorxm2;
     this.alqui = false;
    }
    public boolean isAlqui() {
        return alqui;
    }
    public void setAlqui(boolean alqui) {
        this.alqui = alqui;
    }
    public int getValorxm2() {
        return valorxm2;
    }
    @Override
    public String toString() {
        return "local{" + "valorxm2=" + valorxm2 + ", alquilado=" + alqui + '}';
    }
    @Override
    public void precio() {
        System.out.println("precio alquiler :" + this.getM2()*this.getValorxm2());
        
       
    }
    @Override
    public void alquilar() {
        this.alqui=true;
       
    }   
}
