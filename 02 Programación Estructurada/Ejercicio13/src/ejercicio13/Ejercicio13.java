package ejercicio13;

/**
 *
 * @author Andres Meshler
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        // a. Declare e inicialice un array con los precios de algunos productos.
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Use una función recursiva para mostrar los precios originales.
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);
        
        // c. Modifique el precio de un producto específico.
        precios[2] = 129.99;
        
        // d. Use otra función recursiva para mostrar los valores modificados.
        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);

    }
    public static void mostrarPrecios(double[] array, int indice){
        if(indice < array.length){
            System.out.println("Precio: $" + array[indice]);
            mostrarPrecios(array, indice + 1);
        }
    }
}
