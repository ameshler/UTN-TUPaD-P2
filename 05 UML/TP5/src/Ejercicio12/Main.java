
package Ejercicio12;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 12 funcionando ...");
        // instanciar contribuyente
        Contribuyente contribuyente = new Contribuyente("Juan Perez", "cuit");
        // instanciar impuesto
        Impuesto impuesto = new Impuesto(15000);
        // asociar impuesto y contribuyente
        impuesto.setContribuyente(contribuyente);
        // instanciar calculadora
        Calculadora calc = new Calculadora();
        // calcular impuesto
        calc.calcular(impuesto);
        
}

}
