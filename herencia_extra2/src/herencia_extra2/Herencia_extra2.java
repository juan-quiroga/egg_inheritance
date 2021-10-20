package herencia_extra2;

import edificio.Edificio;
import edificio.EdificiodeOficinas;
import edificio.Polideportivo;
import java.util.ArrayList;

public class Herencia_extra2 {

    public static void main(String[] args) {
        ArrayList<Edificio> listEdif = new ArrayList();
        
        
        Polideportivo p1 = new Polideportivo("UNO",true,12,30,10);
        Polideportivo p2 = new Polideportivo("DOS",false,10,100,20);
        
        //la consigna no tiene sentido? porque dice que numero de oficinas y numero de pisos son iguales...
        EdificiodeOficinas o1 = new EdificiodeOficinas(10,50,10,20,20,20);
        EdificiodeOficinas o2 = new EdificiodeOficinas(15,25,15,70,30,15);
        
        listEdif.add(p1);
        listEdif.add(p2);
        listEdif.add(o1);
        listEdif.add(o2);
        
        for (Edificio edificio : listEdif) {
            if (edificio instanceof Polideportivo){
                System.out.println("POLIDEPORTIVO:");
            }else{
                System.out.println("OFICINAS");
            }
            
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            
            
            
            
            if (edificio instanceof Polideportivo){
                if (((Polideportivo) edificio).isTechado()){
                    System.out.println("es techado.");
                }else{
                    System.out.println("no es techado.");
                }
            }
            if (edificio instanceof EdificiodeOficinas){
                ((EdificiodeOficinas) edificio).cantPersonas();
                
            }
            System.out.println("--------------------------");
            
        }
    }
    
}
