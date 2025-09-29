
package Ejercicio14;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 14 funcionando ...");
        // instanciar proyecto
        Proyecto p = new Proyecto("Prueba01", "3:00");
        // instanciar editor
        EditorVideo editor = new EditorVideo();
        
        // exportar proyecto
        editor.exportar("MP4", p);
        
}

}
