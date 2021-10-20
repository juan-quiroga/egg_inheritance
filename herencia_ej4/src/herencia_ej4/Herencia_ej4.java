package herencia_ej4;

import formas.Circle;
import formas.Rectangulo;

public class Herencia_ej4 {

    public static void main(String[] args) {
        
        Circle c = new Circle(2);
        Rectangulo r = new Rectangulo(2,8);
        
        
        System.out.println("AREA DEL CÍRCULO:");
        c.area();
        System.out.println("------------");
        System.out.println("PERIMETRO DEL CÍRCULO:");
        c.perimetro();
        System.out.println("------------");
        System.out.println("AREA DEL RECTÁNGULO:");
        r.area();
        System.out.println("------------");
        System.out.println("PERIMETRO DEL RECTÁNGULO:");
        r.perimetro();
        System.out.println("------------");
        
        
        
    }
    
}
