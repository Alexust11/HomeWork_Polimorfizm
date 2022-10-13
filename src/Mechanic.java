import java.util.ArrayList;

public class Mechanic <T extends Car>{
    private String name;
    private String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }
    public boolean servise(T t) {
        return t.servise();
    }

    public void repair(T t) {
        t.repair();
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }
}
