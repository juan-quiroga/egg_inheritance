package rel_ej3;

import java.util.Scanner;

public class MenuCartas {

    public void Menu() {
        int num = 0;
        int operacion = 0;

        Scanner sc = new Scanner(System.in);

        CartaService cs = new CartaService();
        cs.crearBaraja();
    
    
        while (operacion != 5) {
            System.out.println("MENU:");
            System.out.println("1. BARAJAR");
            System.out.println("2. ELEGIR UNA CARTA Y MOSTRAR LA SIGUIENTE");
            System.out.println("3. MOSTRAR CANTIDAD DE CARTAS DISPONIBLES");
            System.out.println("4. DAR CARTAS");
            System.out.println("5. SALIR");
            operacion = Integer.valueOf(sc.next());
            if (operacion == 1) {
                cs.barajar();
            }
            if (operacion == 2) {
                cs.siguienteCarta();
            }
            if (operacion == 3) {
                cs.cartasDisponibles();
            }
            if (operacion == 4) {
                cs.darCartas();
            }
            if (operacion == 5) {
                System.out.println("Chau.");
            }
            if (operacion != 1 && operacion != 2 && operacion != 3 && operacion != 4 && operacion != 5) {
                System.out.println("ERROR, ingrese un numero correcto.");
            }
        }

    }
}