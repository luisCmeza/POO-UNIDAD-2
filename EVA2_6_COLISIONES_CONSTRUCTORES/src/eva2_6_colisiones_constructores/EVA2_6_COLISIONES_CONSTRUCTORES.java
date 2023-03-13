package eva2_6_colisiones_constructores;

/**
 * @author Usuario
 */
public class EVA2_6_COLISIONES_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        animal.comer();
        animal.respirar();
        System.out.println("");
        System.out.println("MAMIFERO");
        Mamifero mamifero = new Mamifero();
        
    }
    
}
