package trabajo.practico.unidad.pkg5.Ejercicio1;


import trabajo.practico.unidad.pkg5.Ejercicio1.Foto;


    public class Pasaporte {
    private int numero; 
    private String fechaEmision; 
    private Foto foto; 
    private Titular titular;

    public Pasaporte(int numero, String fechaEmision) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto("4x4", "JPG"); //aca creamos la relacion de composicion
                                            
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }
    
    public int getNumero() {
        return numero;
    }
  
    
    
   
}



