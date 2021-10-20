package rel_ej1;

import java.util.Scanner;

public class Rel_ej1 {

    public static void main(String[] args) {
        
        AdopcionService as = new AdopcionService();
        
        as.crearPersonasyPerros();
        as.perritosDisponibles();
        as.adopcion();
        System.out.println("\n ----PERROS DISPONIBLES-----\n ");
        as.perritosDisponibles();
        
        
    }
    
}
