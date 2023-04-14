package eva2_20_vehiculo;

/**
 *
 * @author Usuario
 */
public abstract class Vehiculo {
    protected int velocidad;
    protected String marca;
//------------------------------------------------------------------------------
    public Vehiculo() {
    }

    public Vehiculo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }
//-----------------------------------------------------------------------------------------
    public int getVelocidad() {
        return velocidad;
    }
    //--------------
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //----------------
    
    
}
