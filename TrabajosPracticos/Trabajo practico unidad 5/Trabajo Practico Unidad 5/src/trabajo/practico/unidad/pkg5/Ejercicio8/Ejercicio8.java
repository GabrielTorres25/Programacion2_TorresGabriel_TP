
package trabajo.practico.unidad.pkg5.Ejercicio8;

public class Ejercicio8 {
    public static void main(String[] args) {
        Usuario user = new Usuario("Gabriel", "Gabi@mail.com"); 
        Documento doc = new Documento ("Constancia de dni", "Dni", user); 
        doc.mostrarDoc();
        System.out.println(doc.getFirma());
    }
}
