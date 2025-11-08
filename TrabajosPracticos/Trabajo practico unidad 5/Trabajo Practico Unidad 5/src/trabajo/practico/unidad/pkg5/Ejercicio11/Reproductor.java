
package trabajo.practico.unidad.pkg5.Ejercicio11;


public class Reproductor {
    
    public void reproducirMusica(Cancion cancion){
        System.out.println("Reproduciendo: "+ cancion.getTitulo() + " - " + cancion.getArtista().getNombre());
    }
}

