/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_interfaces;

/**
 *
 * @author Usuario
 */
public class EVA2_17_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Persona perso = new Persona("luis meza",18);
   perso.imprimirDatos();
   //--------------------------------------------------------------------------------------------------------------
   Computadora compu = new Computadora("intel i7",12,25000,"Computadora");
   compu.imprimirDatos();
    }
}
