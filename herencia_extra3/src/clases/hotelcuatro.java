package clases;


public class hotelcuatro extends Hotel{

    public String gimnasio;
    public String nombrerest;
    public int capacidadrest;

    public hotelcuatro() {
    }

    public hotelcuatro(String gimnasio, String nombrerest, int capacidadrest, int canthab, int nrocamas, 
            int cantpisos, Integer preciohab) {
        super(canthab, nrocamas, cantpisos, preciohab);
        this.gimnasio = gimnasio;
        this.nombrerest = nombrerest;
        this.capacidadrest = capacidadrest;
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

    
    

    @Override
    public void precioH() {
        int val_res=0;
        int val_gim=0;
        
        preciohab = 50+1*1+val_res+val_gim;
        
        if (capacidadrest<30) {
            val_res =10;
        }
        if (capacidadrest>30 & capacidadrest<50) {
            val_res =30;
        }
        if (capacidadrest>50) {
            val_res =50;
        }
        
        if (gimnasio.equals("A")){
            val_gim=50;
        }
        if (gimnasio.equals("B")){
            val_gim=30;
        }
        
    }
    
    
    
    
    
    

    

    

   
    
    
    

    

    
}
