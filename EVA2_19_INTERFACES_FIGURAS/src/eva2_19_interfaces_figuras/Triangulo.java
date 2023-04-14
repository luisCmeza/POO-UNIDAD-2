/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_interfaces_figuras;

/**
 *
 * @author Usuario
 */ 
public class Triangulo implements Figuras , MostrarDatos{
    //---------------------------------------------------------
    private double base;
    private double altura;
    private double lado;
//---------------------------------------------------------
    public Triangulo() {
    }

    public Triangulo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    
    //---------------------------------------------------------------

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
       return (base * altura)/2;
    }

    @Override
    public double calcularPeri() {
        double hip = Math.hypot(base, altura);
        return base + altura + hip;
    }

    @Override
    public void imprimirDatos(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
