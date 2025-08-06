package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Definir variables como entero segun la consigna a.
        //int num1, num2, div;
        double num1, num2, div; //se redefinen las variables como double (consigna b) para que el resultado de la division admita decimales.
        //Pedir valores al usuario
        System.out.print("Ingrese el primer numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo numero entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        div = num1 / num2;
        
        System.out.println("El resultado de " + num1 + " / " + num2 + " es " + div);
        
    }

}
