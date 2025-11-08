package trabajo.practico.unidad.pkg5.Ejercicio5;

public class Propietario {
    private String nombre;
    private int dni; 
    private Computadora pc; 

    public Propietario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Computadora getPc() {
        return pc;
    }

    public void setPc(Computadora pc) {
        this.pc = pc;
        if(pc.getPp() != this){
        pc.setPp(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    public void mostrarInfo(){
       System.out.println("Datos del "+toString() + " datos de la pc: " + pc);
   }
    
    
    
}
