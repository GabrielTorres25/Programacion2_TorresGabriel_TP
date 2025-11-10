
package trabajo.practico.semana.pkg3;


public class NaveEspacial {
    String nombre; 
    int combustible = 50;
    int combustibleMaximo = 50; 

   
    public void despegar() {
        int costo = 10; 
        if (combustible >= costo) {
            combustible -= costo;
            System.out.println("La nave "+ nombre + " despego con exito.");
        } else {
            System.out.println("La nave "+nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println("La nave "+ nombre + " avanzo " + distancia + " kms.");
        } else {
            System.out.println("La nave "+ nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > combustibleMaximo) {
            combustible = combustibleMaximo;
            System.out.println("Combustible al maximo: " + combustibleMaximo );
        } else {
            combustible += cantidad;
            System.out.println("Se cargaron " + cantidad + " de combustible.");
        }
    }

    
    public void mostrarEstado() {
        System.out.println("Combustible de la nave: " + combustible + "/" + combustibleMaximo);
    }
}