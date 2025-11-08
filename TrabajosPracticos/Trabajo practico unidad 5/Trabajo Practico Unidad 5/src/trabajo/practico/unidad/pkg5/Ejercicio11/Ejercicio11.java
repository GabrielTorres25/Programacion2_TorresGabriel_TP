
package trabajo.practico.unidad.pkg5.Ejercicio11;

public class Ejercicio11 {
    public static void main(String[] args) {
        Artista art = new Artista("Julian Alvarez", "la y la m qsy"); 
        Cancion tema = new Cancion("La bestia de Calchin Records", art); 
        System.out.println(art.getNombre());
        System.out.println(art.toString()); 
        System.out.println(tema.toString());
        Reproductor rep = new Reproductor();  
        rep.reproducirMusica(tema); 
    }
}
