package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio9 {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in); 
         System.out.print("Ingresa tu nombre: ");
         
         //String nombre = scanner.nextInt(); // ERROR: no se puede asignar un entero a una variable de tipo string
         String nombre = scanner.nextLine();
         System.out.println("Hola, " + nombre); 

    }

}
