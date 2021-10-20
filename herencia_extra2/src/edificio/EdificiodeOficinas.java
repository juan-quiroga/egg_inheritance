package edificio;

import java.util.Scanner;

public class EdificiodeOficinas extends Edificio{
    
    Scanner sc = new Scanner(System.in);
    
    private int nrooficinas;
    private int personasporof;
    private int nropisos;

    public EdificiodeOficinas() {
    }


    public EdificiodeOficinas(int nrooficinas, int personasporof, int nropisos, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.nrooficinas = nrooficinas;
        this.personasporof = personasporof;
        this.nropisos = nropisos;
    }
    

    public int getNrooficinas() {
        return nrooficinas;
    }

    public void setNrooficinas(int nrooficinas) {
        this.nrooficinas = nrooficinas;
    }

    public int getPersonasporof() {
        return personasporof;
    }

    public void setPersonasporof(int personasporof) {
        this.personasporof = personasporof;
    }

    public int getNropisos() {
        return nropisos;
    }

    public void setNropisos(int nropisos) {
        this.nropisos = nropisos;
    }
    
    

    @Override
    public void calcularSuperficie() {
        System.out.println("SUPERFICIE edificio de oficinas: "+(ancho*largo));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("VOLUMEN edificio de oficinas: "+(ancho*largo*alto));
    }
    
    public void cantPersonas(){
        System.out.println("Ingrese la cantidad de personas por oficina:");
        int ans = sc.nextInt();
        System.out.println("Ingrese la cantidad de oficinas:");
        int ans2 = sc.nextInt();
        System.out.println("Ingrese la cantidad de pisos:");
        int ans3 = sc.nextInt();
        
        System.out.println("En un piso entran "+ ans2+" personas.");
        System.out.println("En todo el edificio entran "+(ans*ans3) +" personas.");
        
        
        
    }
    
    
    
    
}
