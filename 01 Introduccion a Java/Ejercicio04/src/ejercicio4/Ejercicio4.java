
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nombre, edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = input.nextLine();
        
        System.out.println("Hola " + nombre + ", usted tiene " + edad + " años.");
    }
    
}
