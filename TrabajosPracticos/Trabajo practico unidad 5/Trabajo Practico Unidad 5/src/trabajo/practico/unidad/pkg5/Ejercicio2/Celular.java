
package trabajo.practico.unidad.pkg5.Ejercicio2;


public class Celular {
    
    
    private double imei; 
    private String marca;
    private String modelo;
    private Usuario usuario;
    private Bateria bateria;

    public Celular(double imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if(usuario.getCelular() != this){
        usuario.setCelular(this);
        }
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + '}';
    }




    
    
    
   
    public void mostrarCelu(){
        System.out.println("Datos del " + toString() + ", el duenio del celular es: " + usuario);
}

   
}
