package Productos;

import superClases.Electronica;

/**
 *
 * @author Usuario
 */

public final class Computadora extends Electronica {
 private double tamaño;
 private int memoria;
 private String procesador;
 private String DD;
 //---------------------------------------------------------------------------------------

    public Computadora() {
        this.DD = "------------";
        this.memoria = 0;
        this.procesador = "-------";
        this.tamaño = 0.0;
    }

    public Computadora(double tamaño, int memoria, String procesador, String DD, String fabricante, String modelo, String garantia, double precio, String nombre, String unidad) {
        super(fabricante, modelo, garantia, precio, nombre, unidad);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.DD = DD;
    }
//-------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Computadora{" + "tama\u00f1o=" + tamaño + ", memoria=" + memoria + ", procesador=" + procesador + ", DD=" + DD + '}';
    }
    
        //....................................................................................................

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDD() {
        return DD;
    }

    public void setDD(String DD) {
        this.DD = DD;
    }
    //-----------------------------------------------------------------------------------------------------------------
    @Override
    public double precioVenta(int cant) {
     //10 unidades--es el precio del 80%
       if(cant < 10)
           return precio * cant;
       else
           return (precio * 0.8) * 20;
    }

 
   
}
//computadora es una clase final()
//ya no pude heredar de una clase final
//classLaptop extends computadora{

//}