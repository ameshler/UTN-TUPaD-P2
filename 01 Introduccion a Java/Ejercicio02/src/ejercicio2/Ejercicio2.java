package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int largoTerreno, anchoTerreno, precioMetro2, valorTerreno, longitudAlambre;
        
        System.out.println("Ingrese el largo del terreno en metros: ");
        largoTerreno = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el ancho del terreno en metros: ");
        anchoTerreno = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el precio del metro cuadrado en USD: ");
        precioMetro2 = Integer.parseInt(input.nextLine());
        
        valorTerreno = largoTerreno * anchoTerreno * precioMetro2;
        
        longitudAlambre = (2 * (largoTerreno + anchoTerreno)) * 3;
        
        System.out.println("El valor del terreno es de: USD " + valorTerreno);
        System.out.println("La longitud del alambre es de: " + longitudAlambre + " metros");
    }
    
}
