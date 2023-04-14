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
public class Bicicleta extends Vehiculo implements ControlVelocidad {
  private  String tipo;
  private int peso;

    public Bicicleta() {
    }

    public Bicicleta(String tipo, int peso, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    

    @Override
    public int acelerar() {
     
    }

    @Override
    public int detener() {
       
    }

    @Override
    public void iprimirVel() {
       
    }
  
  
}
