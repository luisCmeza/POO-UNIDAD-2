package eva2_21_polimorfismo;

/**
 * @author LUIS
 */
public class EVA2_21_POLIMORFISMO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante();
        estu.setApellido("meza");
        estu.setNombre("luis carlos");
        estu.setEdad(18);
        estu.setNoControl("22550299");
       
        Docente doc = new Docente();
        doc.setApellido("perez");
        doc.setNombre("juan");
        doc.setEdad(30);
        doc.setPlaza("plaza");
        //puedo tratar a los ojetos de las sunclases
        //como objetos de la superclase
        //al reves no se puede
        //estoy pasando un ojeto de tipo estudiante a un objto de tipo persona
        Persona perso = estu;
        //estoy generalizando(simplificado)
       // perso.
       Persona perso2 = doc;
       Persona perso3 = new Persona();
       //es omposible convertir una perona en un estudiante
       //no podemos agregar csas, simplemente ocultamos propiedades
      // Estudiante estudiante = new perso3;
       
    }
    
}
