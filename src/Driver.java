public class Driver <D extends Car&Competing> implements Competing{
    private String fullName;// ФИО
    private String categori;//категория B,C,D
    private float experience;//стаж

    public Driver(String fullName, String categori, float experience) {
        this.fullName = fullName;
        setCategori(categori);
        this.experience=experience;

    }

    public void startMove(D car) {
        if (categori.equals(car.printCategoria())) {

            System.out.println("Водитель " + getFullName() + " начал движение на " + car.getBrand());
        } else {
            System.out.println("Водитель " + getFullName() + " не имеет прав на управление " + car.getBrand());
        }


    }

    public void finishMove(D car) {
        if (categori.equals(car.printCategoria()))  {
            System.out.println("Водитель " + getFullName() + " закончил движение на " + car.getBrand());
        } else {
            System.out.println("Водитель " + getFullName() + " не имеет прав на управление " + car.getBrand());
        }
    }

    public void refueled(D car) {
        if (categori.equals(car.printCategoria())) {
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
        if (categori == null) {
            throw new IllegalArgumentException(" Необходимо указать категорию прав");
        }
        this.categori = categori;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }



    @Override
    public String toString() {
        return "водитель: " +"ФИО='" + fullName ;
    }

    @Override
    public String pitStop() {
        return "Заехал в бокс, заправился и сменил резину";
    }

    @Override
    public float bestTime(float time) {
        return time;
    }

    @Override
    public float maxSpeed(float speed) {
        return speed;
    }
}
