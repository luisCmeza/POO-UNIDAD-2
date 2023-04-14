/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_polimoefismo.figuras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_22_POLIMOEFISMOFIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     /*  circulo[ ]  circulos = new circulo[100];
       //un areglo en java va de la posicion 0 a la N-1
       //N es la cantidad de eementos del areglo
       for (int i = 0; i < circulos.length; i++){
           circulos[i] = new circulo(i);//creamos cada uno de los objetos
           circulos[i].imprimirDatos();
       }
       
    }*/
    Figuras[ ] figuras;//deckaramos un arreglo, pero no lo
                                 //hemos creado
    //con el Scanner capturamos por el tecladp la cantidad
    //de figuras a utilizar
    Scanner input = new Scanner (System.in);
    System.out.println("cuantas figuras quieres capturar");
    int cant = input.nextInt();//nos permite capturar
    figuras = new Figuras[cant];//creamos el arreglo con la
                                                 //cantidad de figuras que
                                                 //quiere el usuario
    for (int i = 0; i < cant; i++) {
        System.out.println("capturar tipo de figura: ");
        System.out.println("1. circulo, 2. triangulo");
        int figu = input.nextInt(i);
        if (figu == 1) {//circulo
            circulo circu = new circulo();
            System.out.println("introduce el radio: ");
            circu.setRadio(input.nextDouble());
            figuras[i] = new circu;
           
        }else{//triangulo
            Triangulo trian = new Triangulo();
            System.out.println("introduce base");
            trian.getBase(input.nextDouble());
            System.out.println("introduce altura: ");
            trian.setAltura(input.nextDouble());
            figuras[i] = trian;
        }
    }
    for (int i = 0; i < figuras.length; i++) {
        if(figuras [i] instanceof circulo){
            System.out.println("circulo: ");
        circulo circu = (circulo)figuras[i];//casting
    }else{
            System.out.println("triangulo: ");
        System.out.println("area: " + figuras[i].calcularArea());
        System.out.println("peri: " + figuras[i].calcularPeri()).
                ;
    }
    }
}
}