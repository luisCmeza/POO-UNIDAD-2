/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_25_hasadireccion;

/**
 *
 * @author Usuario
 */
public class EVA2_25_HASADIRECCION {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        // TODO code application logic here
        Persona persona =new Persona();

        Direccion direccion = new Direccion();

        
    }
    
   class Direccion{
       private String calle;
       private int numero;
       private String Colonia;
       private String cp;
       private String ciudad;
       private String estado;

        public Direccion() {
             this.calle = "-----";
            this.numero = 0;
            this.Colonia = "----";
            this.cp = "------";
            this.ciudad = "-----";
            this.estado = "----";

        }

        public Direccion(String calle, int numero, String Colonia, String cp, String ciudad, String estado) {
            this.calle = calle;
            this.numero = numero;
            this.Colonia = Colonia;
            this.cp = cp;
            this.ciudad = ciudad;
            this.estado = estado;
        }

        public String getCalle() {
            return calle;
        }

        public void setCalle(String calle) {
            this.calle = calle;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getColonia() {
            return Colonia;
        }

        public void setColonia(String Colonia) {
            this.Colonia = Colonia;
        }

        public String getCp() {
            return cp;
        }

        public void setCp(String cp) {
            this.cp = cp;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
               
       public void imprimirDatos(){
           System.out.println("direccion: ");
           System.out.println(calle + "#" + numero + "," + Colonia + "/n C.P" + cp + "," + ciudad + "," + estado);
           
       }
   }
   
   class Persona{
           private String nombre;
           private String apelido;
           private int edad;
           private Direccion direccion;//has a (tiene una)   direccion

        public Persona() {
              this.nombre = "-----";
            this.apelido = "-----";
            this.edad = 0;
            this.direccion = null;//NO EXISTE EL OBJETO DIRECCION
        }

        public Persona(String nombre, String apelido, int edad, Direccion direccion) {
            this.nombre = nombre;
            this.apelido = apelido;
            this.edad = edad;
            this.direccion = direccion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApelido() {
            return apelido;
        }

        public void setApelido(String apelido) {
            this.apelido = apelido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Direccion getDireccion() {
            return direccion;
        }

        public void setDireccion(Direccion direccion) {
            this.direccion = direccion;
        }
        
        public void imprimirDatos(){
            System.out.println("Persona: ");
            System.out.println(nombre + " " + apelido + " " + edad + "años");
            if(direccion == null)
                System.out.println("sin direccion");
            else
            direccion.imprimirDatos();
   }
   }      
   class Sucursal{
       private String nombreSucursal;
       private Direccion direcion;
   }
}
