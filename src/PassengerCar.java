public class PassengerCar extends Car implements Competing {
    public static final String CATEGORIA_CAR = "B";
    public int maxSpeed;
    private TypeBody typeBody;


    enum  TypeBody {TYPE_BODY_SEDAN("Седан") ,TYPE_BODY_HATCHBACK("хетчбек"),TYPE_BODY_COUPE("купе"),TYPE_BODY_STATIONWAGON("Универсал"),SUTYPE_BODY_SUV("Внедорожник"),CroTYPE_BODY_CROSSOVER("Кроссовер"),TYPE_BODY_PICKUP("Пикап"),Van("Фургон"),TYPE_BODY_MINIVAN("Минивын");
        private String name;
        TypeBody(String name) {
                this.name=name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

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
                " марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объем двигателя=" + engineCapacity +
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

    public String getTypeBody() {
        if (typeBody == null) {
            return "У автомобиля { "+ getModel()+" } данных по типу кузова недостаточно";
        } else {
            return "У автомобиля {"+ getModel()+ " } тип кузова -"+ typeBody.getName();
        }

    }

    public void setTypeBody(TypeBody typeBody) {
        this.typeBody = typeBody;
    }
}
