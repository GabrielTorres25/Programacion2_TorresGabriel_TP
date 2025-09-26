package trabajo.practico.semana.pkg4;


public class Empleado {
    private int id;
    private String nombre; 
    private String puesto; 
    private double salario; 
    public static int totalEmpleados; 
    public static int contador = 1;
    
    //constructores 
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario; 
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto){
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = contador;
        contador++;
        salario = 800000; 
        totalEmpleados++;
    }
    
    
    //getters y setters 

    public int getId() {
        return id;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


     
    
    //metodos
    public void actualizarSalario(int porcentaje){ 
        salario = salario * (1 + porcentaje/100.0); 
    }
    
    public void actualizarSalario(double aumentoFijo){
        salario += aumentoFijo; 
    }
    
    @Override
    public String toString(){
        return  "Empleado {id: "+ id +", nombre: " + nombre + ", puesto: " + puesto + ", salario="+ salario +"}"; 
    }
    
    public static int mostrarTotalEmpleados(){
    return totalEmpleados; 
    }
    
    
    
    
}
