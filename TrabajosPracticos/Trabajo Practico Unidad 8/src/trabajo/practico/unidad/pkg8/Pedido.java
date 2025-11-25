
package trabajo.practico.unidad.pkg8;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    private List<Producto> productos = new ArrayList<>();
    private String estado;
    private Notificable cliente;   

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El estado del pedido cambio a: " + nuevoEstado);
    }
}