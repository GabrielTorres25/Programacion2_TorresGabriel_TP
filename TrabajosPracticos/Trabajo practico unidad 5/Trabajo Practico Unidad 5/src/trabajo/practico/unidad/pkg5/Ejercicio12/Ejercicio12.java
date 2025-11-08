
package trabajo.practico.unidad.pkg5.Ejercicio12;

public class Ejercicio12 {
    public static void main(String[] args) {
        Contribuyente cont = new Contribuyente("Gabriel", "22-4651484-4"); 
        Impuesto imp = new Impuesto(645646.45, cont); 
        System.out.println(imp.getMonto());
        Calculadora cal = new Calculadora(); 
        cal.calcular(imp);
    
    }
}
