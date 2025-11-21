package ejercicio4;
import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
          ArrayList<Animal> lista = new ArrayList<>(); 
          lista.add(new Gato()); 
          lista.add(new Vaca());
          lista.add(new Perro()); 
          for (Animal a: lista){
              a.hacerSonido();
              a.describirAnimal();  
          }  
    }
}
