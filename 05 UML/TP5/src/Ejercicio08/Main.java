
package Ejercicio08;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 9 funcionando ...");
        // instanciar usuario
        Usuario usuario = new Usuario("Juan Perez", "jperez@gmail.com");
        // instanciar documento y firma por composicion - agregacion del usuario
        Documento doc = new Documento("Documento de Prueba", "Este es el contenido del documento de prueba", usuario, "5d41402abc4b2a76b9719d911017c592", "2025-09-28");

        // mostrar informacion de los objetos
        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Usuario: " + doc.getUsuario().getNombre());
        System.out.println("Fecha Firma Digital: " + doc.getFirmaDigital().getFecha());

    }   
     
}

