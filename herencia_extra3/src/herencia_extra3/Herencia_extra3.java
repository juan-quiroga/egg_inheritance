package herencia_extra3;

import clases.Alojamiento;
import clases.Hotel;
import clases.hotelcinco;
import clases.hotelcuatro;
import java.util.ArrayList;

public class Herencia_extra3 {

    public static void main(String[] args) {
        ArrayList<Alojamiento> listaAlojamientos = new ArrayList();
        ArrayList<Hotel> listaHoteles = new ArrayList();
        
        hotelcuatro h1 = new hotelcuatro();
        hotelcinco h2 = new hotelcinco();
        hotelcinco h3 = new hotelcinco();
        
        h1.setNombre("sheraton");
        h2.setNombre("hyatt");
        
        h2.setGimnasio("A");
        h2.setCapacidadrest(50);
        
        
        h2.precioH();
        h1.setPreciohab(200);
        h3.setPreciohab(450);
        
        
        listaAlojamientos.add(h1);
        listaHoteles.add(h1);
        listaAlojamientos.add(h2);
        listaHoteles.add(h2);
        listaAlojamientos.add(h3);
        listaHoteles.add(h3);
        
        
        listaHoteles.sort(Hotel.compararPrecio);
        for (Hotel aux : listaHoteles) {
            System.out.println(aux +","+ aux.getPreciohab());
        }
        
        //LOS PRECIOS DE LAS HABITACIONES ESTÁN COMO INTEGER POR QUE ES LA ÚNICA FORMA EN QUE ME FUNCIONABA
        //EL COMPARATOR. TRATAR DE ORDENAR CON DOUBLE.
            
        
    }
    
}
