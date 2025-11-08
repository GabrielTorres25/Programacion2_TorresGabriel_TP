
package trabajo.practico.unidad.pkg5.Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        TarjetaDeCredito tar = new TarjetaDeCredito(1654648, "05-08-2030"); 
        Cliente cus = new Cliente("Torres Gabriel", 55435123); 
        Banco ban = new Banco("Banco Falso", "564-25465451-5"); 
        
        tar.setCliente(cus);
        tar.setBanco(ban);
        cus.setTc(tar);
        tar.mostrarDatos();
        cus.mostrarDatos(); 
    }
}
