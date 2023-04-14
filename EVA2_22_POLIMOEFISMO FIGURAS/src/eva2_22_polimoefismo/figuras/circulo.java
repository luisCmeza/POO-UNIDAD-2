/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_polimoefismo.figuras;

/**
 *
 * @author Usuario
 */
public class circulo implements  Figuras,MostrarDatos{
    private double radio;

    public circulo() {
    }

    public circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
     return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public double calcularPeri() {
      return Math.PI * (radio * 2);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("area: " + calcularArea());
        System.out.println("peri: " + calcularPeri());
    }
    
    
}
