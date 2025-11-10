
package trabajo.practico.semana.pkg3;


public class Mascota {
    String nombre, especie;
    int edad; 
    
    void mostrarInfo(){
        System.out.println("El nombre de la mascota es " + nombre + " es de raza " + especie + " y tiene " + edad + " anios");
    }
    
    void cumplirAnios(){
        edad += 1; 
        System.out.println("Feliz cumple a su mascota! ahora tiene "+ edad + " anios");
    }
}
