
package trabajo.practico.unidad.pkg5.Ejercicio2;

public class Bateria {
    
    private String modelo;
    private String capacidad; 

    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }
    
    public void mostrarBat(){
        System.out.println("La bateria es de tipo: "+ toString());
    }
    
    
}
