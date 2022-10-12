public class Bus extends Car implements Competing {
    private int numberSeats; // число пассажирских мест
    private static final String CATEGORIA_CAR = "D";
    public Bus(String brand, String model, float engineCapacity, int numberSeats) {
        super(brand, model, engineCapacity);
        this.numberSeats = numberSeats;
    }



    @Override
    public void startMovement() {
        System.out.println("автобус "+getBrand()+" марки "+getModel()+" начинает движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("автобус "+getBrand()+" марки "+getModel()+" заканчивает движение");

    }

    @Override
    public String printCategoria() {
        return CATEGORIA_CAR;
    }

    @Override
    public String toString() {
        return "Автобус{" +
                " марки='" + getBrand() + '\'' +
                ", модель='" + getModel() + '\'' +
                ", объем двигателя=" + getEngineCapacity() +
                ", число мест=" + numberSeats +
                '}';
    }

    @Override
    public String pitStop() {
        return getBrand()+" вершил Пит-стоп";
    }

    @Override
    public float bestTime(float time) {
        return time;
    }

    @Override
    public float maxSpeed(float speed) {
        return speed;
    }

    @Override
    public boolean servise() {
        System.out.println(" Автобус" + getBrand()+ " "+getModel()+ " в диагностике не требуется");
        return true;
    }
}
