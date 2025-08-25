package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio_producto = input.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();
        input.nextLine();
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();
        
        double costo_envio = calcularCostoEnvio(peso,zona);
        double total_compra = calcularTotalCompra(precio_producto, costo_envio);
        
        System.out.println("El costo de envío es: " + costo_envio);
        System.out.println("El total a pagar es: " + total_compra);
    }
    public static double calcularCostoEnvio(double peso, String zona){
        double costo_envio;
        switch(zona.toUpperCase()){
            case "NACIONAL":
                costo_envio = peso * 5;
                break;
            case "INTERNACIONAL":
                costo_envio = peso * 10;
                break;
            default:
                costo_envio = 0;
                break;
        }
        return costo_envio;
    }
    public static double  calcularTotalCompra(double precio_producto, double costo_envio){
        return precio_producto + costo_envio;
    }
}
