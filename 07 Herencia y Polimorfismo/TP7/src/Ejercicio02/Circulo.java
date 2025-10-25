
package Ejercicio02;

/**
 *
 * @author Andres Meshler
 */
public class Circulo extends Figura{
    
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    // Implementar el método abstracto
    @Override
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

}
