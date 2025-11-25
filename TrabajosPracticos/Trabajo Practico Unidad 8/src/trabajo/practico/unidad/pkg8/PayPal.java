
package trabajo.practico.unidad.pkg8;

public class PayPal implements Pago, PagoConDescuento {

    @Override
    public double procesarPago(double monto) {
        return monto; // sin recargo
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% de descuento
    }
}