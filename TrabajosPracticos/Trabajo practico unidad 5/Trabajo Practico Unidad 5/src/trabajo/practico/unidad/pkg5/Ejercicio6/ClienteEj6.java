
package trabajo.practico.unidad.pkg5.Ejercicio6;


public class ClienteEj6 {
    private String nombre;
    private int telefono;

    public ClienteEj6(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ClienteEj6{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
    
   
    
}
