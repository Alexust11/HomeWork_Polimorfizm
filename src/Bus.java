public class Bus extends Car implements Competing {
    public int numberSeats; // число пассажирских мест

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
        return "D";
    }

    @Override
    public String toString() {
        return "Автобус{" +
                " марки='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объем двигателя=" + engineCapacity +
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
}
