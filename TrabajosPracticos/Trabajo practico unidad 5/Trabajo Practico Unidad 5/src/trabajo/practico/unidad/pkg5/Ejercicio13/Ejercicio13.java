
package trabajo.practico.unidad.pkg5.Ejercicio13;


public class Ejercicio13 {
    public static void main(String[] args) {
        Usuario user = new Usuario("Gabriel", "Gabi@mail.com"); 
        GeneradorQR gnd = new GeneradorQR();
        CodigoQR nuevoQr = gnd.generar("fsf46546", user); 
        System.out.println("Nombre de usuario: "+ user.getNombre());
    }
}
