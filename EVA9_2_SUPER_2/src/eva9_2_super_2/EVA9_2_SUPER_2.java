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
public class EVA9_2_SUPER_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante("luis", "meza", 18, "22550299");
        estudiante.imprimirDatos();
        System.out.println("nocontrol: " + estudiante.getNoControl());
        
        
        Proveedores prov = new Proveedores("david","martinez",20,"rfc");
        prov.imprimirDatos();
        System.out.println("rfc: " + prov.getRfc());
        
        
        Docente doc = new Docente("david","martinez",20,"plaza");
        doc.imprimirDatos();
        System.out.println("plaza:" + doc.getPlaza());
        
    }
    
    
    
}
