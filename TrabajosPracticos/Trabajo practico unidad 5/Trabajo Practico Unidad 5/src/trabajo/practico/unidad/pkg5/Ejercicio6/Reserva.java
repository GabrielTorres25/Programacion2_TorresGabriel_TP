
package trabajo.practico.unidad.pkg5.Ejercicio6;


public class Reserva {
    private String fecha;
    private String hora;
    private ClienteEj6 cliente;
    private Mesa mesa; 

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(ClienteEj6 cliente) {
        this.cliente = cliente;
    }
   
    
 

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", mesa=" + mesa + '}';
    }
    
    
    public void mostrarReserva(){
        System.out.println(toString());
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public ClienteEj6 getCliente() {
        return cliente;
    }


    public Mesa getMesa() {
        return mesa;
    }
    
}
