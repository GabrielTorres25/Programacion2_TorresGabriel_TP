
package trabajo.practico.unidad.pkg5.Ejercicio3;


public class Libro {

    private String titulo;
    private String isbn; 
    private Autor autor; 
    private Editorial edit; 

    public Libro(String titulo, String isbn, Autor autor, Editorial edit) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.edit = edit;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", edit=" + edit + '}';
    }
    
    public void mostrarInfo(){
       System.out.println("Informacion sobre el libro: " + toString());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEdit() {
        return edit;
    }

   
}
