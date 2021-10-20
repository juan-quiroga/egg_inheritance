package rel_ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Jugador> listaJugadores = new ArrayList();
    private Revolver revolver;

    public Juego() {
    }

    public Juego(Revolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "sc=" + sc + ", listaJugadores=" + listaJugadores + ", revolver=" + revolver + '}';
    }
    
    
    
    public void llenarJuego(){
        ArrayList<Jugador> listaJugadores = new ArrayList();
        System.out.println("¿Cuantos jugadores son?");
        int cant = sc.nextInt();
        for (int i = 0; i < cant; i++) {
            Jugador j1 = new Jugador();
            System.out.println("Nombre de los jugadores:");
            String nombre = sc.next();
            j1.setNombre(nombre);
            j1.setId(i+1);
            listaJugadores.add(j1);
        }
        System.out.println(listaJugadores);
    }
    
    public void ronda(Jugador j, Revolver r){
        System.out.println("Turno de "+j.getNombre());
        j.disparo(j, r);
        r.siguienteChorro(r);
    }
    
    public void resultados(Juego j){
        llenarJuego();

        for (Jugador aux : j.getListaJugadores()) {
            ronda(aux,j.getRevolver());
            System.out.println("JUGADOR:"+ aux.getNombre() + " NUMERO "+ aux.getId());
            if (aux.isMojado()){
                System.out.println("El jugador perdió.");
                return;
            }
        }
    }
    

    
}
