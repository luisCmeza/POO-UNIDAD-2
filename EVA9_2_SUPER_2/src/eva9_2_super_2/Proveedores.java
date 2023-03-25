/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva9_2_super_2;

/**
 *
 * @author Usuario
 */
public class Proveedores extends Persona {
    private String rfc;

    
     public Proveedores(){
        super();//llamada al constructor de la superclase
        this.rfc =  "---------";
    }
    public Proveedores(String nombre, String apellido, int edad, String rfc){
       super(nombre, apellido, edad);
       this.rfc = rfc;
    }
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("RFC: " + rfc);
    }
    
}
