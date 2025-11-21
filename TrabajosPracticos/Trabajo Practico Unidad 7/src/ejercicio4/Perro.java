package ejercicio4;


public class Perro extends Animal{
   
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }

    @Override
    public void describirAnimal() {
        System.out.println("El perro ladra");
    } 
}
