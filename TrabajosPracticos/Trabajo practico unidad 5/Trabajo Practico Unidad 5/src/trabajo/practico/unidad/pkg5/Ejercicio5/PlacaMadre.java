package trabajo.practico.unidad.pkg5.Ejercicio5;


public class PlacaMadre {
    private String modelo;
    private String chipset;  
   
    
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipset=" + chipset + '}';
    }

    
    
    
   
}
