
package Ejercicio02;

/**
 *
 * @author Andres Meshler
 */
public class Main {
     public static void main(String[] args) {
        System.out.println("Ejercicio 2 funcionando ...");
        
        // instanciar bateria
        Bateria bateria = new Bateria("AB1", "3010 mAh");
        // instanciar celular
        Celular celular = new Celular("AAA000123", "3424156789", "Motorola Edge Neo", bateria);
        // instanciar usuario
        Usuario usuario = new Usuario("Ana Mendez", "30928563");
        // asignarle el celular al usuario
        usuario.setCelular(celular);
        // mostrar informacion del estado de los objetos creados
         System.out.println("Usuario: " + celular.getUsuario().getNombre());
         System.out.println("Celular: " + celular.getModelo());
         System.out.println("Capacidad batería: " + celular.getBateria().getCapacidad());
         System.out.println("Número: " + celular.getNumero());
         
    }
}
