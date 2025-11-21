package Ejercicio2;


public class Ejercicio2 {
       
    public static void main(String[] args) {
        Figura[] figuras = new Figura[4]; 
        figuras[0] = new Circulo(15.2, "circulito"); 
        figuras[1] = new Rectangulo(15.5, 12.4, "rectangulito xd");
        figuras[2] = new Circulo(10.4, "Circulon"); 
        figuras[3] = new Rectangulo(15.4, 45.5, "Rectangulon"); 
        
        
        for(Figura f: figuras){
            System.out.println(f.nombre + ", Area: " + f.calcularArea());
        }
              
           
    }
}
