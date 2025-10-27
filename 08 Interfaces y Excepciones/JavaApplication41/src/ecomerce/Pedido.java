
package ecomerce;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres Meshler
 */
public class Pedido implements Pagable{
    
    private List<Producto> productos;
    
    private Cliente destinatario;
    private String estado = "Pendiente";

    public Pedido() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }
    
    @Override
    public double calcularTotal() {
        double totalPedido = 0.0;
        
        for (Producto prod : this.productos) {
            // Llamamos al método calcularTotal() de CADA producto
            totalPedido += prod.calcularTotal(); 
        }
        
        return totalPedido;
    }
    
    public void notificaYCambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("\nEl estado del pedido ha cambiado a: " + nuevoEstado);
        
        if (destinatario != null) {
            String mensaje = "Su pedido ha cambiado de estado a: " + nuevoEstado;
            // Llamamos al método notificar() definido en la interfaz
            destinatario.notificar(mensaje); 
        }
    }

}
