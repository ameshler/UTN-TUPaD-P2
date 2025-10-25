package biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Andres Meshler
 */
public class Biblioteca {
    
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    // Métodos requeridos:
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        // Validamos que el autor no sea nulo
        if (autor == null) {
            System.out.println("Error: No se puede agregar un libro sin autor.");
            return;
        }
        // Creamos el libro dentro de la biblioteca
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Libro '" + titulo + "' agregado a la biblioteca.");
    }
    
    public void listarLibros() {
        if (this.libros.isEmpty()) {
            System.out.println("La biblioteca '" + this.nombre + "' no tiene libros.");
            return;
        }
        for (Libro libro : this.libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro; // Encontrado
            }
        }
        return null; // No encontrado
    }
    
    public void eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            this.libros.remove(libroAEliminar);
            System.out.println("Libro '" + libroAEliminar.getTitulo() + "' eliminado.");
        } else {
            System.out.println("No se encontró libro con ISBN: " + isbn);
        }
    }
    
    public int obtenerCantidadLibros() {
        return this.libros.size();
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("--- Libros publicados en " + anio + " ---");
        boolean encontrados = false;
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron libros de ese año.");
        }
    }
    
    public void mostrarAutoresDisponibles() {
        System.out.println("--- Autores Disponibles en la Biblioteca ---");
        // Usamos un HashSet para guardar los autores ya que NO permite elementos duplicados.
        Set<Autor> autores = new HashSet<>();
        
        for (Libro libro : this.libros) {
            autores.add(libro.getAutor()); // Agregamos el autor al Set
        }

        // Si el Set está vacío invormamos y retornamos
        if (autores.isEmpty()) {
            System.out.println("No hay autores para mostrar.");
            return;
        }

        // Recorremos el Set y mostramos la info de cada autor
        for (Autor autor : autores) {
            autor.mostrarInfo();
        }
    }
      
}
