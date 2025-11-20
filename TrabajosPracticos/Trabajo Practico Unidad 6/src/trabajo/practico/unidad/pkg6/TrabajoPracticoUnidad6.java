package trabajo.practico.unidad.pkg6;


public class TrabajoPracticoUnidad6 {

 
    public static void main(String[] args) {
        
        Producto p = new Producto("P01", "Carne", 4564.55, 100, CategoriaProducto.ALIMENTOS);  
        Producto p2 = new Producto("P02", "Productos de Limpieza", 50.5, 20, CategoriaProducto.HOGAR);  
        Producto p3 = new Producto("P03", "Televisor 50' 4k ", 500000.90, 5, CategoriaProducto.ELECTRONICA);
        Producto p4 = new Producto("P04", "Monitor 24' 4k ", 100000.90, 5, CategoriaProducto.ELECTRONICA);
        Producto p5 = new Producto("P05", "PC GAMER", 1000000.90, 5, CategoriaProducto.ELECTRONICA);
        
        Inventario inv = new Inventario();
        
        inv.agregarProducto(p);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);
        System.out.println("Lista de Productos en el inventario: ");
        inv.listarProductos();
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Producto Buscado: ");
        Producto buscado = inv.buscarProductoPorId("P04");
        System.out.println(buscado);
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Producto x categoria: ");
        
        inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Eliminar Producto 'P03', lista de productos: ");
        inv.eliminarProducto("P03");
        inv.listarProductos();
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Actualizar stock, nuevo stock:");
        inv.actualizarStock("P01", 500);
        System.out.println(inv.obtenerTotalStock());
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Producto con mayor Stock: ");
        Producto mayor = inv.obtenerProductoConMayorStock();
        System.out.println(mayor);
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Categorias Disponibles");
        inv.filtrarProductosPorPrecio(1000, 3000);
        inv.mostrarCategoriasDisponibles();
    }   
    
}
