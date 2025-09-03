package trabajopractico03;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion); // usar setter para validaciones
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
        if ((this.calificacion + puntos) <= 10) {
            this.calificacion += puntos;
            System.out.println("Se aumentaron " + puntos + " puntos. Nueva calificación: " + this.calificacion);
        } else {
            System.out.println("Error: La calificación no puede ser mayor a 10");
        }
    }

    // Método para disminuir la calificación
    public void bajarCalificacion(double puntos) {
        if ((this.calificacion - puntos) >= 0) {
            this.calificacion -= puntos;
            System.out.println("Se disminuyeron " + puntos + " puntos. Nueva calificación: " + this.calificacion);
        } else {
            System.out.println("Error: La calificación no puede ser menor a 0");
        }
    }

    // Setter con validación
    public void setCalificacion(double calificacion) {
        if (calificacion < 0) {
            this.calificacion = 0;
        } else if (calificacion > 10) {
            this.calificacion = 10;
        } else {
            this.calificacion = calificacion;
        }
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    public double getCalificacion() { return calificacion; }

    // Método principal
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Andres", "Meshler", "Programación II", 8);

        estudiante1.mostrarInfo();

        System.out.println("\nSubiendo la calificacion en 1 punto...");
        estudiante1.subirCalificacion(1.0);

        System.out.println("\nSubiendo la calificacion en 3 puntos...");
        estudiante1.subirCalificacion(3.0); // Esto NO se va a permitir, correcto

        System.out.println("\nBajando la calificacion en 2.5 puntos...");
        estudiante1.bajarCalificacion(2.5);

        System.out.println("\nBajando la calificacion en 7 puntos...");
        estudiante1.bajarCalificacion(7.0); // Esto NO se va a permitir, correcto

        estudiante1.mostrarInfo();
    }
}
