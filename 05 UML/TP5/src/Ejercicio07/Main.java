
package Ejercicio07;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7 funcionando ...");
        // instanciar el conductor
        Conductor conductor = new Conductor("Valeria Meza", "132456");
        // instanciar el motor
        Motor motor = new Motor("1.6", "112233");
        // instanciar el vechiculo
        Vehiculo auto = new Vehiculo("ABC123", "VW Suran", motor);
        // asociar el auto y el conductor
        conductor.setVehiculo(auto);

        // mostrar informacion de los objetos
        System.out.println("Vehiculo: " + auto.getModelo());
        System.out.println("Motor: " + auto.getMotor().getTipo());
        System.out.println("Conductor: " + auto.getConductor().getNombre());
    
}

}
