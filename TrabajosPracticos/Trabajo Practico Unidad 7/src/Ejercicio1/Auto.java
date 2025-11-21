package Ejercicio1;



public class Auto extends Vehiculo {
    
    private int cantidadPuertas; 

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Auto{" + "cantidadPuertas=" + cantidadPuertas + '}';
    }
    
    

    @Override
    public void mostrarInfo() {
        System.out.println("Marca del auto: "+ marca + ", modelo: " + modelo + ", cantidad de puertas: " + cantidadPuertas); 
    }


    
    
    
    
    
}
