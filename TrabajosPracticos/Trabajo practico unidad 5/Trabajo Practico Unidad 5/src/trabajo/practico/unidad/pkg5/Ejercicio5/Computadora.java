package trabajo.practico.unidad.pkg5.Ejercicio5;


public class Computadora {
    private String marca;
    private double numeroSerie;
    private PlacaMadre pm; 
    private Propietario pp; 

    public Computadora(String marca, double numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.pm = new PlacaMadre("XZ3000", "C3t93");
    }
    
    
    /*
        a. Composición: Computadora → PlacaMadre 
        b. Asociación bidireccional: Computadora ↔ Propietario  
    */

    public Propietario getPp() {
        return pp;
    }

    public void setPp(Propietario pp) {
        this.pp = pp;
    }

    public String getMarca() {
        return marca;
    }

    public double getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPm() {
        return pm;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", pm=" + pm + ", pp=" + pp + '}';
    }

   public void mostrarInfo(){
       System.out.println("Datos de la "+toString());
   }
    
    
}
