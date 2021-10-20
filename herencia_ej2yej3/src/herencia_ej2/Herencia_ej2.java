package herencia_ej2;

import Electro.Electrodomestico;
import Electro.Lavadora;
import Electro.Televisor;
import java.util.ArrayList;

public class Herencia_ej2 {

    public static void main(String[] args) {
        
        System.out.println("---TELEVISOR---");
        Televisor t = new Televisor();
        t.crearTelevision(t);
        t.precioFinal();
        
        
        System.out.println("---LAVADORA---");
        Lavadora l = new Lavadora();
        l.crearLavadora(l);
        l.precioFinal();
        
        System.out.println("-------------------------------");
        
        Televisor t2 = new Televisor(35,true,45000,"negro","B",15);
        Lavadora l2 = new Lavadora(21,50000,"blanco","C",30);
        
        ArrayList<Electrodomestico> listaElectro = new ArrayList();
        
        listaElectro.add(l);
        listaElectro.add(l2);
        listaElectro.add(t);
        listaElectro.add(t2);
        
        double totaltele=0;
        double totallava=0;
        
        for (Electrodomestico electrodomestico : listaElectro) {
            electrodomestico.precioFinal();
            if (electrodomestico instanceof Televisor){
                totaltele += electrodomestico.getPrecio();
            }
            if (electrodomestico instanceof Lavadora){
                totallava += electrodomestico.getPrecio();
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Precio total de televisores: "+ totaltele);
        System.out.println("Precio total de lavadoras: "+ totallava);
        System.out.println("Precio total de todo: "+ (totaltele+totallava));
        
    }
    
}
