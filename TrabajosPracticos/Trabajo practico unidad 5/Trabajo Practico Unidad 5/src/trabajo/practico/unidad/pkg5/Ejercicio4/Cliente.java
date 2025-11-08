
package trabajo.practico.unidad.pkg5.Ejercicio4;


public class Cliente {
   
    private String nombre; 
    private int dni; 
    private TarjetaDeCredito tc; 

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public TarjetaDeCredito getTc() {
        return tc;
    }

    public void setTc(TarjetaDeCredito tc) {
        this.tc = tc;
        if(tc.getCliente()!= this){
        tc.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}' ;
    }

    public void mostrarDatos(){
        System.out.println(toString() +" Propietario de la " + tc);
    }
    
    
}
