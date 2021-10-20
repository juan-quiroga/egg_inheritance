package Electro;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    Scanner sc = new Scanner(System.in);
    private double carga;

    public Lavadora() {
        super();
    }

    public Lavadora(double carga, Integer precio, String color, String conenerg, Integer peso) {
        super(precio, color, conenerg, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(Lavadora l){
        super.crearElectrodomestico();
        System.out.println("ingrese la CARGA del electrodoméstico:");
        double ans = sc.nextDouble();
        carga = ans;
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (carga>=30){
            precio = precio+500;
        }
        System.out.println("el precio final de la lavadora es: "+precio);
    }
    
    
    
    
    
    
}
