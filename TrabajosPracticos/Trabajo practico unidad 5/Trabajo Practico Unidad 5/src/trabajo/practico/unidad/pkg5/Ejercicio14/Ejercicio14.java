
package trabajo.practico.unidad.pkg5.Ejercicio14;

public class Ejercicio14 {
    public static void main(String[] args) {
        Proyecto pro = new Proyecto("Javaclass", "15minutos, 33segundos");
        EditorVideo ed = new EditorVideo(); 
        Render ren = ed.exportar("mp4, HD ", pro); 
        System.out.println("nombre del proyecto: "+pro.getNombre());
        
    }
}
