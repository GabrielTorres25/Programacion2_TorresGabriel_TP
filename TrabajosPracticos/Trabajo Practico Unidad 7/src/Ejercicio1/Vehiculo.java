package Ejercicio1;



public class Vehiculo {
    
    protected String marca; 
    protected String modelo; 

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Marca del vehiculo: "+ marca + ", modelo: " + modelo);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
    
}
