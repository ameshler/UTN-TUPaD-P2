
package Ejercicio05;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5 funcionando ...");
        // instanciar propietario
        Propietario propietario = new Propietario("Joel Perez", "35775029");
        // instanciar computadora 
        Computadora pc = new Computadora("ASUS", "123456789", "X515", "Z890" );
        // relacionar pc con propietario
        propietario.setComputadora(pc);

        // mostrar informacion de los objetos
        System.out.println("PC: " + propietario.getComputadora().getMarca());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo());
        System.out.println("Propietario: " + pc.getPropietario().getNombre());
}

}
