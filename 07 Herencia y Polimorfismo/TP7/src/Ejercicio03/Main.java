
package Ejercicio03;

import java.util.ArrayList;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    
    public static void main(String[] args) {
        
        // generar lista de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoTemporal());
        empleados.add(new EmpleadoTemporal());
        empleados.add(new EmpleadoPlanta());
        empleados.add(new EmpleadoPlanta());
        
        // recorrer y calcular sueldos
        for (Empleado empleado : empleados){
            System.out.println("Sueldo a pagar: $" + empleado.calcularSueldo(empleado));
        }
    }
}
