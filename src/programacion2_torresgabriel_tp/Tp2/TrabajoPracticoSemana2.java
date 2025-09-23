package programacion2_torresgabriel_tp.Tp2;

import java.util.Scanner;

public class TrabajoPracticoSemana2 {
    
    public static double calcularPrecioFinal(double impuesto, double descuento, double precioBase){
        double Impuesto = precioBase * (impuesto/100);
        double precioConImpuesto = precioBase + Impuesto; 
        double Descuento = precioConImpuesto * (descuento/100);
        double precioFinal = precioConImpuesto - Descuento; 
        return precioFinal;
    }
    
    public static double calcularCostoDeEnvio(double peso, String zona){
        
        double costoEnvio = 0;
        if (zona.equalsIgnoreCase("Nacional")){
            
            costoEnvio = peso * 5; 
        } else if (zona.equalsIgnoreCase("Internacional")){
            
            costoEnvio = peso * 10; 
        } else {
            System.out.println("Ingrese una opcion correcta");
        }
       
        return costoEnvio; 
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double precioFinal = precioProducto + costoEnvio; 
        return precioFinal;
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock; 
    }
    
     //Variable global ejercicio 11
    public static double descuentoGlobal = 0.10; 
    
    public static double calcularDescuentoEspecial(double precio){
     return precio * descuentoGlobal;
    }
    
    public static void funcionRecursiva(double[] precios, int i){
        if(i >= precios.length){
             return; 
        }
        
        System.out.println("El precio es: " + precios[i] );
      
        funcionRecursiva(precios, i + 1); 
    }
    
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        
        // Ejercicio Uno "Año bisiesto"
        System.out.println("Ingrese un anio");
        int anio = sc.nextInt();
        if (((anio % 4 == 0) && (anio % 100 !=0)) || (anio % 400 == 0)){
            System.out.println("El anio "+ anio +" es bisiesto");
        }
        else{
            System.out.println("El anio "+ anio +" no es bisiesto");
        }
        
    
        /*
        // Ejercicio Dos "El mayor nro de 3"
        System.out.println("Ingrese un numero");
        int prNro = sc.nextInt(); 
        System.out.println("Ingrese otro numero");
        int seNro = sc.nextInt();
        System.out.println("Ingrese otro numero");
        int trNro = sc.nextInt();
        
        if ((prNro > seNro) && (prNro > trNro)){
            System.out.println("El mayor numero de estos tres es "+ prNro);
        } 
        else if ((seNro > prNro) && (seNro > trNro)){
            System.out.println("El mayor numero de estos tres es "+ seNro);
        }
        else {
            System.out.println("El mayor numero es " + trNro );
        }
        */
        
