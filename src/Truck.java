public class Truck extends Car {
    public int loadCapacity; // грузоподъемность

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
    public String toString() {
        return "Грузовик{" +
                " марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объем двигателя=" + engineCapacity +
                ", грузоподъемность=" + loadCapacity +
                '}';
    }
}
