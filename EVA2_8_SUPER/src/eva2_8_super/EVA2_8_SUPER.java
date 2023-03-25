/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_super;

/**
 *
 * @author Usuario
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal("jdlal",10);
        Mamifero mamifero = new Mamifero("rojo","asdfghjkl",80);
        Canes can = new Canes();
        
    }
   
}
 class Animal{
     private String nombre;
     private int peso;
     
       public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
        public Animal(){
            System.out.println("its alive!!");
        }
        public Animal(String nombre, int peso){
            this.nombre = nombre;
            this.peso = peso;
            System.out.println("its alive constructor 2");
        }
        public void Respirar(){
            System.out.println("si respiroooooo");
        }

  
        
        
    }
    class Mamifero extends Animal{
        private String colorPelo;
        public Mamifero(){
            //super----- apuntador a la superclase
            //lo primero a llamar en constructor es llamar al constructor de la superclase
            super();//llamada al constructor default
            System.out.println("soy un mamifero!!!!!");
        }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public Mamifero(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public Mamifero(String colorPelo, String nombre, int peso) {
        super(nombre, peso);//llamada al constructor de la superclase
        this.colorPelo = colorPelo;
        System.out.println("soy un mamifero constructor 2!!");
    }
        
    }
class Canes extends Mamifero{

    public Canes() {
        super();
        System.out.println("soy un can!!");
    }
    
}