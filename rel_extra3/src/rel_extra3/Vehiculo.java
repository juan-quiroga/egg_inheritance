package rel_extra3;

public class Vehiculo {
    
    private String marca;
    private String chasis;
    private String color;
    private Tipo tipo;
    private String modelo;
    private int año;
    private int numerodeMotor;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String chasis, String color, Tipo tipo, String modelo, int año, int numerodeMotor) {
        this.marca = marca;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.modelo = modelo;
        this.año = año;
        this.numerodeMotor = numerodeMotor;
    }
    
    
    
}
