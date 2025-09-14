
package pruebaempleados;

/**
 *
 * @author Andres Meshler
 */

public class Empleado {

    private int id;    
    private String nombre;
    private String puesto;
    private double salario;
    // Atributo estático para contar el número total de empleados creados.
    private static int totalEmpleados = 0;

    // --- CONSTRUCTORES SOBRECARGADOS ---

     // Constructor que inicializa un empleado con todos sus datos.    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementa el contador global
    }

     // Constructor que inicializa un empleado con nombre y puesto.
    public Empleado(String nombre, String puesto) {
        // Asignamos un ID automático y un salario por defecto
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1700000.0; // Salario por defecto
        totalEmpleados++; // Incrementa el contador global
        this.id = totalEmpleados; // Asigna el ID basado en el contador
    }

    // --- MÉTODOS SOBRECARGADOS ---

    // Actualiza el salario del empleado aplicando un porcentaje de aumento.
    public void actualizarSalario(double porcentajeAumento) {
        double aumento = this.salario * (porcentajeAumento / 100);
        this.salario += aumento;
        System.out.println("Salario de " + this.nombre + " actualizado con un " + porcentajeAumento + "% de aumento.");
    }

    // Actualiza el salario del empleado sumando una cantidad fija.
    public void actualizarSalario(int montoFijo) {
        this.salario += montoFijo;
        System.out.println("Salario de " + this.nombre + " actualizado con un bono fijo de $" + montoFijo + ".");
    }
    
    // --- MÉTODO toString() ---

    //Devuelve una representación en formato String del estado del objeto Empleado.
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre='" + nombre + "', Puesto='" + puesto + "', Salario=$" + String.format("%.2f", salario) + "]";
    }

    // --- MÉTODO ESTÁTICO ---
    
    // Devuelve el número total de empleados que han sido creados.
    // Se invoca directamente desde la clase, sin necesidad de una instancia.
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // --- ENCAPSULAMIENTO: GETTERS Y SETTERS ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
