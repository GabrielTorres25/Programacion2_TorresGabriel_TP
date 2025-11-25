package trabajo.practico.unidad.pkg8;

import java.io.*;
import java.util.Scanner;

public class ParteDos {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

 
        // 1. Division segura
        try {
            System.out.print("Ingrese el numerador: ");
            int a = sc.nextInt();

            System.out.print("Ingrese el divisor: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: division por cero.");
        }

        sc.nextLine(); // limpiar buffer

        // 2. Conversion de cadena a numero
        System.out.print("Ingrese un numero en texto: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Numero valido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: no es un numero valido.");
        }

        // 3. Lectura de archivo normal
        try {
            File archivo = new File("archivo.txt");
            Scanner lector = new Scanner(archivo);

            System.out.println("\nContenido del archivo:");
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe.");
        }

        // 4. Excepcion personalizada
        try {
            System.out.print("\nIngrese una edad: ");
            int edad = sc.nextInt();

            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad invalida: debe estar entre 0 y 120.");
            }

            System.out.println("Edad valida.");

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 5. try-with-resources
        System.out.println("\nLeyendo archivo con try-with-resources:");

        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }
    }
}

