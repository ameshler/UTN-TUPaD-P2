package stock;

/**
 *
 * @author Andres Meshler
 */
public class Stock {

    public static void main(String[] args) {
        
        // Instanciar inventario
        Inventario inventario = new Inventario();
        
        // --- 1: Crear y agregar al inventario 5 productos ---
        System.out.println("--- 1: AGREGANDO PRODUCTOS ---");
        inventario.agregarProducto(new Producto("A001", "Laptop Gamer", 250000, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("A002", "Teclado Mecánico", 15000, 30, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("B001", "Jeans", 50000, 50, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("C001", "Café Molido", 1000, 100, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("D001", "Silla de Oficina", 30000, 20, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("B002", "Remera", 2500, 80, CategoriaProducto.ROPA));
        System.out.println("\n");

        // --- 2: Listar todos los productos ---
        System.out.println("--- 2: LISTADO DE PRODUCTOS ---");
        inventario.listarProductos();
        System.out.println("\n");
        
        // --- 3: Buscar un producto por ID ---
        System.out.println("--- 3: BUSCAR PRODUCTO 'A001' ---");
        Producto pBuscado = inventario.buscarProductoPorId("A001");
        if (pBuscado != null) {
            pBuscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        System.out.println("\n");
        
        // --- 4: Filtrar por categoría ---
        System.out.println("--- 4: FILTRAR POR CATEGORÍA 'ROPA' ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ROPA);
        System.out.println("\n");
        
        // --- 5: Eliminar un producto ---
        System.out.println("--- 5: ELIMINAR PRODUCTO 'C001' ---");
        inventario.eliminarProducto("C001");
        System.out.println("--- Lista post-eliminación ---");
        inventario.listarProductos();
        System.out.println("\n");
        
        // --- 6: Actualizar stock ---
        System.out.println("--- 6: ACTUALIZAR STOCK 'A001' A 15 UNIDADES ---");
        inventario.actualizarStock("A001", 15);
        pBuscado = inventario.buscarProductoPorId("A001");
        if (pBuscado != null) {
            pBuscado.mostrarInfo();
        }
        System.out.println("\n");
        
        // --- 7: Mostrar total de stock ---
        System.out.println("--- 7: TOTAL STOCK DISPONIBLE ---");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("El stock total de todos los productos es: " + totalStock);
        System.out.println("\n");
        
        // --- 8: Mostrar producto con mayor stock ---
        System.out.println("--- TAREA 8: PRODUCTO CON MAYOR STOCK ---");
        Producto pMaxStock = inventario.obtenerProductoConMayorStock();
        if (pMaxStock != null) {
            System.out.println("El producto con mayor stock es:");
            pMaxStock.mostrarInfo();
        }
        System.out.println("\n");
        
        // --- 9: Filtrar por rango de precio $1000-$3000 ---
        System.out.println("--- TAREA 9: FILTRAR PRECIOS ENTRE $100 y $500 ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);
        System.out.println("\n");
        
        // --- 10: Mostrar categorías disponibles ---
        System.out.println("--- 10: CATEGORÍAS DISPONIBLES ---");
        inventario.mostrarCategoriasDisponibles();
        System.out.println("\n");
    }
    
}
