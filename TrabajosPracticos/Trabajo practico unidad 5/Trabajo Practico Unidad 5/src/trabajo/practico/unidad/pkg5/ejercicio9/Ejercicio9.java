
package trabajo.practico.unidad.pkg5.ejercicio9;

public class Ejercicio9 {
    public static void main(String[] args) {
        Paciente p = new Paciente("Gabriel", "Apross");
        Profesional doc = new Profesional("Doc oc.", "Oculista"); 
        CitaMedica cit = new CitaMedica("15 de Noviembre", "14hs", p, doc); 
        cit.mostrarCita();
        
    }
}
