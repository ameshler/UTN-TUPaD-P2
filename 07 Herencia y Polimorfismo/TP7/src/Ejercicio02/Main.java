
package Ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    
    public static void main(String[] args) {
    
        // Crear un array de figuras y mostrar el área de cada una
        ArrayList<Figura> misFiguras = new ArrayList<>();
        
        // Guardamos objetos de las clases HIJAS
        Circulo c1 = new Circulo(10.0, "Circulo01");
        Circulo c2 = new Circulo(14.0, "Circulo02");
        Rectangulo r1 = new Rectangulo(5.0, 10.0, "Rectangulo01");
        Rectangulo r2 = new Rectangulo(7.0, 13.0, "Rectangulo01");
        
        // Agregar figuras a la lista
        misFiguras.add(c1);
        misFiguras.add(c2);
        misFiguras.add(r1);
        misFiguras.add(r2);

        // Recorremos usando Polimorfismo
        System.out.println("--- Cálculo de Áreas (Polimorfismo) ---");
        for (Figura fig : misFiguras) {
            
            // Java sabe cuál método .calcularArea() llamar
            System.out.println("Área del " + fig.getNombre() + ": " + fig.calcularArea());
        }
    }

}
