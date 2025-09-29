
package Ejercicio10;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 10 funcionando ...");
        //instanciar titular
        Titular titular = new Titular("Juan Perez", "25869963");
        // instanciar cuenta bancaria
        CuentaBancaria cuentaBancaria = new CuentaBancaria("123456789321", 750000.0, "Pass132456", "2025-09-29");
        // relacionar cuenta y titular
        titular.setCuentaBancaria(cuentaBancaria);
        
        //mostrar informacion de los objetos
        System.out.println("CBU: " + titular.getCuentaBancaria().getCbu());
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Saldo: " + titular.getCuentaBancaria().getSaldo());
        
}

}
