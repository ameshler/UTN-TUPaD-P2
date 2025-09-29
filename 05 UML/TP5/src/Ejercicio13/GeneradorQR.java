
package Ejercicio13;

/**
 *
 * @author Andres Meshler
 */
public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario){
        CodigoQR qr = new CodigoQR(valor, usuario);
        // mensaje para dar aviso de la creacion del qr
        System.out.println("QR generado para el usuario: " + usuario.getNombre()
                                + " con valor: " + qr.getValor());
    
    }

}
