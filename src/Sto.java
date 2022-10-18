import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Sto{
    private final Queue <Car> cars=new ArrayDeque<>();

    private void add(Car car) {
        cars.offer(car);

    }

    public void addPassengerCar(PassengerCar passengerCar) {
        add(passengerCar);

    }

    public void addTruck9(Truck truck) {
        add(truck);
    }

    public void serviseSto() {
        if (!cars.isEmpty()) {
            cars.poll();
            System.out.println("Автомобиль"+cars+" прошел обслужиание");
        }
    }
}
