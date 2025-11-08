
package trabajo.practico.unidad.pkg5.Ejercicio3;


public class Ejercicio3 {
    public static void main(String[] args) {
        Autor aut = new Autor("Gabriel G.M.", "Colombiano como la teoria");
        Editorial edit = new Editorial("La tablada", "La tablada 1231");
        Libro lib = new Libro("100 anios de soledad", "sad54513", aut, edit);
        
        lib.mostrarInfo();     
        System.out.println("Autor del libro: " +lib.getAutor().getNombre());
        System.out.println("Editorial del libro: "+ lib.getEdit().getDireccion());
    }
}
