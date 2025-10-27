
package ecomerce;

/**
 *
 * @author Andres Meshler
 */
public class TarjetaCredito implements Pago{

    @Override
    public void procesarPago(double monto) {
        // Lógica simulada:
        System.out.println("Procesando pago con Tarjeta de Crédito por: $" + monto);
        // (Aquí iría la lógica real de conexión con un banco)
        System.out.println("¡Pago aprobado!");
    }
}
