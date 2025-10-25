
package Ejercicio03;

/**
 *
 * @author Andres Meshler
 */
public abstract class Empleado {
    
   public double calcularSueldo(Empleado e){
       double sueldo = 0;
       
       if(e instanceof EmpleadoPlanta){
           sueldo = 1400000.0;
       }
       
       if(e instanceof EmpleadoTemporal){
           sueldo = 1000000.0;
       }
   
       return sueldo;
   }

}
