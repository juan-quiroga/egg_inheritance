package rel_extra2;

import java.util.ArrayList;

public class Sala {

    private ArrayList<Espectador> espectadores;

    private Asiento[][] matrizS = new Asiento[6][8];

    public Sala() {
    }

    public Sala(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Asiento[][] getMatrizS() {
        return matrizS;
    }

    public void setMatrizS(Asiento[][] matrizS) {
        this.matrizS = matrizS;
    }

    
    
    

    public void crearSalaVacia() {
        for (int j = 0; j < 6; j++) {
            for (int k = 0; k < 8; k++) {
                Asiento a = new Asiento();
                a.setLetra(Letras.values()[j]);
                a.setNumero(k+1);
                matrizS[j][k] = a;
            }
        }

//        MOSTRAR LA SALA:

    
    }

    public void mostrarSala(){
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println(matrizS[i][j]);
            }
        }
    }
}
