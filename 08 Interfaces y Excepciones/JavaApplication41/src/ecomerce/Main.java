
package ecomerce;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    
    public static void main(String[] args) {
        // 1. Crear Productos
        Producto laptop = new Producto("Laptop Gamer", 1500.00);
        Producto mouse = new Producto("Mouse Inalámbrico", 25.00);

        // 2. Crear Pedido y agregar productos
        Pedido miPedido = new Pedido();
        miPedido.agregarProducto(laptop);
        miPedido.agregarProducto(mouse);

        // 3. Crear Cliente y asociarlo al Pedido
        Cliente juan = new Cliente("Juan Perez", "juan.perez@email.com");
        miPedido.setDestinatario(juan);

        // 4. Calcular el total del pedido
        double total = miPedido.calcularTotal();
        System.out.println("Total del pedido antes de descuentos: $" + total);

        // 5. Usar dos métodos de pago (demostrando las interfaces)
        TarjetaCredito pagoTC = new TarjetaCredito();
        PayPal pagoPP = new PayPal();

        // Pago con Tarjeta (sin descuento)
        pagoTC.procesarPago(total);
        miPedido.notificaYCambiarEstado("Pagado con Tarjeta");

        // Pago con PayPal (con descuento, usando la otra interfaz)
        double totalConDescuento = pagoPP.aplicarDescuento(total);
        pagoPP.procesarPago(totalConDescuento);
        miPedido.notificaYCambiarEstado("Pagado con PayPal y Enviado");
    }

}
