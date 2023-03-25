/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superClases;

/**
 *
 * @author Usuario
 */
public abstract class Producto {
    protected double precio;
    private String nombre;
    private String unidad;
//-------------------------------------------------------------------------------------------
    public Producto() {
        this.nombre = "----------";
        this.precio = 0;
        this.unidad = "----";
    }

    public Producto(double precio, String nombre, String unidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.unidad = unidad;
    }
//------------------------------------------------------------------------------------------
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUnidad() {
        return unidad;
    }
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
//-----------------------------------------------------------------------------------------    
    
    
    public double precioVenta(int cant) {
     //10 unidades--es el precio del 80%
       if(cant < 10)
           return precio * cant;
       else
           return (precio * 0.8) * 20;
    }
}

