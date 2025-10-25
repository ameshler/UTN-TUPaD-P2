
package Ejercicio02;

/**
 *
 * @author Andres Meshler
 */
public class Rectangulo extends Figura {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    // Implementar el método abstracto
    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

}
