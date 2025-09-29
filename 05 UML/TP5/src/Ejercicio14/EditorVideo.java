
package Ejercicio14;

/**
 *
 * @author Andres Meshler
 */
public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto){
        Render rend = new Render(formato, proyecto);
        // mostrar por pantalla informacion del objeto creado
        System.out.println("Exportando render del proyecto: \"" + rend.getProyecto().getNombre() + "\"");
        System.out.println("Formato: " + rend.getFormato());
        System.out.println("Duración: " + rend.getProyecto().getDuracionMin());
        
    }

}
