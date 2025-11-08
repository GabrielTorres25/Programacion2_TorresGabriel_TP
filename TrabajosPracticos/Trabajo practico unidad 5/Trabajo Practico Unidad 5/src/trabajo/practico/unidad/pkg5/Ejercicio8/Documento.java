
package trabajo.practico.unidad.pkg5.Ejercicio8;


public class Documento {
    private String titulo; 
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, Usuario user) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.setFirma(new FirmaDigital(4564584, "28/05/2025", user));
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firma=" + firma +  '}';
    }
    
    
    
    public void mostrarDoc(){
        System.out.println(toString());
    }

    public void setFirma(FirmaDigital firma) {
        this.firma = firma;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }
    
    
    
}



        
       