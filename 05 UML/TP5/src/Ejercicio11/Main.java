
package Ejercicio11;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 11 funcionando ...");
        // instanciar artista
        Artista artista = new Artista("NTVG", "Rock");
        // instanciar cancion
        Cancion cancion = new Cancion("Clara");
        // instanciar reproductor
        Reproductor reproductor = new Reproductor();
        // asociar artista y cancion
        cancion.setArtista(artista);
        // reproducir cancion - dependencia de uso
        reproductor.reproducir(cancion);
        
}

}
