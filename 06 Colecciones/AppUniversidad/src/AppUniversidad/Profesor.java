
package AppUniversidad;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Andres Meshler
 */


public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    // La lista de cursos que este profesor dicta
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        // Importante: inicializar la lista
        this.cursos = new ArrayList<>();
    }

    // --- Getters ---
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public List<Curso> getCursos() {
        // Devolvemos una copia para proteger la lista original
        return new ArrayList<>(cursos);
    }
    
   
    public void agregarCurso(Curso c) {
        if (c != null) {
            // Le decimos al curso que ESTE profesor es su nuevo profesor
            c.setProfesor(this);
        }
    }

    
    public void eliminarCurso(Curso c) {
        if (c != null && this.cursos.contains(c)) {
            // Le decimos al curso que ya no tiene profesor
            c.setProfesor(null);
        }
    }

    
    void internalAddCurso(Curso c) {
        if (!this.cursos.contains(c)) {
            this.cursos.add(c);
        }
    }

  
    void internalRemoveCurso(Curso c) {
        this.cursos.remove(c);
    }
    
  
    public void listarCursos() {
        System.out.println("  Cursos dictados por " + this.nombre + ":");
        if (this.cursos.isEmpty()) {
            System.out.println("    No tiene cursos asignados");
            return;
        }
        for (Curso c : this.cursos) {
            System.out.println("    - " + c.getCodigo() + ": " + c.getNombre());
        }
    }

    
    public void mostrarInfo() {
        System.out.println("Profesor: " + this.nombre + " (ID: " + this.id + ")");
        System.out.println("  Especialidad: " + this.especialidad);
        System.out.println("  Cursos a cargo: " + this.cursos.size());
    }

}