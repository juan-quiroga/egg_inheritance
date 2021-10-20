
package Hijas;


public class Caballo extends Animal{


    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
        
    }
    
    
    @Override
    
    public void mensaje(Animal a){
        System.out.println("Me alimento de: "+a.getAlimento());
    }
    

    



    
}
