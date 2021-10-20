package edificio;

public abstract class Edificio {
    
    protected double alto;
    protected double ancho;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double alto, double ancho, double largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();
    
    

    
    
    
}
