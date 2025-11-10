
package trabajo.practico.semana.pkg3;

public class Estudiantes {
    String nombre, apellido, curso;
    double calificacion, puntos;
    
    String mostrarInfo(){
        return nombre + " "+ apellido + " es estudiante del curso " + curso + " y su calificacion es " + calificacion; 
    }
    double subirCalificacion(double puntos){
    calificacion += puntos; 
    if (puntos > 10){
    calificacion = 10;
    }
        return calificacion;
    }
    double bajarCalificacion(double puntos){
    calificacion -= puntos;
    if (puntos < 0){
    calificacion = 0;
    }
        return calificacion;
    
}
    
}