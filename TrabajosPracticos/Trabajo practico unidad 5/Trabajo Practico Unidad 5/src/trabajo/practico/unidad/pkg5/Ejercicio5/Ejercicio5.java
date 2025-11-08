
package trabajo.practico.unidad.pkg5.Ejercicio5;


public class Ejercicio5 {
    public static void main(String[] args) {
        Computadora pc = new Computadora("philips", 46.5431, "45sd6g1s4d3", "Chip26513X");
        Propietario pp = new Propietario("Senior X", 54654984); 
        
        pc.setPp(pp);
        pp.setPc(pc);
        
        pp.mostrarInfo();
        pc.mostrarInfo();
        
        System.out.println(pc.getMarca());
    }
}
