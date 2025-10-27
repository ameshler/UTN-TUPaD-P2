
package ecomerce;

/**
 *
 * @author Andres Meshler
 */
public class PayPal implements PagoConDescuento {
    
    @Override
    public void procesarPago(double monto) {
        // Lógica simulada:
        System.out.println("Procesando pago con PayPal por: $" + monto);
        // (Aquí iría la lógica real de conexión con la API de PayPal)
        System.out.println("¡Pago aprobado!");
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        // Lógica simulada: PayPal aplica un 5% de descuento
        double descuento = monto * 0.05;
        double montoConDescuento = monto - descuento;
        System.out.println("Aplicando descuento de PayPal (5%): -$" + descuento);
        return montoConDescuento;
    }

}
