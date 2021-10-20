package rel_ej2;

public class Rel_ej2 {

    public static void main(String[] args) {
        
        
        Revolver r = new Revolver();
        r.rellenarRevolver(r);
  
        
        Juego game = new Juego();
        game.setRevolver(r);
        System.out.println("A JUGAR!:");
        game.resultados(game);
        
        System.out.println(game);
        
    }
    
}
