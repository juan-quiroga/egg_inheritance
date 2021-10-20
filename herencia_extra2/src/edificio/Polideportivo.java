package edificio;

public class Polideportivo extends Edificio {
    
    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    

    @Override
    public void calcularSuperficie() {
        System.out.println("SUPERFICIE polideportivo "+nombre+": " +(ancho*largo));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("VOLUMEN polideportivo "+nombre+": "+(ancho*largo*alto));
    }
    
    
    
    
   
    
    
}
