
package trabajopractico03;

/**
 *
 * @author Andres Meshler
 */
// Clase Libro
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        
        this.setAnioPublicacion(anioPublicacion);
    }

    // Getter para titulo
    public String getTitulo() {
        return titulo;
    }

    // Getter para autor
    public String getAutor() {
        return autor;
    }

    // Getter para anioPublicacion
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setter con validación para anioPublicacion
    public void setAnioPublicacion(int anio) {
        // año positivo y no futuro
        if (anio > 0 && anio <= java.time.Year.now().getValue()) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Error: El año de publicación '" + anio + "' no es válido.");
        }
    }
    
    // Método para mostrar la información del libro
    public void mostrarInfo() {
        System.out.println("--- Información del Libro ---");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Año de Publicación: " + this.getAnioPublicacion());
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        // Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido.
        // Instanciar libro
        Libro miLibro = new Libro("La física en la vida cotidiana", "Alberto Rojo", 2010);
        miLibro.mostrarInfo();
        
        System.out.println("\nIntentando modificar el año con un valor inválido (2080)...");
        miLibro.setAnioPublicacion(2080);
        
        System.out.println("\nIntentando modificar el año con un valor válido (2011)...");
        miLibro.setAnioPublicacion(2011);
        
        System.out.println("\nMostrando la información final del libro:");
        miLibro.mostrarInfo();
    }
}
