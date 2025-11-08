
package trabajo.practico.unidad.pkg5.ejercicio7;

public class Conductor {
    private String nombre;
    private String licencia; 
    private Vehiculo vehiculo; 

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if(vehiculo.getConductor()!= this){
            vehiculo.setConductor(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia +  '}';
    }
    
        public void mostrarConductor(){
        System.out.println(toString()  + vehiculo);
    }
    
    
    
}
