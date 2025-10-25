
package stock;

import java.util.ArrayList;

/**
 *
 * @author Andres Meshler
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    
     // Métodos requeridos
    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println("Producto '" + p.getNombre() + "' agregado.");
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        
        for (Producto p : this.productos) {
            p.mostrarInfo(); // Llama al método de Producto
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        for (Producto p : this.productos) {
            if (p.getId().equals(id)) {
                return p; // Lo encontramos, lo devolvemos
            }
        }
        return null; // No se encontró
    }
    
    public void eliminarProducto(String id) {
        Producto productoAEliminar = buscarProductoPorId(id);

        if (productoAEliminar != null) {
            this.productos.remove(productoAEliminar);
            System.out.println("Producto '" + productoAEliminar.getNombre() + "' eliminado.");
        } else {
            System.out.println("No se encontró producto con ID: " + id);
        }
    }
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto productoAActualizar = buscarProductoPorId(id);

        if (productoAActualizar != null) {
            productoAActualizar.setCantidad(nuevaCantidad);
            System.out.println("Stock de '" + productoAActualizar.getNombre() + "' actualizado a " + nuevaCantidad);
        } else {
            System.out.println("No se encontró producto con ID: " + id);
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("--- Productos de la categoría: " + categoria + " ---");
        boolean encontrados = false;
        for (Producto p : this.productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron productos en esta categoría.");
        }
    }
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : this.productos) {
            total += p.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }

        Producto productoMaxStock = productos.get(0);
        
        for (int i = 1; i < productos.size(); i++) {
            Producto pActual = productos.get(i);
            if (pActual.getCantidad() > productoMaxStock.getCantidad()) {
                productoMaxStock = pActual;
            }
        }
        return productoMaxStock;
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("--- Productos con precio entre $" + min + " y $" + max + " ---");
        boolean encontrados = false;
        for (Producto p : this.productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("--- Categorías Disponibles ---");
        // Iteramos sobre todos los valores del enum
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat.name() + ": " + cat.getDescripcion());
        }
    }
}
