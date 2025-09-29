
package Ejercicio12;

/**
 *
 * @author Andres Meshler
 */
public class Impuesto {
    private float monto;
    private Contribuyente contribuyente;

    public Impuesto(float monto) {
        this.monto = monto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
    

}
