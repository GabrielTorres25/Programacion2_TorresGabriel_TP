
package trabajo.practico.unidad.pkg5.Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args) {
        Mesa mesa = new Mesa(15, 4); 
        ClienteEj6 cliente = new ClienteEj6("Gabriel", 48851313);  
        Reserva reserva = new Reserva("20 de abril", "14hs", mesa);
        reserva.setCliente(cliente);
     
        reserva.mostrarReserva();
        System.out.println(reserva.getCliente());
        System.out.println(reserva.getFecha());
        
    }
}
