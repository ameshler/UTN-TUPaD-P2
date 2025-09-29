
package Ejercicio13;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 13 funcionando ...");
        // instanciar el usuario
        Usuario usuario = new Usuario("Juan Perez", "jperez@gmail.com");
        // instanciar el generador
        GeneradorQR generador = new GeneradorQR();
        
        // generar qr - dependencia de creación
        generador.generar("AQW-478", usuario);
        
}

}
