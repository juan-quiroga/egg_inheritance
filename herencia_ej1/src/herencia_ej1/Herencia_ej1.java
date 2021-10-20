package herencia_ej1;

import Hijas.Animal;
import Hijas.Caballo;
import Hijas.Gato;
import Hijas.Perro;

public class Herencia_ej1 {

    public static void main(String[] args) {
        
        // declaración del objeto PERRO
        Animal perro = new Perro("Stich","comida balanceada",15,"Doberman");
   
        
        perro.mensaje(perro);
        
        //declaración de otro objeto PERRO
        Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro2.mensaje(perro2);

        //declaración del objeto GATO
        Animal gato = new Gato("Pelusa","Galletas",15,"Siames");
        gato.mensaje(gato);
        //decl objeto CABALLO
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.mensaje(caballo);


    }
    
}
