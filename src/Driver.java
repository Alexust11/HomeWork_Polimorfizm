public class Driver <D extends Car&Competing> {
    private String fullName;// ФИО
    private String categori;//категория B,C,D
    private float experience;//стаж

    public Driver(String fullName) {
        this.fullName = fullName;

    }

    public void startMove(D car) {
        if (categori == car.printCategoria()) {
            System.out.println("Водитель " + getFullName() + " начал движение на " + car.getBrand());
        } else {
            System.out.println("Водитель " + getFullName() + " не имеет прав на управление " + car.getBrand());
        }


    }

    public void finishMove(Car car) {
        if (categori == car.printCategoria()) {
            System.out.println("Водитель " + getFullName() + " закончил движение на " + car.getBrand());
        } else {
            System.out.println("Водитель " + getFullName() + " не имеет прав на управление " + car.getBrand());
        }
    }

    public void refueled(Car car) {
        if (categori == car.printCategoria()) {
            System.out.println("Водитель " + getFullName() + " заправил " + car.getBrand());
        } else {
            System.out.println("Водитель " + getFullName() + " не имеет прав на управление " + car.getBrand());
        }

    }
    public String getFullName() {
        return fullName;
    }

    public String getCategori() {
        return categori;
    }

    public float getExperience() {
        return experience;
    }

    public void setCategori(String categori) {
        this.categori = categori;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "водитель{" +
                "ФИО='" + fullName + '\'' +
                ", категория='" + categori + '\'' +
                ", стаж=" + experience +
                '}';
    }
}
