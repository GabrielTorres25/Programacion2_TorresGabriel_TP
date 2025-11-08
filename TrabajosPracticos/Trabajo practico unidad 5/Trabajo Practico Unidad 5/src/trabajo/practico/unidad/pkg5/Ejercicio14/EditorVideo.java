
package trabajo.practico.unidad.pkg5.Ejercicio14;


public class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato, proyecto);
        System.out.println("EditorVideo renderizo y creo un nuevo objeto Render.");
        System.out.println("El formato del video es: "+ formato + " "+ proyecto);
        return render;
        
    }
}
