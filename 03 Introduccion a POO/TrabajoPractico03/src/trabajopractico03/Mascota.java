
package trabajopractico03;

/**
 *
 * @author Andres Meshler
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para mostrar la información de la mascota
    public void mostrarInfo() {
        System.out.println("--- Información de la Mascota ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("--------------------------------");
    }

    // Método para incrementar la edad de la mascota
    public void cumplirAnios() {
        this.edad++;
        System.out.println("¡Feliz cumple, " + this.nombre + "! Ahora tiene " + this.edad + " años.");
    }
    // Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {
        // Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.
        Mascota miMascota = new Mascota("Paty", "Perro Salchicha", 9);
        
        // Mostrar informacion de la mascota
        miMascota.mostrarInfo();
        
        System.out.println("\nSimulando el paso de un año...");
        miMascota.cumplirAnios();
        
        // Mostrar informacion actualizada
        miMascota.mostrarInfo();
    }
}

