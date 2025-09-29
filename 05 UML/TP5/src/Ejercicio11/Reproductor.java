
package Ejercicio11;

/**
 *
 * @author Andres Meshler
 */
public class Reproductor {
    
    public void reproducir(Cancion cancion){
        System.out.println("Reproduciendo la cancion: \"" + cancion.getTitulo() 
                + "\" del artista: " + cancion.getArtista().getNombre() + " ...");
    }

}
