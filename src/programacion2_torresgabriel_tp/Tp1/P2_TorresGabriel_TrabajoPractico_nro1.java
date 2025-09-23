
package programacion2_torresgabriel_tp.Tp1;
import java.util.Scanner;

public class P2_TorresGabriel_TrabajoPractico_nro1 {
public class HolaMundo{
   
}
    public static void main(String[] args) {
        System.out.println((true || false) && false);
        //Ejercicio2
        //System.out.println("Hola, Java!");
        
        //Ejercicio3
        /*String nombre = "Gabriel";
        double altura = 1.82;
        int edad = 25;
        boolean estudiante = true; 
        System.out.println("Hola "+ nombre + " tenes "+ edad + " y medis "+ altura );
        System.out.println("Estudiante: " +estudiante);
        */
        
        // Ejercicio 4
        /*
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Hola " + nombre + ", tu edad es "+ edad );
        */
        
        // Ejercicio 5
        /*
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa un numero entero: ");
        int primerNro = sc.nextInt();
        System.out.println("Ingresa otro numero entero: ");
        int segundoNro = sc.nextInt();
        
        int suma = primerNro + segundoNro;
        int mul = primerNro * segundoNro;
        int div = primerNro / segundoNro;
        int res = primerNro - segundoNro;
        System.out.println(primerNro + "+" + segundoNro + "=" + suma);
        System.out.println(primerNro + "-" + segundoNro + "=" + res);
        System.out.println(primerNro + "*" + segundoNro + "=" + mul);
        System.out.println(primerNro + "/" + segundoNro + "=" + div);
        */
        
        //Ejercicio 6 
        
        //System.out.println("Nombre: Juan Perez \n Edad: 30 años \n Direccion: Calle Falsa 123");
        
        //Ejercicio 8
        
        
        Scanner sc = new Scanner (System.in);
        int primerNro;
        int segundoNro;
        System.out.println("Ingrese un numero entero");
        primerNro = sc.nextInt();
        System.out.println("Ingrese otro numero entero");
        segundoNro = sc.nextInt();
        double division = ((double)primerNro / segundoNro);
        int div = (primerNro / segundoNro);
        
        System.out.println("La division con int es igual a " + div);
        System.out.println("La division con double es igual a " + division);
        
        
        //Ejercicio 9
        /*9. Corrige el siguiente código para que funcione correctamente. Explica qué error 
        tenía y cómo lo solucionaste. 
        
        import java.util.Scanner; 
        public class ErrorEjemplo { 
        public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa tu nombre: "); 
        String nombre = scanner.nextInt(); // ERROR 
        System.out.println("Hola, " + nombre); 
} 
}
       
        import java.util.Scanner; 
        public class ErrorEjemplo { 
        public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa tu nombre: "); 
        String nombre = scanner.nextLine(); // arreglo 
        System.out.println("Hola, " + nombre); 
        
        
}       
}*/
        
               
    }
    
}
