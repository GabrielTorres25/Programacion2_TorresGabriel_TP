
package trabajo.practico.unidad.pkg5.Ejercicio14;


public class Proyecto {
    // Proyecto: nombre, duracionMin. 
    private String nombre; 
    private String duracionMin; 

    public Proyecto(String nombre, String duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDuracionMin() {
        return duracionMin;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracionMin=" + duracionMin + '}';
    }
    
    
}
