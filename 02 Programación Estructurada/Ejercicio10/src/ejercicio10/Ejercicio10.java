package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el stock actual del producto: ");
        int stock_actual = input.nextInt();
        
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidad_vendida = input.nextInt();
        
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidad_recibida = input.nextInt();
        
        int nuevo_stock = actualizarStock(stock_actual, cantidad_vendida, cantidad_recibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevo_stock);
    }
    public static int actualizarStock(int stock_actual, int cantidad_vendida, int cantidad_recibida){
        int nuevo_stock = stock_actual - cantidad_vendida + cantidad_recibida;
        return nuevo_stock;
    }
}
