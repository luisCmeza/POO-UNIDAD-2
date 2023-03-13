
package eva2_3_extends;

/**
 * LUIS MEZA
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante();
        estu.setNombre("juan");
        estu.setApellido("perez");
        estu.setEdad(20);
        estu.setNoControl("22550299");
        System.out.println("IMPRIMIR DATOS:");
        System.out.println("nombre: " + estu.getNombre());
        System.out.println("apellido: " + estu.getApellido() );
        System.out.println("edad: " + estu.getEdad());
        System.out.println("no.control: " + estu.getNoControl());
        //------------------------------------------------------------------
        System.out.println("");
        //------------------------------------------------------------------
        Proveedores prove = new Proveedores();
        prove.setNombre("pepe");
        prove.setApellido("grillo");
        prove.setEdad(50);
        prove.setRfc("kjerhrrlgrglrgel");
        System.out.println("IMPRIMIR DATOS:");
        System.out.println("nombre: " + prove.getNombre());
        System.out.println("apellido: " + prove.getApellido() );
        System.out.println("edad: " + prove.getEdad());
        System.out.println("rfc: " +prove.getRfc());
    }
    
}
