
package biblioteca;

/**
 *
 * @author Andres Meshler
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    // Métodos requeridos:
    public void mostrarInfo() {
        // Llama implícitamente a autor.toString(), que devuelve el nombre
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return "Libro {" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anioPublicacion +
                ", autor=" + autor + // Aquí se usará el toString() de Autor
                "}";
    }
    
    

}
