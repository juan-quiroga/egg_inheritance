
package clases;

import java.util.Comparator;

public class hotelcinco extends Hotel{
    
    public String gimnasio;
    public String nombrerest;
    public int capacidadrest;
    
    public int cantsalonesconf;
    public int cantsuites;
    public int cantlimosinas;

    public hotelcinco() {
    }

    public hotelcinco(String gimnasio, String nombrerest, int capacidadrest, int cantsalonesconf, int cantsuites, 
            int cantlimosinas, int canthab, int nrocamas, int cantpisos, Integer preciohab) {
        super(canthab, nrocamas, cantpisos, preciohab);
        this.gimnasio = gimnasio;
        this.nombrerest = nombrerest;
        this.capacidadrest = capacidadrest;
        this.cantsalonesconf = cantsalonesconf;
        this.cantsuites = cantsuites;
        this.cantlimosinas = cantlimosinas;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombrerest() {
        return nombrerest;
    }

    public void setNombrerest(String nombrerest) {
        this.nombrerest = nombrerest;
    }

    public int getCapacidadrest() {
        return capacidadrest;
    }

    public void setCapacidadrest(int capacidadrest) {
        this.capacidadrest = capacidadrest;
    }

    public int getCantsalonesconf() {
        return cantsalonesconf;
    }

    public void setCantsalonesconf(int cantsalonesconf) {
        this.cantsalonesconf = cantsalonesconf;
    }

    public int getCantsuites() {
        return cantsuites;
    }

    public void setCantsuites(int cantsuites) {
        this.cantsuites = cantsuites;
    }

    public int getCantlimosinas() {
        return cantlimosinas;
    }

    public void setCantlimosinas(int cantlimosinas) {
        this.cantlimosinas = cantlimosinas;
    }
    
    

    @Override
    public void precioH() {
        int val_res=0;
        int val_gim=0;
        int val_lim=0;
        
        if (capacidadrest<=30) {
            val_res =10;
        }
        if (capacidadrest>30 & capacidadrest<50) {
            val_res =30;
        }
        if (capacidadrest>=50) {
            val_res =50;
        }
        
        if (gimnasio.equals("A")){
            val_gim=50;
        }
        if (gimnasio.equals("B")){
            val_gim=30;
        }
        
        cantlimosinas = 12;
        val_lim = cantlimosinas*15;
        
        preciohab = 50+1*1+val_res+val_gim+val_lim;
        System.out.println("PRECIO POR HABITACION EN HOTEL CINCO ESTRELLAS: "+preciohab);
    }
    
    
    
    
    
    

    
    
    
}
