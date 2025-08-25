package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precio_base = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(input.nextLine());
        
        double precio_final = calcularPrecioFinal(precio_base, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precio_final);
    }

    public static double calcularPrecioFinal(double precio_base, double impuesto, double descuento){
        double impuesto_aplicado = precio_base * impuesto / 100;
        double descuento_aplicado = precio_base * descuento / 100;
        return precio_base + impuesto_aplicado - descuento_aplicado;
    }

}
