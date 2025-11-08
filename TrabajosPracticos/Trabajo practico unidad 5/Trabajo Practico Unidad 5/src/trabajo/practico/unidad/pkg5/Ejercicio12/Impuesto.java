
package trabajo.practico.unidad.pkg5.Ejercicio12;

public class Impuesto {
    private double monto; 
    private Contribuyente cont; 

    public Impuesto(double monto, Contribuyente cont) {
        this.monto = monto;
        this.cont = cont;
    }

    public double getMonto() {
        return monto;
    }

    public Contribuyente getCont() {
        return cont;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", cont=" + cont + '}';
    }
    
    
    
    
    
}


