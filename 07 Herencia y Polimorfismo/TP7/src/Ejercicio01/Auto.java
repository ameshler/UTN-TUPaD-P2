
package Ejercicio01;

/**
 *
 * @author Andres Meshler
 */
public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        
        System.out.println("--- Info del Auto ---");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Puertas: " + this.cantidadPuertas);
    }
}
