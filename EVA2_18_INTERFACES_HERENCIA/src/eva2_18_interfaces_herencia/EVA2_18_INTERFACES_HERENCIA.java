/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_18_interfaces_herencia;

/**
 *
 * @author Usuario
 */
public class EVA2_18_INTERFACES_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface intA{
    void A();//implicitamente ets incluido el public abstract
}

interface intB{
    void B();
}

interface intC extends intA, intB{
    void C();
}

class Prueba implements intC{

    @Override
    public void C() {
      
    }

    @Override
    public void A() {
   
    }

    @Override
    public void B() {
     
    }
    
}