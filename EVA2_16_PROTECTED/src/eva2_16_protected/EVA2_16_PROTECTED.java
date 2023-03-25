/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_protected;

/**
 *
 * @author Usuario
 */
public class EVA2_16_PROTECTED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperClase sub = new SuperClase();
        sub.dato=100;
    }   
}
class SuperClase{
    protected int dato;
}
class SubClase extends SuperClase{
    public void imprimirDatos(){
        System.out.println("el valor de dato es; " + dato);
    }  
}