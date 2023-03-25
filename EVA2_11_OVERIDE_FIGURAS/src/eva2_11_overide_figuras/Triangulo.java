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
public class Triangulo {
    private double altura;
    private double base;
    private double lad1;
    private double lad2;
    private double lad3;
    

       public Triangulo() {
    }
    public Triangulo(double altura, double base, double lad1, double lad2, double lad3) {
        this.altura = altura;
        this.base = base;
        this.lad1 = lad1;
        this.lad2 = lad2;
        this.lad3 = lad3;
    }
 

    

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLad1() {
        return lad1;
    }

    public void setLad1(double lad1) {
        this.lad1 = lad1;
    }

    public double getLad2() {
        return lad2;
    }

    public void setLad2(double lad2) {
        this.lad2 = lad2;
    }

    public double getLad3() {
        return lad3;
    }

    public void setLad3(double lad3) {
        this.lad3 = lad3;
    }
    
    //@Override
    public double calcularArea(){
        return base*altura/2;
    }
    //@Override
    public double calcularPeri(){
        return lad1+lad2+lad3;
    }

}
/* clase abstractas --- clase general. pero no e ueden genar ojeos
el ojetivo es que sirva a la super clase
etodos abstractos:



*/