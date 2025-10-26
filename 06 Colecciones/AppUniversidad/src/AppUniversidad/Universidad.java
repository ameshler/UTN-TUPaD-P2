
package AppUniversidad;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Andres Meshler
 */
public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        this.profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        this.cursos.add(c);
    }

    public void listarProfesores() {
        System.out.println("--- Lista de Profesores (" + this.nombre + ") ---");
        for (Profesor p : this.profesores) {
            p.mostrarInfo();
            p.listarCursos(); // Mostramos sus cursos
        }
    }

    public void listarCursos() {
        System.out.println("--- Lista de Cursos (" + this.nombre + ") ---");
        for (Curso c : this.cursos) {
            c.mostrarInfo();
        }
    }

    Profesor buscarProfesorPorId(String id) {
        for (Profesor p : this.profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

   
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("Error: Curso no encontrado.");
            return;
        }
        if (profesor == null) {
            System.out.println("Error: Profesor no encontrado.");
            return;
        }

        // Aquí se dispara la sincronización bidireccional
        curso.setProfesor(profesor);
        System.out.println("Asignación exitosa: " + profesor.getNombre() + " -> " + curso.getNombre());
    }

    
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // 1. Rompemos la relación
            // Esto quita el curso de la lista del profesor
            curso.setProfesor(null); 
            
            // 2. Eliminamos el curso de la universidad
            this.cursos.remove(curso);
            System.out.println("Curso " + curso.getNombre() + " eliminado.");
        } else {
            System.out.println("Error: Curso no encontrado.");
        }
    }

   
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            
            List<Curso> cursosDelProfesor = profesor.getCursos(); // Usa la copia
            
            for (Curso c : cursosDelProfesor) {
                c.setProfesor(null); // Esto actualiza cada curso
            }
            
            this.profesores.remove(profesor);
            System.out.println("Profesor " + profesor.getNombre() + " eliminado.");
        } else {
            System.out.println("Error: Profesor no encontrado.");
        }
    }
   
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("--- Reporte: Cursos por Profesor ---");
        for (Profesor p : this.profesores) {
            // Usamos la info del método mostrarInfo()
            p.mostrarInfo();
        }
    }
}
