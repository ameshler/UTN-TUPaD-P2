
package Ejercicio04;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 4 funcionando ...");
        // instanciar el cliente
        Cliente cliente = new Cliente("Sabrina Sanz", "29825632");
        // instanciar el banco
        Banco banco = new Banco("Galicia", "30-60123456-7");
        // instanciar tarjeta
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("6012 4255 3285 2369", "2028-06-30", banco);
        // asociar la tarjeta con el cliente
        cliente.setTarjetaDeCredito(tarjeta);
    
        // mostrar informacion de los objetos
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Banco: " + cliente.getTarjetaDeCredito().getBanco().getNombre());
        System.out.println("Vencimiento tarjeta de crédito: " + cliente.getTarjetaDeCredito().getFechaVencimiento());
}

}
