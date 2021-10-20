package clases;
public class AExtrahotelero extends Alojamiento{
    
    protected boolean privado;
    protected double cantmetroscuadrados;

    public AExtrahotelero() {
    }

    public AExtrahotelero(boolean privado, double cantmetroscuadrados) {
        this.privado = privado;
        this.cantmetroscuadrados = cantmetroscuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getCantmetroscuadrados() {
        return cantmetroscuadrados;
    }

    public void setCantmetroscuadrados(double cantmetroscuadrados) {
        this.cantmetroscuadrados = cantmetroscuadrados;
    }
    
}
