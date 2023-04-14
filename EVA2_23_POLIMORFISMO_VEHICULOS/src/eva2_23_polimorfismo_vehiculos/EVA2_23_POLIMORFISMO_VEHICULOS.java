package eva2_23_polimorfismo_vehiculos;
/**
 * @author Luis Meza
 */
public class EVA2_23_POLIMORFISMO_VEHICULOS {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    //♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠
    interface DatosVehiculo{
        void acelerar(int cambio);
        void tablero();
    }
    //♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠
    class Vehiculo{
        private String marca;
        private int velocidad;
//------------------------------------------------------------------------------
        public Vehiculo() {
            this.marca = "------";
            this.velocidad = 0;
        }
        public Vehiculo(String marca, int velocidad) {
            this.marca = marca;
            this.velocidad = velocidad;
        }
//------------------------------------------------------------------------------
        public String getMarca() {
            return marca;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public int getVelocidad() {
            return velocidad;
        }
        public void setVelocidad(int velocidad) {
            this.velocidad = velocidad;
        }         
    }
    //♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠
    class Automovil extends Vehiculo{
        private String marca;
        private String modelo;
        private int año;
//------------------------------------------------------------------------------
        public Automovil() {
            super();
            this.marca = "----------";
            this.modelo = "----------";
            this.año = 0;
        }
//------------------------------------------------------------------------------
        public Automovil(String marca, String modelo, int año,  int velocidad) {
            super(marca, velocidad);
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
        }
 //------------------------------------------------------------------------------    
        public String getMarca() {
            return marca;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        public int getAño() {
            return año;
        }
        public void setAño(int año) {
            this.año = año;
        }
       
    }
    //♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠
    class Bicicleta extends Vehiculo{
    private String tipo;
    private String rodada;
//------------------------------------------------------------------------------
    public Bicicleta() {
        this.rodada = "---------";
        this.tipo = "----------";
    }
//------------------------------------------------------------------------------
    public Bicicleta(String tipo, String rodada, String marca, int velocidad) {
            super(marca, velocidad);
            this.tipo = tipo;
            this.rodada = rodada;
     }
//------------------------------------------------------------------------------
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getRodada() {
        return rodada;
    }
    public void setRodada(String rodada) {
        this.rodada = rodada;
    }
 
  }
}