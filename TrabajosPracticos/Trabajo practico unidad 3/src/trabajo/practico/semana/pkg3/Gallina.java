
package trabajo.practico.semana.pkg3;

public class Gallina {
    int idGallina, edad, huevosPuestos; 
    
    void ponerHuevo(){
    huevosPuestos += 2009; 
    }; 
    void envejecer(){
    edad += 1; 
    };
    void mostrarEstado(){
        System.out.println("La gallina "+ idGallina +" puso " + huevosPuestos + " huevos, ademas paso un anio y ahora tiene " + edad +" anios");
    }; 
    
}
