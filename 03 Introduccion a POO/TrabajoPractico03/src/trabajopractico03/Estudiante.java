
package trabajopractico03;

/**
 *
 * @author Andres Meshler
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInfo() {
        System.out.println("\n--- Información del Estudiante ---");
        System.out.println("Nombre Completo: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("---------------------------------");
    }

    // Método para aumentar la calificación
    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("Se aumentaron " + puntos + " puntos. Nueva calificación: " + this.calificacion);
    }

    // Método para disminuir la calificación
    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        System.out.println("Se disminuyeron " + puntos + " puntos. Nueva calificación: " + this.calificacion);
    }

    public static void main(String[] args) {
        // Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.
        Estudiante estudiante1 = new Estudiante("Andres", "Meshler", "Programación II", 8.5);
        
        // Mostrar informacion del estudiantae
        estudiante1.mostrarInfo();
        
        // Subir calificación un punto
        estudiante1.subirCalificacion(1.0);
        
        // Bajar calificación
        estudiante1.bajarCalificacion(0.5);
        
        // Mostrar informacion actualizada
        estudiante1.mostrarInfo();
    }
}
