package rel_extra2;

/**
 *
 * @author juanq
 */
public class Espectador {
    private String name;
    private int age;
    private int moneyAv;
    
    private Asiento asientoAsignado;

    public Espectador() {
    }

    public Espectador(String name, int age, int moneyAv) {
        this.name = name;
        this.age = age;
        this.moneyAv = moneyAv;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoneyAv() {
        return moneyAv;
    }

    public void setMoneyAv(int moneyAv) {
        this.moneyAv = moneyAv;
    }

    public Asiento getAsientoAsignado() {
        return asientoAsignado;
    }

    public void setAsientoAsignado(Asiento asientoAsignado) {
        this.asientoAsignado = asientoAsignado;
    }

    @Override
    public String toString() {
        return "Espectador{" + "name=" + name + ", age=" + age + ", moneyAv=" + moneyAv + ", asientoAsignado=" + asientoAsignado + '}';
    }

    
}
