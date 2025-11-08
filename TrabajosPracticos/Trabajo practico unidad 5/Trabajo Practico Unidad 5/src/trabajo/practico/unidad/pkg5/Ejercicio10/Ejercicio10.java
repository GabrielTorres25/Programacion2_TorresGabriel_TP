
package trabajo.practico.unidad.pkg5.Ejercicio10;

public class Ejercicio10 {
    public static void main(String[] args) {
        Titular tit = new Titular("El Gato Gaton", 46548654); 
        CuentaBancaria cta = new CuentaBancaria(564646594, 184915.05); 
        tit.setCta(cta);
        cta.setTitular(tit);
        System.out.println("El titular de la cuenta es: "+ cta.getTitular()); 
        System.out.println("El titular de la cuenta es: "+ tit.getNombre());
        System.out.println("Dni del titular: " + tit.getDni());
        cta.mostrarCta();
    }
}
