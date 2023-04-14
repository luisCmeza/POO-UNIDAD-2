/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_polimorfismo;

/**
 *
 * @author Usuario
 */
public class Docente  extends Persona{
    private String plaza;

    
    
    public Docente(){
        super();//llamada al constructor de la superclase
        this.plaza =  "---------";
    }
    public Docente(String nombre, String apellido, int edad, String plaza){
       super(nombre, apellido, edad);
       this.plaza = plaza;
    }
       
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("plaza: " + plaza);
    }
    
}
