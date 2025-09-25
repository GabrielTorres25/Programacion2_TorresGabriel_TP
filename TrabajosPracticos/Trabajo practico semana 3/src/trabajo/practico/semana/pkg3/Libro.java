

package trabajo.practico.semana.pkg3;

public class Libro {
    private String titulo, autor; 
    private int anioPublicacion; 

    public String getTitulo() {
        return titulo;
    }
    
    void ponerTitulo(String titulo){
        this.titulo = titulo; 
    }
    
    public String getAutor() {
        return autor;
    }
    
    void ponerAutor(String autor){
        this.autor = autor; 
    } 
            
            
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion > 0){
        this.anioPublicacion = anioPublicacion;   
        }
        
    }
    
   void mostrarInfo(){
       System.out.println("El titulo del libro es "+ titulo + ", el autor del libro es "+ autor + " y el anio de publicacion es "+ anioPublicacion);
   }
    
    
    
}
