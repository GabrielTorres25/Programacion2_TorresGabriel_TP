
package trabajo.practico.unidad.pkg5.ejercicio7;


public class Ejercicio7 {
    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", 54651); 
        Vehiculo auto = new Vehiculo("ABC-123", "VW POLO", motor);
        Conductor yo = new Conductor("Gabriel", "A1- B1"); 
        
        auto.setConductor(yo);
        yo.setVehiculo(auto);
        auto.mostrarAuto();
        yo.mostrarConductor();
        System.out.println("Licencia de conducir tipo: " + yo.getLicencia());

    }
}