        /*
        // Ejercicio 3 "Clasificacion de Edad"
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt(); 
        if (edad < 12){
            System.out.println("Eres un Ninio");
        }
        else if (edad > 12 && edad < 17){
            System.out.println("Eres un Adolescente");
        }
        else if (edad > 18  && edad < 60){
            System.out.println("Eres un Adulto.");
        }
        else if (edad >= 60){
            System.out.println("Eres un Adulto mayor.");
        }
        */
      /*
        // Ejercicio 4 "Calculadora de Descuento segun categoria"
        
        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la categoría del producto (A, B o C)");
        String cat = sc.nextLine();
        double prFinal; 
        if (cat.equalsIgnoreCase("A")){
            prFinal = (precio - ((precio * 10) / 100)) ;
            System.out.println("Descuento aplicado 10%");
            System.out.println("Precio final: "+ prFinal);
        }
        else if (cat.equalsIgnoreCase("B")){
            prFinal = (precio - ((precio * 15) / 100));
            System.out.println("Descuento aplicado 15%");
            System.out.println("Precio final: "+ prFinal);
        }
        else if (cat.equalsIgnoreCase("C")){
            prFinal = (precio - ((precio * 20) / 100));
            System.out.println("Descuento aplicado 20%");
            System.out.println("Precio final: "+ prFinal);
        }
        else {
            System.out.println("La categoria ingresada es incorrecta");
        }
        */
        /*
        // Ejercicio 5 "Suma de Números Pares (while)"
        int suma = 0;
        int nro;

        System.out.print("Ingrese un número (0 para terminar): ");
        nro = sc.nextInt();

        while (nro != 0) {
            if (nro % 2 == 0) {
                suma += nro;
            }
            
            System.out.print("Ingrese un número (0 para terminar): ");
            nro = sc.nextInt();
        }

        System.out.println("La suma de los números pares es: " + suma);
     */     
    /*
        //Ejercicio 6 "Contador de Positivos, Negativos y Ceros (for)"
            System.out.println("A continuacion ingrese 10 numeros enteros porfavor");
            int pos = 0; 
            int neg = 0;
            int cero = 0;
        for(int i = 1; i < 11; i++){
            System.out.println(" Ingrese el " + i + " nro: " );
            int nro = sc.nextInt();
            
            if (nro > 0){
            pos += 1; 
            } 
            else if (nro < 0){
            neg += 1;
            }
            else{
            cero +=1 ;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Hay " + pos + " numeros positivos");
        System.out.println("Hay " + neg + " numeros negativos");
        System.out.println("Hay " + cero + " numeros 0");
        
        */
         /*
        
        //Ejercicio 7 "Validación de Nota entre 0 y 10 (do-while)"
         
        int nota;
        do{
            System.out.println("Ingresa una nota entre 0 y 10");
            nota = sc.nextInt();  
            if(nota < 0 || nota > 10){
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10. ");             
            }
            else{
                System.out.println("Nota guardada correctamente.");
            }
        } 
        while(nota < 0 || nota > 10);
        */
        
          /*    
   //Funciones
        //Ejercicio 8 "Cálculo del Precio Final con impuesto y descuento"
        
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10");
        double impuesto = sc.nextInt(); 
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5 ");
        double descuento = sc.nextInt();
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();
        
        System.out.println(calcularPrecioFinal(impuesto, descuento, precioBase));
        */
        
        /*
        //Ejercicio 9 "Composición de funciones para calcular costo de envío y total de compra. "
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble(); 
        System.out.println("Ingrese la zona de envio(Nacional/Internacional)");
        String zona = sc.next(); 
        double costoEnvio = calcularCostoDeEnvio(peso, zona);
        System.out.println("El costo de envio es: " + costoEnvio);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El precio final a pagar es: " + total);
        */
        
        
        /*
        //Ejercicio 10 "Actualización de stock a partir de venta y recepción de productos" 
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = sc.nextInt();
        System.out.print("Ingrese la cantidad vendida de productos: ");
        int cantidadVendida = sc.nextInt();
        System.out.print("Ingrese la cantidad recibida de productos: ");
        int cantidadRecibida = sc.nextInt();
        int stockFinal = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El stock actual es: " + stockFinal);
        */
        
        /*
        //Ejercicio 11 "Cálculo de descuento especial usando variable global"
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        double descuentoAplicado = calcularDescuentoEspecial(precio); 
        double precioFinal = precio - descuentoAplicado; 
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
        */
        
        
        /*
        //Arrays y Recursividad
        //Ejercicio 12 "Modificación de un array de precios y visualización de resultados" 
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99}; 
        System.out.println("Precios originales: ");
        for (int i = 0; i < precios.length; i++){
            System.out.println("Precio: "+ precios[i]);
        }
        System.out.println("Precios modificados");
        precios[2] = 129.99; 
        for (int i = 0; i < precios.length; i++){
            System.out.println("Precio: "+ precios[i]);
        }
        
        */
        
        //Ejercicio 13 "Impresión recursiva de arrays antes y después de modificar un elemento"
         double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
         funcionRecursiva(precios, 0);
         
    }
       
    
       

}
    
        
      