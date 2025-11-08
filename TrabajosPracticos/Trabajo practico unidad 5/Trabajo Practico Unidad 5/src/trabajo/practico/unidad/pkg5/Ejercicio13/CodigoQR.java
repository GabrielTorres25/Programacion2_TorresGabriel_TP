
package trabajo.practico.unidad.pkg5.Ejercicio13;


public class CodigoQR {
    private String valor; 
    private Usuario usuario; 

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + '}';
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }


}
