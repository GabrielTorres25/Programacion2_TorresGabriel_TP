
package trabajo.practico.unidad.pkg5.ejercicio7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; 
    private Conductor conductor; 
    
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; 
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor +  '}';
    }
    
    
    public void mostrarAuto(){
        System.out.println(toString()  + conductor);
    }
    
    
}

/*
        a. Agregación: Vehículo → Motor 
        b. Asociación bidireccional: Vehículo ↔ Conductor 
       
        */