package trabajo.practico.unidad.pkg5;


public class TrabajoPracticoUnidad5 {


    public static void main(String[] args) {
        //Ejercicios de Relaciones 1 a 1 
        //Ejercicio 1
        Titular titular = new Titular("Tomas Fanta", 12345678);
        Pasaporte pasaporte = new Pasaporte(98765, "16/10/2025");
        pasaporte.setTitular(titular);
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());
        System.out.println("Pasaporte del titular: " + titular.getPasaporte().getNumero());
    }
}

     
   

