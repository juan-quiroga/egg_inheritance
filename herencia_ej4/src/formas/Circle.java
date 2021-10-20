package formas;

public class Circle implements calculosFormas{
    
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public Circle() {
    }
    

    @Override
    public void area(){
        System.out.println("el área es: "+(pi*Math.pow(radio, 2)));
    }
    @Override
    public void perimetro(){
        System.out.println("el perímetro es: "+(2*pi*radio));
    }
    
}
