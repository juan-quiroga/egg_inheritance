package rel_extra2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cine {

    Scanner sc = new Scanner(System.in);
    private String titulo;
    private int precio;
    private Sala sala;
    private Pelicula peli;
    
    private ArrayList<Espectador> listaEspectadores;
    

    public Cine() {
    }

    public Cine(String titulo, int precio, ArrayList<Espectador> listaEspectadores, Pelicula peli) {
        this.titulo = titulo;
        this.precio = precio;
        this.listaEspectadores = listaEspectadores;
        this.peli = peli;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Espectador> getListaEspectadores() {
        return listaEspectadores;
    }

    public void setListaEspectadores(ArrayList<Espectador> listaEspectadores) {
        this.listaEspectadores = listaEspectadores;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    
    

    public void crearEspectadores(ArrayList<Espectador> listaEspectadores) {
        String ans = "";
        String ans2 = "";
            
        do {
            Espectador e = new Espectador();

            System.out.println("Nombre Espectador:");
            ans = sc.next();
            System.out.println("Edad Espectador:");
            int edad = sc.nextInt();
            System.out.println("Dinero disponible:");
            int dinero = sc.nextInt();

            if (edad >= peli.getMinAge()) {
                if (dinero >= precio) {
                    
                    if (listaEspectadores.size() <= 48) {
                        e.setName(ans);
                        e.setAge(edad);
                        e.setMoneyAv(dinero);
                        Asiento a = new Asiento();
                        e.setAsientoAsignado(a);
                        
                        int x = (int) (Math.floor(Math.random() * 8) + 1);

                        e.getAsientoAsignado().setNumero(x);
                        e.getAsientoAsignado().setLetra(Letras.values()[(int) Math.floor(Math.random() * 6)]);
                        e.getAsientoAsignado().setOcupado(true);
                        

                        listaEspectadores.add(e);
                    }else{
                        System.out.println("La sala ya está completa.");
                    }
                } else {
                    System.out.println("El dinero es insuficiente.");
                }
            } else {
                System.out.println("No tiene la edad minima requerida para ver la pelicula.");
            }

            System.out.println("¿desea agregar otro espectador?");
            ans2 = sc.next();

        } while (ans2.toLowerCase().equals("si"));
        
       if (ans2.equalsIgnoreCase("no")){
           for (Espectador e : listaEspectadores) {
               System.out.println(e);
           }
       }
    }

    public void verificarAsientoDesocupado() {
        for (Espectador aux : listaEspectadores) {
            if (aux.getAsientoAsignado().isOcupado()) {
                System.out.println("El asiento ya está ocupado, elegir otro.");
            }
        }
    }
    
    public void llenarSala(ArrayList<Espectador> listaEspectadores){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                
                for (int k = 0; k < listaEspectadores.size(); k++) {
                    if (sala.getMatrizS()[i][j].getNumero() == listaEspectadores.get(k).getAsientoAsignado().getNumero()
                            &
                            sala.getMatrizS()[i][j].getLetra().equals(listaEspectadores.get(k).getAsientoAsignado().getLetra())
                            ) 
                    
                    {
                        System.out.println("ASIENTOES ASIGNADOS:");
                        System.out.println((sala.getMatrizS()[i][j].getLetra())+" "+sala.getMatrizS()[i][j].getNumero() );
                        sala.getMatrizS()[i][j].setOcupado(true);
                        
                    }
                    
                    if (sala.getMatrizS()[i][j].isOcupado()){
                        continue;
                    }
                    
            
                }
            }
        }
        
        
    }
    
    

}
