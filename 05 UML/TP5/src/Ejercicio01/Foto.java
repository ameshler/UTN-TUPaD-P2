
package Ejercicio01;

/**
 *
 * @author Andres Meshler
 */
public class Foto {
    private String imagen;
    private String fechaEmision;

    public Foto(String imagen, String fechaEmision) {
        this.imagen = imagen;
        this.fechaEmision = fechaEmision;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
  
}
