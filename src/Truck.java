public class Truck extends Car implements Competing {
    private int loadCapacity; // грузоподъемность
    private static final String CATEGORIA_CAR = "C";
    public Truck(String brand, String model, float engineCapacity, int loadCapacity) {
        super(brand, model, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMovement() {
        System.out.println("грузовик "+getBrand()+" марки "+getModel()+" начинает движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("грузовик "+getBrand()+" марки "+getModel()+" заканчивает движение");
    }

    @Override
    public String printCategoria() {
        return CATEGORIA_CAR;
    }


    @Override
    public String toString() {
        return "Грузовик{" +
                " марка='" + getBrand() + '\'' +
                ", модель='" + getModel() + '\'' +
                ", объем двигателя=" + getEngineCapacity() +
                ", грузоподъемность=" + loadCapacity +
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
}
