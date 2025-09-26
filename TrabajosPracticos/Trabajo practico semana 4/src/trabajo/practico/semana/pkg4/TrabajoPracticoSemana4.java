
package trabajo.practico.semana.pkg4;



public class TrabajoPracticoSemana4 {

   
    public static void main(String[] args) {
      Empleado emp = new Empleado(611, "Gabriel Torres", "jr", 2000000);
      Empleado emp2 = new Empleado("Martin Zapata", "jr");    
      Empleado emp3 = new Empleado(612, "GT", "jr", 2000000);
      Empleado emp4 = new Empleado("Cesar Carranza", "jr"); 
      Empleado emp5 = new Empleado("Chiqui perez", "jr"); 
      Empleado emp6 = new Empleado("Cesar Pereyra", "Picante"); 
      System.out.println(emp);
      System.out.println(emp2);
      System.out.println(emp3);
      System.out.println(emp4);
      System.out.println(emp5);
      System.out.println(emp6);
      emp.actualizarSalario(505.580);
      System.out.println(emp);
      emp3.actualizarSalario(15);
      System.out.println(emp3);
      System.out.println(Empleado.mostrarTotalEmpleados());
    }
    
}
