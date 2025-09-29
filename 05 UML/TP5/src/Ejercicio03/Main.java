
package Ejercicio03;

/**
 *
 * @author Andres Meshler
 */
public class Main {
     public static void main(String[] args) {
        System.out.println("Ejercicio 3 funcionando ...");
        
        // instanciar autor
        Autor autor = new Autor("José Enrique Miguens", "Argentino");
        // instanciar editorial
        Editorial editorial = new Editorial("El Ateneo", "Patagones 2463, Ciudad de Buenos Aires, Argentina");
        // instanciar el libro
        Libro libro = new Libro("Desafío a la Política Neoliberal", "950-02-6362-9", editorial);
        // asociar autor al libro
        libro.setAutor(autor);
        
        // mostrar informacion de los objetos creados
         System.out.println("Título del libro: " + libro.getTitulo());
         System.out.println("Autor: " + libro.getAutor().getNombre());
         System.out.println("Editorial: " + libro.getEditorial().getNombre());
    }

}
