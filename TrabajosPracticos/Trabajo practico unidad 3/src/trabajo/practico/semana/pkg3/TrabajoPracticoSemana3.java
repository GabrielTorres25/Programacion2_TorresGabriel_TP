
package trabajo.practico.semana.pkg3;

public class TrabajoPracticoSemana3 {

   
    public static void main(String[] args) {
        
        
        /*
        //Ejercicio 1 "Registro de Estudiantes"
        Estudiantes utn = new Estudiantes();
        utn.nombre = "GaBriel";
        utn.apellido = "torres";
        utn.curso = "Programacion con Java";
        utn.calificacion = 8.6; 
        System.out.println(utn.mostrarInfo());
        System.out.println("la calificacion final aumentada es " + utn.subirCalificacion(0.8));
        System.out.println("la calificacion final disminuida es " + utn.bajarCalificacion(1.9));
        */
        /*
        //Ejercicio 2 "Registro de Mascotas"
        Mascota pyg = new Mascota(); 
        pyg.nombre = "perrito";
        pyg.especie = "callejero"; 
        pyg.edad = 8; 
        pyg.mostrarInfo();
        pyg.cumplirAnios();
        pyg.mostrarInfo();
        pyg.cumplirAnios();
        pyg.mostrarInfo();
        pyg.cumplirAnios();
        pyg.mostrarInfo();
        */
        /*
        //Ejercicio 3 "Encapsulamiento con la Clase Libro"
        Libro book = new Libro();
        book.ponerTitulo("Martin Fierro"); 
        book.ponerAutor("Jose Hernandez");
        book.setAnioPublicacion(1879); 
        book.mostrarInfo();
        book.setAnioPublicacion(-15);
        book.mostrarInfo();
        */
        /*
        //Ejercicio 4 "Gestión de Gallinas en Granja Digital"
        Gallina talleres = new Gallina(); 
        talleres.edad = 112;
        talleres.idGallina = 25; 
        talleres.huevosPuestos = 0; 
        talleres.mostrarEstado();
        talleres.ponerHuevo();
        talleres.envejecer();
        talleres.mostrarEstado();
        talleres.ponerHuevo();
        talleres.envejecer();
        talleres.mostrarEstado();
        
        Gallina riber = new Gallina(); 
        riber.edad = 128; 
        riber.idGallina = 2011;
        riber.huevosPuestos = 0;
        riber.mostrarEstado();
        riber.ponerHuevo();
        riber.envejecer(); 
        riber.mostrarEstado();
        riber.ponerHuevo();
        riber.envejecer(); 
        riber.mostrarEstado();
        */
        
        //Ejercicio 5 "Simulación de Nave Espacial"
        NaveEspacial buzz = new NaveEspacial();
        buzz.combustible = 30; 
        buzz.combustibleMaximo = 50;
        buzz.nombre = "Buzz Lightyear";
        buzz.despegar();
        buzz.avanzar(30);
        buzz.mostrarEstado();
        buzz.avanzar(10);
        buzz.mostrarEstado();
        buzz.recargarCombustible(40);
        buzz.mostrarEstado();
        buzz.avanzar(30);
        buzz.mostrarEstado();
    }
    
}
