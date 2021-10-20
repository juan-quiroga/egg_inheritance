package rel_extra2;

public class Asiento {
    
    private int numero;
    private Letras letra;
    private boolean ocupado;

    public Asiento() {
    }

    public Asiento(int numero, Letras letra, boolean ocupado) {
        this.numero = numero;
        this.letra = letra;
        this.ocupado = ocupado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Letras getLetra() {
        return letra;
    }

    public void setLetra(Letras letra) {
        this.letra = letra;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Asiento{" + "numero=" + numero + ", letra=" + letra + ", ocupado=" + ocupado + '}';
    }
    
    
    
}
