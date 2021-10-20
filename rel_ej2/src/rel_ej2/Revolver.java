package rel_ej2;

public class Revolver {
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void rellenarRevolver(Revolver r){
        // para un tambor de 6 lugares
        r.setPosicionActual((int) (Math.random()*6 + 1));
        r.setPosicionAgua((int) (Math.random()*6 + 1));
    }
    
    public boolean mojar(Revolver r){
        if (r.getPosicionActual()==r.getPosicionAgua()){
            return true;
        }
        return false;
    }
    
    public void siguienteChorro(Revolver r){
        if (r.getPosicionActual()!=r.getPosicionAgua()){
            r.setPosicionActual(posicionActual+1);
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    
    
}
