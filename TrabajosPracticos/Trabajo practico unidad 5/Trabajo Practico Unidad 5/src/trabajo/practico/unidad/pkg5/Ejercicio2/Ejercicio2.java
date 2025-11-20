package trabajo.practico.unidad.pkg5.Ejercicio2;


public class Ejercicio2 {
    public static void main(String[] args) {
        Usuario user = new Usuario("Gabriel",4564655);  
        Bateria bat = new Bateria("xs5c", "45amperes"); 
        Celular cel = new Celular(51555.21, "motorola", "motoG50", bat);
        cel.setUsuario(user); 
        cel.mostrarCelu();
        user.setCelular(cel);
        user.mostrarInf();
        
    }
}
