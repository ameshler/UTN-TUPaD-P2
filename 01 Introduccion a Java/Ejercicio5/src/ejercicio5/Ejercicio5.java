package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        //Definir scanner
        Scanner input = new Scanner(System.in);
        //Definir variables
        int num1, num2, suma, resta, mult;
        double div;
        //Solicitar valores al usuario
        System.out.print("Ingrese el primer número a operar: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número a operar: ");
        num2 = Integer.parseInt(input.nextLine());
        
        //Realizar operaciones
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = (double) num1 / num2;
        
        //Mostrar resultados
        System.out.println("Resultados:");
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " x " + num2 + " = " + mult);
        System.out.println(num1 + " / " + num2 + " = " + div);
    }
    
}
