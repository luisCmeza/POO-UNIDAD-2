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
//clase derivada extens clase base
//subclase extends superclase
//hijo extends padre
//estudiante is-a persona
public class Estudiante extends Persona {
    private String noControl;
    

    //hay que incluir el constructor default
    public Estudiante(){
        super();//llamada al constructor de la superclase
        this.noControl =  "---------";
    }
    public Estudiante(String nombre, String apellido, int edad, String nocontrol){
       super(nombre, apellido, edad);
      this.noControl = nocontrol;
    }
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    //override: remplaza el metodo (con la misma firma) en la
    //super clase, en este caso, reemplaza a imprimirDatos() de
    //persona
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("no d control: " + noControl);
    }


}
