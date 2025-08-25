package ejercicio12;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        
        // a. Declare e inicialice un array con los precios de algunos productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Muestre los valores originales de los precios.
        System.out.println("Precios originales:");
        mostrarPrecios(precios);
        
        // c. Modifique el precio de un producto específico.
        precios[2] = 129.99;
        
        // d. Muestre los valores modificados.
        System.out.println("Precios modificados:");
        mostrarPrecios(precios);
    }
    public static void mostrarPrecios(double[] array){
        for (double precio : array){
            System.out.println("Precio: $" + precio);
        }
    }
}
