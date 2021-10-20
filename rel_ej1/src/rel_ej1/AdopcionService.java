package rel_ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author juanq
 */
public class AdopcionService {

    Scanner sc = new Scanner(System.in);

    ArrayList<Persona> listaPersonas = new ArrayList();
    ArrayList<Perro> listaPerros = new ArrayList();

    public void crearPersonasyPerros() {
        String ans = "";
        String ans2 = "";
        String ans4 = "";
        do {
            Persona p = new Persona();
            System.out.println("CREAR PERSONA");
            ans = sc.next();
            p.setNombre(ans);
            listaPersonas.add(p);
            System.out.println("Crear otra persona?");
            ans2 = sc.next();
        } while (ans2.toLowerCase().equals("si"));

        do {
            System.out.println("CREAR PERRO");
            String ans3 = sc.next();
            Perro pe = new Perro();
            System.out.println("Crear otro perro?");
            ans4 = sc.next();

            pe.setNombre(ans3);

            listaPerros.add(pe);

        } while (ans4.toLowerCase().equals("si"));
    }

    public void adopcion() {
        System.out.println("Nombre del adoptante:");
        String r = sc.next();
        for (Persona pers : listaPersonas) {
            if (r.equals(pers.getNombre())) {

                System.out.println("¿Que perro desea adoptar?");
                String ans = sc.next();
//                System.out.println("¿Qué raza?");
//                String ans2 = sc.next();
                for (Perro perro : listaPerros) {
                    if (perro.getNombre().equals(ans)) {
                        System.out.println("Adoptado!!");
                        pers.setPerro(perro);
                    }
                }
                Iterator<Perro> it = listaPerros.iterator();
                while (it.hasNext()) {
                    Perro next = it.next();
                    if (next.getNombre().equals(ans)) {
                        it.remove();
                    }
                }
            }
        }
    }

    public void perritosDisponibles() {
        for (Perro p : listaPerros) {
            System.out.println(p);
        }
    }

}
