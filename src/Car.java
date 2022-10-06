public abstract class Car {
    public  String categoria;
    public String brand;
    public String model;
    public float engineCapacity;//объем двигателя

    public Car(String brand, String model, float engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public float getEngineCapacity() {
        return engineCapacity;
    }

    public abstract void startMovement();

    public abstract void finishMovement();

    public abstract String printCategoria();

 //___________________

}
