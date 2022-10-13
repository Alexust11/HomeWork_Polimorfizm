import java.util.ArrayList;
import java.util.List;

public class Sponsor {

    private String name;
    private int summa;

    public Sponsor(String name, int summa) {
        this.name = name;
        this.summa = summa;
    }



    public String getName() {
        return name;
    }

    public int getSumma() {
        return summa;
    }

    public void sponsirovat() {
        System.out.println(getName()+ " спонсирует заезд на сумму "+getSumma());
    }

    @Override
    public String toString() {
        return "Спонсор: " +getName()+", проспонсировал на сумму -"+getSumma();
    }
}
