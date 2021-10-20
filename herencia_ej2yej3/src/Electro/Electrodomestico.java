package Electro;

import java.util.Scanner;

public class Electrodomestico {
    
    Scanner sc = new Scanner(System.in);
    
    protected double precio;
    protected String color;
    protected String conenerg; 
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, String conenerg, double peso) {
        this.precio = precio;
        this.color = color;
        this.conenerg = conenerg;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConenerg() {
        return conenerg;
    }

    public void setConenerg(String conenerg) {
        this.conenerg = conenerg;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void comprobarConsumoEnergetico(String letra){
        for (int i = 0; i < ConsumoEnergetico.values().length; i++) {
            if (ConsumoEnergetico.values()[i].toString().equals(letra)){
            }else{
                letra = ConsumoEnergetico.F.toString();
            }
        }
    }
    
    public void comprobarColor(String color){
        color.toLowerCase();
        if (color.equals("blanco") ||
            color.equals("negro") ||
            color.equals("rojo") ||
            color.equals("azul") ||
            color.equals("gris") 
                ){
        }else{
            color = "blanco";
        }
    }
    
    
       
        
    public void crearElectrodomestico(){
        
        precio = 1000;
        
        System.out.println("ingresar COLOR del electrodoméstico:");
        String ans2 = sc.next();
        color = ans2;
        comprobarColor(color);
        
        System.out.println("ingresar CONSUMO ENERGETICO del electrodoméstico:");
        String ans3 = sc.next();
        conenerg = ans3;
        
        System.out.println("ingresar PESO del electrodoméstico");
        double ans4 = sc.nextDouble();
        peso = ans4;
    }
    
    public void precioFinal(){
        System.out.println(precio);
        System.out.println(color);
        System.out.println(conenerg.toUpperCase());
        String letra = conenerg;
        if (letra.toUpperCase().equals("A")){
            precio = precio+1000;
        }
        if (letra.toUpperCase().equals("B")){
            precio = precio+800;
        }
        if (letra.toUpperCase().equals("C")){
            precio = precio+600;
        }
        if (letra.toUpperCase().equals("D")){
            precio = precio+500;
        }
        if (letra.toUpperCase().equals("E")){
            precio = precio+300;
        }
        if (letra.toUpperCase().equals("F")){
            precio = precio+100;
        }
        
        double weight = peso;
        if (weight>=1 & weight<=19){
            precio = precio + 100;
        }
        if (weight>=20 & weight<=49){
            precio = precio +500;
        }
        if (weight>=50 & weight<=79){
            precio = precio +800;
        }
        if (weight>=80){
            precio = precio +1000;
        }
    }

    
    
}
