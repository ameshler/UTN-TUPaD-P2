
package Ejercicio08;

/**
 *
 * @author Andres Meshler
 */
public class Documento {
    private String titulo;
    private String contenido;
    private Usuario usuario;
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, Usuario usuario, String codigoHash, String fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.usuario = usuario;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

      

}
