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
public class EVA2_11_OVERIDE_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circu = new Circulo();
        System.out.println("area: " + circu.clalularArea() );
        System.out.println("perimetro: " + circu.calcularPeri());
        
        Triangulo tria = new Triangulo();
        System.out.println("area: " + tria.calcularArea());
        System.out.println("perimetro: " + tria.calcularPeri());
    }
    
}
