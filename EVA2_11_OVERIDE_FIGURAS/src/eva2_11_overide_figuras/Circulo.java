/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_overide_figuras;

/**
 *
 * @author Usuario
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double clalularArea(){
        return Math.PI * (radio*radio);
    }
    
    @Override
    public double calcularPeri(){
        return Math.PI * (radio*2);
    }
            
    
}
