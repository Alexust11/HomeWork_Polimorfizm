public class PassengerCar extends Car implements Competing {
    private int maxSpeed;
    private static final String CATEGORIA_CAR = "B";
    public PassengerCar(String brand, String model, float engineCapacity, int maxSpeed) {
        super(brand, model, engineCapacity);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void startMovement() {
        System.out.println("легковой автомобиль "+getBrand()+" марки "+getModel()+" начинает движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("легковой автомобиль "+getBrand()+" марки "+getModel()+" заканчивает движение");

    }

    @Override
    public String printCategoria() {
        return CATEGORIA_CAR;
    }



    @Override
    public String toString() {
        return "Легковой автомобиль{" +
                " марка='" + getBrand() + '\'' +
                ", модель='" + getModel() + '\'' +
                ", объем двигателя=" + getEngineCapacity() +
                ", максимальная скорость=" + maxSpeed +
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
