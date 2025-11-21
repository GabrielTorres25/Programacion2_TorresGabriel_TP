
package Ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
       
        ArrayList <Empleado> empleados = new ArrayList<>();         
       
        empleados.add(new EmpleadoPlanta(2050541, 1, "Gabriel"));
        empleados.add(new EmpleadoPlanta(2050541, 3, "Gabi"));
        empleados.add(new EmpleadoPlanta(2050541, 5, "Rocio"));
        empleados.add(new EmpleadoPlanta(1950481, 1, "Rosario"));
        empleados.add(new EmpleadoTemporal(8000, 160, "Gabriel"));
        empleados.add(new EmpleadoTemporal(8000, 160, "Lucia"));
        empleados.add(new EmpleadoTemporal(8000, 160, "Pepe"));
        empleados.add(new EmpleadoTemporal(8000, 160, "Lourdes"));
        
        for (Empleado e: empleados){
            if(e instanceof EmpleadoPlanta){
             System.out.println("Empleado de planta: "+ e.getNombre() +" sueldo: '"+ e.calcularSueldo()+"$'");
            }
            else if(e instanceof EmpleadoTemporal){
             System.out.println("Empleado temporal: "+ e.getNombre() +" sueldo: '"+ e.calcularSueldo()+"$'");
            }
        }      
    }
}
