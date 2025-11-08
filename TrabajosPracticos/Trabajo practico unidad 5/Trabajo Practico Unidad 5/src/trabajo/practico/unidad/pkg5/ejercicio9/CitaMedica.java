
package trabajo.practico.unidad.pkg5.ejercicio9;


public class CitaMedica {
    private String fecha;
    private String hora;      
    private Paciente paciente; 
    private Profesional doc; 

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional doc) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.doc = doc;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", doc=" + doc + '}';
    }

    public void mostrarCita(){
        System.out.println(toString());
    }
    
    
    
    
}


/*
        9. CitaMédica - Paciente - Profesional 
        a. Asociación unidireccional: CitaMédica → Paciente,  
        b. Asociación unidirecciona: CitaMédica → Profesional 
        Clases y atributos: 
      


        */
        