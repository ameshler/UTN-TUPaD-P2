
package Ejercicio05;

/**
 *
 * @author Andres Meshler
 */
public class Computadora {
    private String marca;
    private String numeroDeSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroDeSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroDeSerie = numeroDeSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this)
            propietario.setComputadora(this);
    
    }
}
