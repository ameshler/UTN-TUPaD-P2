
package Ejercicio06;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 6 funcionando ...");
        // instanciar cliente
        Cliente cliente = new Cliente("Jose Mino", "3424863259");
        //instanciar mesa
        Mesa mesa = new Mesa("3", "4");
        // instanciar reserva
        Reserva reserva = new Reserva("2025-10-03", "21:00", mesa);
        // asociar cliente y reserta
        reserva.setCliente(cliente);

        // mostrar informacion de la reserva
        System.out.println("Fecha Reserva: " + reserva.getFecha() + " " + reserva.getHora() + " hs.");
        System.out.println("Mesa: " + reserva.getMesa().getNumero());
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Telefono: " + reserva.getCliente().getTelefono());
}
}
