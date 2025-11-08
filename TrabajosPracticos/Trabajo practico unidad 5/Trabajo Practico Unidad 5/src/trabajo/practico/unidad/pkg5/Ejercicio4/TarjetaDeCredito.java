
package trabajo.practico.unidad.pkg5.Ejercicio4;


public class TarjetaDeCredito {
    
    private int numero;
    private String fechaVencimiento; 
    private Cliente cliente;
    private Banco banco; 

    public TarjetaDeCredito(int numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        /*if(cliente.getTc() != this){
        cliente.setTc(this);
        } */ //bucle 
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", cliente=" + cliente + ", banco=" + banco + '}';
    }

    public void mostrarDatos(){
        System.out.println(toString());
    }
    
   
   

    
    
    
}
