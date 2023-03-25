package Productos;

import superClases.Ropa;

/**
 *
 * @author Usuario
 */
public class Playera extends Ropa{
    
private String tamaño;
private String tipo;

    //---------------------------------------------------------------

    public Playera() {
        this.tamaño = "------";
        this.tipo = "-----";
    }

    public Playera(String tamaño, String tipo, String marca, String color, double precio, String nombre, String unidad) {
        super(marca, color, precio, nombre, unidad);
        this.tamaño = tamaño;
        this.tipo = tipo;
    }
//----------------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Playera{" + "tama\u00f1o=" + tamaño + ", tipo=" + tipo + '}';
    }
    
//-----------------------------------------------------------------------------------------------------------------------------------//-----------
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------
 @Override
    public double precioVenta(int cant) {
     //10 unidades--es el precio del 80%
       if(cant < 10)
           return precio * cant;
       else
           return (precio * 0.8) * 20;
    }

    
}
