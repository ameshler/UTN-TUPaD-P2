package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Pedir edad al usuario
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();
        String etapa_vida;
        
        if(edad < 12){
            etapa_vida = "Niño";
        }else if(edad >= 12 && edad <= 17){
            etapa_vida = "Adolescente";
        }else if(edad >= 18 && edad <= 59){
            etapa_vida = "Adulto";
        }else {
            etapa_vida = "Adulto mayor";
        }
        
        System.out.println("Eres un " + etapa_vida + ".");
    }
    }

