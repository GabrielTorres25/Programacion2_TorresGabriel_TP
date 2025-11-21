
package Ejercicio3;

public class EmpleadoPlanta extends Empleado{
    private double sueldoBasico; 
    private int antiguedad;

    public EmpleadoPlanta(double sueldoBasico, int antiguedad, String nombre) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico + (antiguedad * 10000); 
    }

    @Override
    public String toString() {
        return "EmpleadoPlanta{" + "sueldoBasico=" + sueldoBasico + ", antiguedad=" + antiguedad + '}';
    }
}