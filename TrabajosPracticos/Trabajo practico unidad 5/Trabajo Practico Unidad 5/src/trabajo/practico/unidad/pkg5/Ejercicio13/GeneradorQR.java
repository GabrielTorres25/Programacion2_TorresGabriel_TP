
package trabajo.practico.unidad.pkg5.Ejercicio13;


public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario){
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("El nuevo qr creado es: "+ qr);
        return qr;
    }

}


