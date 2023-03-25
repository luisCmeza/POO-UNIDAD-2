/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_interfaces;

/**
 *
 * @author Usuario
 */
public class Computadora  extends Producto
                          implements MostrarDatos{
    private String procesador;
    private int memoria;

    public Computadora() {
    }

    public Computadora(String procesador, int memoria, double precio, String nombre) {
        super(precio, nombre);
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("nombre: " + getNombre());
        System.out.println("precio: " + getPrecio());
        System.out.println("procesador: " + procesador);
        System.out.println("memoria: " + memoria);
                
    }
    
}
