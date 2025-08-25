package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int porc_descuento;
        float precio, precio_final;
        String categoria;
        System.out.print("Ingrese el precio del producto: ");
        precio = Float.parseFloat(input.nextLine());
        
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        categoria = input.nextLine();
        
        porc_descuento = obtenerDescuento(categoria);
        precio_final= calcularPrecioFinal(porc_descuento, precio);
        
        System.out.println("Descuento aplicado: " + porc_descuento + "%");
        System.out.println("Precio final: " + precio_final);
    }
    public static int obtenerDescuento(String categoria){
        int porc_descuento;
        switch(categoria.toUpperCase()){
            case "A":
                porc_descuento = 10;
                break;
            case "B":
                porc_descuento = 15;
                break;
            case "C":
                porc_descuento = 20;
                break;
            default:
                porc_descuento = 0;
                break;
        }
        return porc_descuento;
    }
    
    public static float calcularPrecioFinal (int porc_descuento, float precio){
        
        float precio_final = precio - precio * porc_descuento/100;
        
        return precio_final;
    }
}
