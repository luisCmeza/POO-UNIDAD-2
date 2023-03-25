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
public abstract class Electronica extends Producto {
    
    private String fabricante;
    private String modelo;
    private String garantia;
//--------------------------------------------------------------------------------------------------

    public Electronica() {
        super ();
        this.fabricante = "-------------";
        this.garantia = "--------";
        this.modelo = "-------";
    }

    
    
    public Electronica(String fabricante, String modelo, String garantia, double precio, String nombre, String unidad) {
        super(precio, nombre, unidad);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantia = garantia;
    }
   

//---------------------------------------------------------------------------------------------------
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getGarantia() {
        return garantia;
    }
    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

 
    
}
