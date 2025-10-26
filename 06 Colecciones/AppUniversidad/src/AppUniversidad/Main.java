
package AppUniversidad;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    
    public static void main(String[] args) {
        // Crear la Universidad
        Universidad utn = new Universidad("UTN");
        System.out.println("Universidad creada");

        // 1- Crear 3 profesores y 5 cursos
        Profesor prof1 = new Profesor("P101", "Juan Perez", "Sistemas");
        Profesor prof2 = new Profesor("P102", "Ana Gomez", "Bases de Datos");
        Profesor prof3 = new Profesor("P103", "Luis Martin", "Frontend");

        Curso curso1 = new Curso("C001", "Programación I");
        Curso curso2 = new Curso("C002", "Bases de Datos I");
        Curso curso3 = new Curso("C003", "Programación II");
        Curso curso4 = new Curso("C004", "Sistemas Operativos");
        Curso curso5 = new Curso("C005", "Web I");
        
        System.out.println("Se crearon 3 profesores y 5 cursos");

        // 2- Agregar profesores y cursos a la universidad
        utn.agregarProfesor(prof1);
        utn.agregarProfesor(prof2);
        utn.agregarProfesor(prof3);
        utn.agregarCurso(curso1);
        utn.agregarCurso(curso2);
        utn.agregarCurso(curso3);
        utn.agregarCurso(curso4);
        utn.agregarCurso(curso5);

        System.out.println("Se agregaron los profesores y cursos a la universidad");
        
        // 3- Asignar profesores a cursos
        System.out.println("--- 3- ASIGNANDO PROFESORES ---");
        utn.asignarProfesorACurso("C001", "P101"); // Prog I -> Juan Perez
        utn.asignarProfesorACurso("C003", "P101"); // Prog II -> Juan Perez
        utn.asignarProfesorACurso("C002", "P102"); // BD I -> Ana Gomez
        utn.asignarProfesorACurso("C005", "P103"); // Web I -> Luis Martin
        utn.asignarProfesorACurso("C004", "P101"); // SO -> Juan Perez
        System.out.println("\n");

        // 4- Listar cursos con su profesor y profesores con sus cursos
        System.out.println("--- 4- LISTADOS ---");
        System.out.println("--- (A) Listado de Cursos ---");
        utn.listarCursos();
        System.out.println("\n--- (B) Listado de Profesores ---");
        utn.listarProfesores();
        System.out.println("\n");

        // 5- Cambiar el profesor de un curso y verificar
        System.out.println("--- 5- REASIGNANDO 'Prog II' A 'Ana Gomez' ---");
        utn.asignarProfesorACurso("C003", "P102"); // Prog II -> Ana Gomez
        
        System.out.println("\n--- Verificando estado post-reasignación ---");
        System.out.println("Profesor Juan Perez (P101) ahora debería tener 2 cursos:");
        utn.buscarProfesorPorId("P101").listarCursos();
        
        System.out.println("\nProfesor Ana Gomez (P102) ahora debería tener 2 cursos:");
        utn.buscarProfesorPorId("P102").listarCursos();
        System.out.println("\n");

        // 6- Remover un curso y confirmar
        System.out.println("--- 6- ELIMINANDO CURSO 'Web I' (C005) ---");
        utn.eliminarCurso("C005");
        
        System.out.println("\n--- Verificando estado post-eliminación ---");
        System.out.println("Profesor Luis Martin (P103) ahora debería tener 0 cursos:");
        utn.buscarProfesorPorId("P103").listarCursos();
        System.out.println("\n");
        
        // 7- Remover un profesor y dejar cursos en null
        System.out.println("--- 7- ELIMINANDO PROFESOR 'Juan Perez' (P101) ---");
        utn.eliminarProfesor("P101");
        
        System.out.println("\n--- Verificando estado post-eliminación ---");
        System.out.println("Verificamos que sus cursos ('Prog I' y 'SO') ahora no tienen profesor:");
        utn.buscarCursoPorCodigo("C001").mostrarInfo();
        utn.buscarCursoPorCodigo("C004").mostrarInfo();
        System.out.println("\n");

        // 8- Mostrar reporte: cantidad de cursos por profesor
        System.out.println("--- 8- REPORTE FINAL ---");
        // (El profesor P101 ya no existe en la universidad)
        utn.mostrarReporteCursosPorProfesor();
    }

}
