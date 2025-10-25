
package Ejercicio02;

/**
 *
 * @author Andres Meshler
 */
public abstract class Figura {
    
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Método abstracto: No tiene implementación
    // Fuerza a las subclases a definir CÓMO se calcula el área.
    public abstract double calcularArea();

}
