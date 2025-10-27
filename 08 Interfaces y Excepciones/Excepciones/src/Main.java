
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Andres Meshler
 */
public class Main {

    public static void main(String[] args) {
        
       // 2.1- Probar la division segura
       divisionSegura();
       
       // 2.2- Probar la conversion cadena
       conversionDeCadena();
       
       // 2.3 y 2.5- Probar lectura de archivo
       // Caso de error lectura de 'archivo_inexistente.txt'
       lecturaDeArchivo("archivo_inexistente.txt");
       // Caso de éxito lectura de 'archivo_prueba.txt'
       lecturaDeArchivo("archivo_prueba.txt");
       
       // 2.4- Probar la excepcion personalizada
       validarEdadPersonalizada();
      
    }
    
    public static void divisionSegura() {
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("\nEjercicio 2.1- Division Segura:");

        try {
            System.out.print("Ingrese un entero para el numerador: ");
            num1 = scan.nextInt();

            System.out.print("Ingrese un entero para el denominador: ");
            num2 = scan.nextInt();

            int resultado = num1/num2;

            System.out.println("El resultado de " + num1 + " / " + num2 + " es: " + resultado);

        }catch(ArithmeticException e){
            // Capturar error de operación
            System.err.println("¡Error de operación! No se puede dividir por cero.");

        }catch(InputMismatchException e) {
            // Capturar error al ingresar texto y no un entero
            System.err.println("¡Error de entrada! Debe ingresar números enteros válidos.");
            // Limpiar el buffer del scanner
            scan.nextLine();

        }catch (Exception e) {
            // Captura cualquier otra excepción no prevista
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
            
        } finally {
            // El bloque finally se ejecuta siempre, haya o no excepción
            System.out.println("Fin del intento de división.");
        }
    }
    
    public static void conversionDeCadena() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEjercicio 2.2- Conversión de cadena a numero:");
        System.out.print("Ingrese un texto o un número: ");
        
        String texto = input.nextLine();
        
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("¡Éxito! El número es: " + numero);
            
        } catch (NumberFormatException e) {
            System.err.println("¡Error de formato! La cadena ingresada '" + texto + "' no puede ser convertida a un número entero.");
        
        }
    }
    
    public static void lecturaDeArchivo(String nombreArchivo) {
        System.out.println("\nEjercicio 2.3 y 2.5: Lectura de Archivo con try-with-resources");
        
        // try-with-resources: el recurso dentro del paréntesis se cierra automáticamente.
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("Contenido de " + nombreArchivo + ":");
            String linea;
            
            // Leer línea por línea hasta que el método readLine devuelva null (fin del archivo)
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        // Capturar FileNotFoundException
        } catch (FileNotFoundException e) {
            System.err.println("¡Error! El archivo '" + nombreArchivo + "' no fue encontrado.");
            System.err.println("Verifique que el archivo esté en la carpeta raíz del proyecto.");
            
        // Capturamos IOException
        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
    
    
    public static void validarEdadPersonalizada () {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEjercicio 2.4- Excepción Personalizada");
        
        try {
            System.out.print("Ingrese su edad: ");
            int edad = input.nextInt();
            
            // Llamada al método que puede lanzar la excepción
            validarEdad(edad); 
            
            System.out.println("¡Éxito! La edad (" + edad + ") es válida.");
            
        } catch (EdadInvalidaException e) {
            System.err.println("Error de validación: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
             System.err.println("Error: Por favor, ingrese un número entero.");
             input.nextLine(); // Limpiamos buffer
        }
    }
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            // Lanzar nuestra excepción si la regla no se cumple
            throw new EdadInvalidaException("La edad no puede ser negativa.");
        } else if (edad > 120) {
            throw new EdadInvalidaException("La edad ingresada no puede ser mayor a 120");
        }
    }
    
}
        
       


