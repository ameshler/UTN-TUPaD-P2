
package trabajopractico03;

/**
 *
 * @author Andres Meshler
 */
// Clase Gallina
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    // Constructor
    public Gallina(int idGallina) {
        this.idGallina = idGallina;
        this.edad = 0;
        this.huevosPuestos = 0;
    }

    // Método para que la gallina ponga un huevo
    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("La gallina " + idGallina + " ha puesto un huevo. Total huevos puestos por gallina " + idGallina + ": " + huevosPuestos);
    }

    // Método para incrementar la edad de la gallina
    public void envejecer() {
        this.edad++;
        System.out.println("La gallina " + idGallina + " ha envejecido. Edad actual: " + edad);
    }

    // Método para mostrar el estado actual de la gallina
    public void mostrarEstado() {
        System.out.println("--- Estado de la Gallina " + idGallina + " ---");
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos Puestos: " + huevosPuestos);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        // Instanciar dos gallinas
        Gallina gallina1 = new Gallina(1);
        Gallina gallina2 = new Gallina(2);

        System.out.println("Simulando acciones en el gallinero...\n");
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.ponerHuevo();
        
        gallina1.envejecer();
        gallina2.envejecer();
        
        System.out.println("\n--- Estados Finales ---");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
