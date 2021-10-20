package rel_extra4;

public class Alumno {
    
    private String nombrecompleto;
    private int dni;
    private int cantvotos;

    public Alumno() {
    }

    public Alumno(String nombrecompleto, int dni, int cantvotos) {
        this.nombrecompleto = nombrecompleto;
        this.dni = dni;
        this.cantvotos = cantvotos;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantvotos() {
        return cantvotos;
    }

    public void setCantvotos(int cantvotos) {
        this.cantvotos = cantvotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombrecompleto=" + nombrecompleto + ", dni=" + dni + ", cantvotos=" + cantvotos + '}';
    }
    
    
    
}
