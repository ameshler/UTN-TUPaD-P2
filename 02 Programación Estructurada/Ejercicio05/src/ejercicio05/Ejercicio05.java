package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, suma;
        suma = 0;
        
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = input.nextInt();
        
        while(numero != 0){
            if(numero % 2 == 0){
                suma += numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();
        }
        System.out.println("La suma de los numeros pares es: " + suma);
    }

}
