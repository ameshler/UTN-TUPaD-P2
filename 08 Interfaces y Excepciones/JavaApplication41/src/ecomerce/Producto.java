
package ecomerce;

/**
 *
 * @author Andres Meshler
 */
public class Producto implements Pagable {
    
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularTotal() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", precio: $" + precio;
    }
    
    
    
    

}
