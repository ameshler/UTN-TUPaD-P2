package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, positivos, negativos, ceros;
        positivos = negativos = ceros =0;
        // Pedir 10 numeros al usuario
        for(int i = 1; i <= 10; i++){
            System.out.print("Ingrese el número " + i + ": ");
            numero = input.nextInt();
            
            if(numero == 0){
                ceros++;
            }else if(numero > 0){
                positivos++;
            }else {
                negativos++;
            }
        }
        System.out.println("Resultados: ");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

}
