
package AppUniversidad;

/**
 *
 * @author Andres Meshler
 */
public class Curso {

    private String codigo;
    private String nombre;
    // Referencia al único profesor responsable
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Un curso se crea sin profesor
    }

    // --- Getters ---
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
   
    // Asigna/cambia el profesor sincronizando ambos lados
   
    public void setProfesor(Profesor p) {
        // Si el profesor ya es este, no hacemos nada
        if (this.profesor == p) {
            return;
        }

        // Guardamos la referencia al profesor anterior
        Profesor profesorAnterior = this.profesor;

        // Asignamos el nuevo profesor al curso
        this.profesor = p;

        // Si tenía un profesor previo, nos quitamos de su lista
        if (profesorAnterior != null) {
            profesorAnterior.internalRemoveCurso(this);
        }

        // Si se asigna un nuevo profesor, nos agregamos a su lista
        if (p != null) {
            p.internalAddCurso(this);
        }
    }
    
           
    // Muestra código, nombre y nombre del profesor (si tiene)
     
    public void mostrarInfo() {
        System.out.println("Curso: " + this.nombre + " (Código: " + this.codigo + ")");
        
        String nombreProfesor;
        if (this.profesor != null) {
            nombreProfesor = this.profesor.getNombre();
        } else {
            nombreProfesor = "Sin asignar";
        }
        System.out.println("  Profesor: " + nombreProfesor);
    }
}