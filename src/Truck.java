public class Truck extends Car implements Competing {
    private  LoadCapacity capacity;// грузоподъемность

    private static final String CATEGORIA_CAR = "C";
    public Truck(String brand, String model, float engineCapacity, LoadCapacity capacity) {
        super(brand, model, engineCapacity);
        this.capacity=capacity;
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
    public boolean servise() {
        return Math.random()>0.6;
    }

    @Override
    public void repair() {
        System.out.println(getBrand()+" "+ getModel()+ " отремонтирована");
    }

    public LoadCapacity getLoadCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Грузовик{" +
                " марка='" + getBrand() + '\'' +
                ", модель='" + getModel() + '\'' +
                ", объем двигателя=" + getEngineCapacity() +
                ", грузоподъемность=" + capacity +
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
