public class Truck extends Car implements Competing {
    public int loadCapacity; // грузоподъемность
    public static final String CATEGORIA_CAR = "C";
    private TypeLoadCapacity typeLoadCapacity;
    enum TypeLoadCapacity { N1 ("3,5 тонны"), N2 ("от 3,5 тонн до 12 тонн"), N3("свыше 12 тонн");

        public String type;
         TypeLoadCapacity(String type) {
            this.type=type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
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

    public String getTypeLoadCapacity() {
        if (typeLoadCapacity != null) {
            return "У автомобиля {"+ getModel()+ " } грузоподъемность -"+ typeLoadCapacity.getType();
        } else {
            return "У автомобиля {"+ getModel()+ " } грузоподъемность не определена";
        }



    }

    public void setTypeLoadCapacity(TypeLoadCapacity typeLoadCapacity) {
        this.typeLoadCapacity = typeLoadCapacity;
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
