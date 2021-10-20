package formas;
public class Rectangulo implements calculosFormas{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void area(){
        System.out.println("el área es: "+(base*altura));
    }
    @Override
    public void perimetro(){
        System.out.println("el perímetro es: "+(2*base+2*altura));
    }
    
}
