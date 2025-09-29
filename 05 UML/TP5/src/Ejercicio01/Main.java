
package Ejercicio01;

/**
 *
 * @author Andres Meshler
 */
public class Main {
     public static void main(String[] args) {
        System.out.println("Ejercicio 1 funcionando ...");
        // instanciar titular
        Titular titular = new Titular("Alejandro Martinez", "36123456");
        // instanciar pasaporte
        Pasaporte pasaporte = new Pasaporte("0001", "2025-09-27", "foto.jpg", "JPG");
        // asignar el pasaporte al titular
        titular.setPasaporte(pasaporte);
        
        // mostrar informacion de los objetos creados:
        System.out.println("Numero de pasaporte: " + pasaporte.getNumero());
        System.out.println("Fecha de emisión: " + pasaporte.getFechaEmision());
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
    }
}
