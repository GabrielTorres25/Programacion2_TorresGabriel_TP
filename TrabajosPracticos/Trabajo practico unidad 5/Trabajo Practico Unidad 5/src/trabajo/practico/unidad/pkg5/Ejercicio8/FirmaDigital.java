
package trabajo.practico.unidad.pkg5.Ejercicio8;

public class FirmaDigital {
    private int codigoHash; 
    private String fecha; 
    private Usuario user; 

    public FirmaDigital(int codigoHash, String fecha, Usuario user) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.user = user;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", user=" + user + '}';
    }

  
}

