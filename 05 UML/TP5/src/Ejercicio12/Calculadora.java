
package Ejercicio12;

/**
 *
 * @author Andres Meshler
 */
public class Calculadora {
    
    public void calcular(Impuesto impuesto){
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("Impuesto calculado: $ " + impuesto.getMonto());
    }

}
