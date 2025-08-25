package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = input.nextInt();
        
        if((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println("El año " + anio + " es bisiesto");
        }else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }

}
