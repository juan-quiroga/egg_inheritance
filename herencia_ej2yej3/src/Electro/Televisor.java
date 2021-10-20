package Electro;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    Scanner sc = new Scanner(System.in);
    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
        super();
    }

    public Televisor(int resolucion, boolean sintonizador, Integer precio, String color, String conenerg, Integer peso) {
        super(precio, color, conenerg, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevision(Televisor t){
        super.crearElectrodomestico();
        System.out.println("ingrese RESOLUCIÓN del electrodoméstico:");
        int ans2 = sc.nextInt();
        resolucion = ans2;
        System.out.println("¿Tiene sintonizador?");
        String ans3 = sc.next();
        if (ans3.toLowerCase().equals("si")){
            sintonizador = true;
        }
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (this.resolucion>40){
            precio = precio + precio*0.3;
        }
        if (this.sintonizador){
            precio = precio + 500;
        }
        System.out.println("el precio final del televisor es:"+precio);
    }
}
