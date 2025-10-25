/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package stock;

/**
 *
 * @author Andres Meshler
 */
public enum CategoriaProducto {
    // Valores de la enumeración con su descripción
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    
    // Atributo para guardar la descripción
    private final String descripcion;

    // Constructor para inicializar la descripción
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }
    
}
