public class Bus extends Car implements Competing {
    public int numberSeats; // число пассажирских мест
    public static final String CATEGORIA_CAR = "D";
    public TypeCapacityPassenger typeCapacityPassenger;

    enum TypeCapacityPassenger {
        ECPECIALLY_SMAL("до 10 мест"), SMALL("до 25 мест"), AVERAGE("от 40 до 50 мест"), LARGE("от 60-80 мест"), ECPECIALLY_LARGE("от 100 до 120 мест");
        public String stringypeCapacityPassenger;

        TypeCapacityPassenger(String stringypeCapacityPassenger) {
            this.stringypeCapacityPassenger = stringypeCapacityPassenger;
        }

        public String getTypeCapacityPassenger() {
            return stringypeCapacityPassenger;
        }

        public void setTypeCapacityPassenger(String stringypeCapacityPassenger) {
            this.stringypeCapacityPassenger = stringypeCapacityPassenger;
        }

    }

    public Bus(String brand, String model, float engineCapacity, int numberSeats) {
        super(brand, model, engineCapacity);
        this.numberSeats = numberSeats;
    }


    @Override
    public void startMovement() {
        System.out.println("автобус " + getBrand() + " марки " + getModel() + " начинает движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("автобус " + getBrand() + " марки " + getModel() + " заканчивает движение");

    }

    @Override
    public String printCategoria() {
        return CATEGORIA_CAR;
    }

    public String  getTypeCapacityPassenger() {
        if (typeCapacityPassenger != null) {
            return "У автобуса {"+ getModel()+ " } вместимость пассажиров -"+ typeCapacityPassenger.getTypeCapacityPassenger();
        } else {
            return "У автобуса {"+ getModel()+ " } вместимость не определена";
        }


    }

    public void setTypeCapacityPassenger(TypeCapacityPassenger typeCapacityPassenger) {
        this.typeCapacityPassenger = typeCapacityPassenger;
    }
    //________________________________________
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
        return getBrand() + " вершил Пит-стоп";
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
