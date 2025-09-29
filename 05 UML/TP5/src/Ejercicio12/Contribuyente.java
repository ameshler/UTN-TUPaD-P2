
package Ejercicio12;

/**
 *
 * @author Andres Meshler
 */
public class Contribuyente {
    private String nombre;
    private String string;

    public Contribuyente(String nombre, String string) {
        this.nombre = nombre;
        this.string = string;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    
}
