package trabajo.practico.unidad.pkg8;

public class TrabajoPracticoUnidad8 {

    public static void main(String[] args) {

        Cliente c = new Cliente("Gabriel");
        Pedido pedido = new Pedido(c);

        pedido.agregarProducto(new Producto("Mouse", 3000));
        pedido.agregarProducto(new Producto("Teclado", 8000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: " + total);

        Pago metodoPago = new TarjetaCredito();
        double totalFinal = metodoPago.procesarPago(total);
        System.out.println("Total con Tarjeta: " + totalFinal);

        pedido.setEstado("En preparacion");
        pedido.setEstado("Enviado");
    }
  }
    
    
