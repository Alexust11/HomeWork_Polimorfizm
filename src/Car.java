import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Car {
    private String brand;
    private String model;
    private float engineCapacity;//объем двигателя
    private List<Driver<?>> drivers=new ArrayList<>();
    private List<Mechanic<?>> mechanics=new ArrayList<>();
    private List<Sponsor> sponsors=new ArrayList<>();


    public Car(String brand, String model, float engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;

    }

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }
    public void addMehanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor...sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
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

    public abstract boolean servise();

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

public  List<Mechanic<?>> getMechanics()
    {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void repair();
}
