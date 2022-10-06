public class Truck extends Car implements Competing {
    public int loadCapacity; // грузоподъемность
    public final String CATEGORIA="D";
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
        return "C";
    }


    @Override
    public String toString() {
        return "Грузовик{" +
                " марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объем двигателя=" + engineCapacity +
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
