public class PassengerCar extends Car {
    public int maxSpeed;

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
    public String toString() {
        return "Легковой автомобиль{" +
                " марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объем двигателя=" + engineCapacity +
                ", максимальная скорость=" + maxSpeed +
                '}';
    }
}
