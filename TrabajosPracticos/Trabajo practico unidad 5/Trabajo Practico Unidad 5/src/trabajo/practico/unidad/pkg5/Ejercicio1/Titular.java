package trabajo.practico.unidad.pkg5.Ejercicio1;

public class Titular {
    private String nombre; 
    private int dni; 
    private Pasaporte pasaporte;

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    public String getNombre() {
    return nombre;
}

}
