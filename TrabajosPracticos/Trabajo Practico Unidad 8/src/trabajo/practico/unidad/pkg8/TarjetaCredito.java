
package trabajo.practico.unidad.pkg8;


public class TarjetaCredito implements Pago {

    @Override
    public double procesarPago(double monto) {
        return monto * 1.05; // 5% de interes
    }
}


