package rel_extra4;

import java.util.ArrayList;
import java.util.Scanner;

public class Simulador {
    
    public void crearListaAlumnos(){
        ArrayList<String> listaNombres = new ArrayList();
        
        for (int i = 0; i < 10; i++) {
            listaNombres.add(Nombres.values()[(int) (Math.floor(Math.random() * 12) + 1)].toString() + " "+
                    Apellidos.values()[(int) (Math.floor(Math.random() * 12) + 1)].toString());
        }
        for (String listaNombre : listaNombres) {
            System.out.println(listaNombre);
        }
    }
    
    public void crearListaDnis(){
        ArrayList<Integer> listadni = new ArrayList();
        for (int i = 0; i < 10; i++) {
            listadni.add((int) Math.floor(30000000+Math.random()*10000000));
        }
        for (Integer integer : listadni) {
            System.out.println(integer);
        }
    }
    
    public void asdas(ArrayList<String> listaNombres,ArrayList<Integer> listadni){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos:");
        int j = sc.nextInt();
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        for (int i = 0; i < j; i++) {
            Alumno a = new Alumno();
            a.setNombrecompleto(listaNombres.get((int) (Math.floor(Math.random() * 12) + 1)));
            a.setDni(listadni.get((int) (Math.floor(Math.random() * 12) + 1)));
            listaAlumnos.add(a);
        }
        for (Alumno al : listaAlumnos) {
            if (al.getDni() == )
        }
        
        
    }
    
    
}
