package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio11 {
    //variable global DESCUENTO
    static final double DESCUENTO = 0.10;
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        
        double descuento_aplicado = calcularDescuentoEspecial(precio);
        System.out.println("El descuento especial aplicado es: " + descuento_aplicado);
        
        double precio_final = precio - descuento_aplicado;
        System.out.println("El precio final con descuento es: " + precio_final);

    }
    public static double calcularDescuentoEspecial(double precio){
        double descuento_aplicado = precio * DESCUENTO;
        return descuento_aplicado;
    }
}
