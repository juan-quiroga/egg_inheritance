package clases;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Hotel extends Alojamiento {

    protected int canthab;
    protected int nrocamas;
    protected int cantpisos;
    protected Integer preciohab;

    public Hotel() {
    }

    public Hotel(int canthab, int nrocamas, int cantpisos, int preciohab) {
        this.canthab = canthab;
        this.nrocamas = nrocamas;
        this.cantpisos = cantpisos;
        this.preciohab = preciohab;
    }

    public int getCanthab() {
        return canthab;
    }

    public void setCanthab(int canthab) {
        this.canthab = canthab;
    }

    public int getNrocamas() {
        return nrocamas;
    }

    public void setNrocamas(int nrocamas) {
        this.nrocamas = nrocamas;
    }

    public int getCantpisos() {
        return cantpisos;
    }

    public void setCantpisos(int cantpisos) {
        this.cantpisos = cantpisos;
    }

    public Integer getPreciohab() {
        return preciohab;
    }

    public void setPreciohab(Integer preciohab) {
        this.preciohab = preciohab;
    }

    public abstract void precioH();

    public static Comparator<Hotel> compararPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel h1, Hotel h2) {
            return h2.getPreciohab().compareTo(h1.getPreciohab());
        }
    };

}
