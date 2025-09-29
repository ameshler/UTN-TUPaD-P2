
package Ejercicio02;

/**
 *
 * @author Andres Meshler
 */
public class Celular {
    private String imei;
    private String numero;
    private String modelo;
    private Usuario usuario;
    private Bateria bateria;

    public Celular(String imei, String numero, String modelo, Bateria bateria) {
        this.imei = imei;
        this.numero = numero;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this)
            usuario.setCelular(this);
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
}
