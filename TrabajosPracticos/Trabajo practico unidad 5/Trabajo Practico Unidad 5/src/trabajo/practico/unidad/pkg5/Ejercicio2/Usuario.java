
package trabajo.practico.unidad.pkg5.Ejercicio2;


public class Usuario {
    
    private String nombre;
    private int dni; 
    private Celular celular; 

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if(celular.getUsuario()!=this){
        celular.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

 
  
    
    
    
    public void mostrarInf(){
        System.out.println("Datos del "+ toString() + "tiene un " + celular);
    }
    
    

}
