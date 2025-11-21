package Ejercicio3;

public class EmpleadoTemporal extends Empleado{ 
    private double valorHora; 
    private double horasTrabajadas; 

    public EmpleadoTemporal(double valorHora, double horasTrabajadas, String nombre) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal{" + "valorHora=" + valorHora + ", horasTrabajadas=" + horasTrabajadas + '}';
    }
    
}
