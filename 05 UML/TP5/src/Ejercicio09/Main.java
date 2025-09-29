
package Ejercicio09;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 9 funcionando ...");
        // instanciar paciente
        Paciente paciente = new Paciente("Juan Perez", "OSDE");
        //instanciar profesional
        Profesional profesional = new Profesional("Roberto Sanchez", "Traumatología");
        //instanciar cita médica
        CitaMedica cita = new CitaMedica("2025-10-02", "09:30");
        // asociar cita con paciente y profesional
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);
        
        //mostrar informacion de los objetos
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Obra Social: " + cita.getPaciente().getObraSocial());
        System.out.println("Fecha cita: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());
        System.out.println("Especialidad: " + cita.getProfesional().getEspecialidad());
}

}
