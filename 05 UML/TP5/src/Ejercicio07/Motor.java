
package Ejercicio07;

/**
 *
 * @author Andres Meshler
 */
public class Motor {
    private String tipo;
    private String numeroDeSerie;

    public Motor(String tipo, String numeroDeSerie) {
        this.tipo = tipo;
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }
    
    

}
