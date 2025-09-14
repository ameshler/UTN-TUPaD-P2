package pruebaempleados;

/**
 *
 * @author Andres Meshler
 */
public class PruebaEmpleados {

    public static void main(String[] args) {
        
        System.out.println("--- Creando empleados... ---");

        // 1. Instanciar varios objetos usando ambos constructores
        Empleado emp1 = new Empleado(1, "Ana Gómez", "Desarrolladora Senior", 2350000.0);
        Empleado emp2 = new Empleado("Juan Pérez", "Analista de Sistemas");
        Empleado emp3 = new Empleado("María Rodríguez", "Tester Funcional de Software");

        System.out.println("¡Empleados creados exitosamente!\n");
        
        // Mostrar la información inicial de cada empleado
        System.out.println("--- Información inicial de los empleados ---");
        System.out.println(emp1.toString());
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println();

        // 2. Aplicar los métodos actualizarSalario()
        System.out.println("--- Actualizando salarios... ---");
        emp1.actualizarSalario(10.5); // Aumento por porcentaje
        emp2.actualizarSalario(50000); // Aumento por monto fijo
        System.out.println();

        // 3. Imprimir la información actualizada de cada empleado
        System.out.println("--- Información actualizada de los empleados ---");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3); // No se modificó, mantiene su salario por defecto
        System.out.println();
        
        // 4. Mostrar el total de empleados creados
        System.out.println("--- Total de empleados creados ---");
        // Se llama al método estático directamente desde la clase
        System.out.println("El número total de empleados registrados es: " + Empleado.mostrarTotalEmpleados() + ".");
    }
}
