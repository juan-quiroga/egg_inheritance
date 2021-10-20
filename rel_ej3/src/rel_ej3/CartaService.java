package rel_ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CartaService {

    Scanner sc = new Scanner(System.in);

    ArrayList<Carta> baraja = new ArrayList();
    List<Carta> repartidas;

    public void crearBaraja() {

        for (int j = 1; j < 13; j++) {

            Carta c = new Carta();
            if ((j != 8 & j != 9) & (0 < j & j < 13)) {
                c.setNumero(j);
                c.setPalo("ESPADA");
                baraja.add(c);
            }
        }
        for (int j = 1; j < 13; j++) {

            Carta c = new Carta();
            if ((j != 8 & j != 9) & (0 < j & j < 13)) {
                c.setNumero(j);
                c.setPalo("COPA");
                baraja.add(c);
            }
        }
        for (int j = 1; j < 13; j++) {

            Carta c = new Carta();
            if ((j != 8 & j != 9) & (0 < j & j < 13)) {
                c.setNumero(j);
                c.setPalo("BASTO");
                baraja.add(c);
            }
        }
        for (int j = 1; j < 13; j++) {

            Carta c = new Carta();
            if ((j != 8 & j != 9) & (0 < j & j < 13)) {
                c.setNumero(j);
                c.setPalo("ORO");
                baraja.add(c);
            }
        }
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }

    public void barajar() {
        Collections.shuffle(baraja);
        System.out.println("CARTAS MEZCLADAS: ");
        int i = 0;
        for (Carta carta : baraja) {
            System.out.println("Carta número: " + i + "  " + carta);
            i++;
        }
    }

    public void siguienteCarta() {
        System.out.println("La carta es:");
        System.out.println(baraja.get(0));
        

    }

    public void cartasDisponibles() {
        System.out.println("cartas disponibles");
        System.out.println(baraja.size());
    }

    public void darCartas() {
        System.out.println("¿Cuántas cartas desea sacar?:");
        int ans = sc.nextInt();
        //agrego la carta al conjunto de repartidas
        repartidas =  baraja.subList(0, ans);
        ArrayList<Carta> cartass = new ArrayList<Carta>(repartidas);
        
        //saco la carta de la baraja
        this.baraja.subList(0, ans).clear();
        System.out.println("Hay "+ cartass.size()+" cartas repartidas.");
        System.out.println("En la baraja quedan: "+ baraja.size()+" cartas.");
        
        System.out.println("Las cartas que salieron son:");
        for (Carta cartas : cartass) {
            System.out.println(cartas);
        }
    }

   

}
