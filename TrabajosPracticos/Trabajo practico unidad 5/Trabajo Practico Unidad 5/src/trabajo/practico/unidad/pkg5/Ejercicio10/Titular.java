
package trabajo.practico.unidad.pkg5.Ejercicio10;


public class Titular {
    private String nombre;
    private int dni; 
    private CuentaBancaria cta;

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCta(CuentaBancaria cta) {
        this.cta = cta;
        if(cta.getTitular()!= this){
            cta.setTitular(this);
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public CuentaBancaria getCta() {
        return cta;
    }

    
    
    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
    
}

