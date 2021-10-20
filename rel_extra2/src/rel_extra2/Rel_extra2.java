package rel_extra2;

import java.util.ArrayList;

/**
 *
 * @author juanq
 */
public class Rel_extra2 {

    public static void main(String[] args) {
        
        Sala s = new Sala();
        s.crearSalaVacia();
        
        Cine c = new Cine();
        c.setSala(s);
        c.setPrecio(500);
        
        Pelicula peli = new Pelicula();
        c.setPeli(peli);
        c.getPeli().setMinAge(18);
        
        ArrayList<Espectador> lE = new ArrayList();
        
        c.crearEspectadores(lE);
        c.llenarSala(lE);
        s.mostrarSala();
    }
    
}
