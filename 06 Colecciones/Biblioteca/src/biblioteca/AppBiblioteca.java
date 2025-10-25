
package biblioteca;

/**
 *
 * @author Andres Meshler
 */
public class AppBiblioteca {
    
    public static void main(String[] args) {
        // --- 1: Creamos una biblioteca ---
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("Biblioteca '" + miBiblioteca.getNombre() + "' creada.");
        System.out.println("\n");

        // --- 2: Crear al menos tres autores ---
        System.out.println("--- 2: CREANDO AUTORES ---");
        Autor autor1 = new Autor("A101", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A102", "J.K. Rowling", "Británica");
        Autor autor3 = new Autor("A103", "Stephen King", "Estadounidense");
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();
        System.out.println("\n");
        
        // --- 3: Agregar 5 libros ---
        System.out.println("--- 3: AGREGANDO LIBROS ---");
        miBiblioteca.agregarLibro("978-030735044", "Cien años de soledad", 1967, autor1);
        miBiblioteca.agregarLibro("978-847888445", "Harry Potter y la piedra filosofal", 1997, autor2);
        miBiblioteca.agregarLibro("978-0307743657", "It (Eso)", 1986, autor3);
        miBiblioteca.agregarLibro("978-074753849", "Harry Potter y la cámara secreta", 1998, autor2);
        miBiblioteca.agregarLibro("978-0307474728", "El amor en los tiempos del cólera", 1985, autor1);
        System.out.println("\n");

        // --- 4: Listar todos los libros ---
        System.out.println("--- 4: LISTADO DE LIBROS ---");
        miBiblioteca.listarLibros();
        System.out.println("\n");

        // --- 5: Buscar un libro por ISBN ---
        System.out.println("--- 5: BUSCAR LIBRO '978-0307743657' (It) ---");
        Libro libroBuscado = miBiblioteca.buscarLibroPorIsbn("978-0307743657");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        }
        System.out.println("\n");

        // --- 6: Filtrar libros por año (1998) ---
        System.out.println("--- 6: FILTRAR LIBROS DEL AÑO 1998 ---");
        miBiblioteca.filtrarLibrosPorAnio(1998);
        System.out.println("\n");

        // --- 7: Eliminar un libro ---
        System.out.println("--- 7: ELIMINAR LIBRO '978-030735044' (Cien años) ---");
        miBiblioteca.eliminarLibro("978-030735044");
        System.out.println("--- Lista post-eliminación ---");
        miBiblioteca.listarLibros();
        System.out.println("\n");
        
        // --- 8: Mostrar cantidad total de libros ---
        System.out.println("--- 8: CANTIDAD TOTAL DE LIBROS ---");
        System.out.println("Total de libros en la biblioteca: " + miBiblioteca.obtenerCantidadLibros());
        System.out.println("\n");

        // --- 9: Listar autores disponibles ---
        System.out.println("--- 9: AUTORES DISPONIBLES (SIN REPETIR) ---");
        miBiblioteca.mostrarAutoresDisponibles();
        System.out.println("\n");
    }
    

}
