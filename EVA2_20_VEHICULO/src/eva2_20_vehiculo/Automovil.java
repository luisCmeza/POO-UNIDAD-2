/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_vehiculo;

/**
 *
 * @author Usuario
 */
public class Automovil extends Vehiculo implements ControlVelocidad{

   private String modelo;
   private String color;
   //-------------------------------------------------------

    public Automovil() {
    }

    public Automovil(String modelo, String color, int velocidad, String marca) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.color = color;
    }
   //--------------------------------------------------------

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //-------------------------------------------------------------
   
    @Override
    public int acelerar() {
     
    }

    @Override
    public int detener() {
    
       
    }

    @Override
    public void iprimirVel() {
        System.out.println("marca: " + velocidad);
    }
    
}
