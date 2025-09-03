
package trabajopractico03;

/**
 *
 * @author Andres Meshler
 */
// Clase NaveEspacial
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100; // Límite máximo de combustible

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }

    // Método para simular el despegue
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("La nave " + nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("¡Fallo en el despegue! Combustible insuficiente.");
        }
    }

    // Método para avanzar una distancia, consumiendo combustible
    public void avanzar(int distancia) {
        int combustibleNecesario = distancia / 10; // Suponemos que se necesita 1 unidad de combustible por cada 10 unidades de distancia
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println("La nave " + nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("No se puede avanzar. Combustible insuficiente para recorrer " + distancia + " unidades.");
        }
    }

    // Método para recargar combustible con validación
    public void recargarCombustible(int cantidad) {
        if (this.combustible + cantidad > MAX_COMBUSTIBLE) {
            System.out.println("Recarga excede el límite. Se recargará hasta el máximo.");
            this.combustible = MAX_COMBUSTIBLE;
        } else {
            this.combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades.");
        }
        System.out.println("Nivel de combustible actual: " + this.combustible);
    }

    // Método para mostrar el estado actual de la nave
    public void mostrarEstado() {
        System.out.println("--- Estado de la Nave " + nombre + " ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        // Tarea: Crear una nave con 50u de combustible, intentar avanzar sin recargar, luego recargar y avanzar.
        // Instanciar nave con 50u de combustible
        NaveEspacial arsat = new NaveEspacial("ARSAT", 50);
        arsat.mostrarEstado();
        
        arsat.despegar();
        
        System.out.println("\nIntentando avanzar 600 unidades (necesita 60 de combustible)...");
        arsat.avanzar(600); // No avanza por falta de combustible
        arsat.mostrarEstado();
        
        System.out.println("\nRecargando 40 unidades de combustible...");
        arsat .recargarCombustible(40);
        
        System.out.println("\nIntentando avanzar 600 unidades de nuevo...");
        arsat.avanzar(600); // Ahora debería poder avanzar
        
        System.out.println("\nMostrando estado final:");
        arsat.mostrarEstado();
    }
}
