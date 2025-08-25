package elercicio02;
import java.util.Scanner;

/**
 *
 * @author Andres Meshler
 */
public class Elercicio02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, mayor;
        
        // Pedir tres enteros al usuario
        System.out.print("Ingrese el primer entero: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo entero: ");
        num2 = input.nextInt();
        System.out.print("Ingrese el tercer entero: ");
        num3 = input.nextInt();
        
        // Obtener el mayor
        if (num1 >= num2 && num1 >= num3){
            mayor = num1;
        }else if (num2 >= num1 && num2 >= num3){
            mayor = num2;
        }else {
            mayor = num3;
        }
        
        // Informar el resultado
        System.out.println("El mayor número ingresado es: " + mayor);
    }
        

}
