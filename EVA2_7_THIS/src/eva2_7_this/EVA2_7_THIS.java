package eva2_7_this;

/**
 *
 * @author LUIS MEZA
 */
public class EVA2_7_THIS {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //imprimir();
        //this no se puede usar en un metodo estatico
    }
    
    public void imprimir(){
        //aqui tambies es visible this
    }
    
}

//this es una referencia a una instancia de la clase
//todos los objetos tienen this
//puede usarse this en cualquier clase
//this solo existe internamente dentro del bjeto
class Persna{
    private String nombre;

    public Persna(String nombre) {
        this.nombre = nombre;
        //this.nombre es el atributo de la clase
        //nombre es la variable (parámetro) declarado en el método
    }
    
    

    public String getNombre() {
        return nombre;
    
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimirDatos(){
        System.out.println("El nombre es: " + this.nombre);
    }
    
}