import java.util.List;

public class Main {
    public static void main(String[] args) {
        PassengerCar bmw = new PassengerCar("bmw","bmw X5", 3.3f, 250, TypeBody.HATCHBACK);
        PassengerCar lada = new PassengerCar("lada","Granta", 1.8f, 180, TypeBody.HATCHBACK);
        PassengerCar uaz = new PassengerCar("UAZ","Patriot", 2.5f, 150, TypeBody.COUPE);
        PassengerCar toyota = new PassengerCar("toyota","camri", 2.5f, 200, TypeBody.MINIVAN);

        //---------------------------------------------------
        System.out.println(" У автомобиля "+ bmw.getModel()+" кузов -"+bmw.getTypeBody().getType());

        //----------------------------------------------------
        Bus bus1 = new Bus("liaz","лиаз-5256", 6.65f, 23);
        Bus bus2 = new Bus("PAZ","Вектор Next", 4.43f, 43);
        Bus bus3 = new Bus("PAZ", "ПАЗ-3206", 4.67f, 28);
        Bus bus4 = new Bus("Volvo", "Volvo 9500", 7.7f, 53);


        //---------------------------------------------------------------------------------------
        Truck truck1 = new Truck("Hino", "Hino 300", 3f,LoadCapacity.N2);
        Truck truck2 = new Truck("Hino", "Hino 700", 12.9f,LoadCapacity.N3 );
        Truck truck3 = new Truck("GAZ","Валдай Next",2.8f, LoadCapacity.N1);
        Truck truck4 = new Truck("kamaz", "Компас", 3.76f, LoadCapacity.N1);
        System.out.println("Грузовик "+truck3.getModel()+" вместимостью " + truck3.getLoadCapacity().getCapacity());


        bmw.startMovement();
        bus1.finishMovement();
        truck1.startMovement();

        System.out.println(bmw);
        System.out.println(bus2);
        System.out.println(truck3);

        System.out.println(bus1.pitStop());
        System.out.println(truck4.pitStop());
        System.out.println(lada.pitStop());
        System.out.println("лучшее время "+bus2.bestTime(12.4f)+ " мин");
        System.out.println("_____________________________________________________________");
        service(bmw,lada,toyota,uaz,
                bus1,bus2,bus3,bus4,
                truck1,truck2,truck3,truck4);
        System.out.println("_____________________________________________________________");

            Driver<Bus> driver4 = new Driver<>("Иванов Сидр Сидорович","D",2f);
            Driver<PassengerCar> driver1 = new Driver<>("Иванов Иван Иванович","B",2f);
            Driver<Truck> driver2 = new Driver<>("Петров Петр Петрович", "C", 3);


        System.out.println(driver1);

        driver1.refueled(toyota);
        driver1.startMove(lada);
        driver1.finishMove(bmw);
        driver4.refueled(bus4);
        System.out.println("Стаж водителя "+ driver4.getFullName()+" "+ driver4.getExperience());;
        System.out.println("водитель "+ driver2.getFullName()+" "+ driver2.pitStop());
        //------------------------------------------------------------------------------------------------

        truck1.addDriver(driver2);
        System.out.println(truck1.getDrivers());
        //_______________________________________________________________________________________________
        Sponsor sponsor1 = new Sponsor("Тинькоф", 50000);
        Sponsor sponsor2 = new Sponsor("Немироф", 60000);
        Sponsor sponsor3 = new Sponsor("Елисеев", 70000);
        //_______________________________________________________________________________________________

        List<Car> cars = List.of(truck1, toyota, bus2, truck4);
        List<Sponsor> sponsors = List.of(sponsor1, sponsor2, sponsor3);

        Mechanic<Car> meh1=new Mechanic<>(" Василий "," Васильев ","RedBull ");
        Mechanic<Car> meh2=new Mechanic<>(" Кирилл "," Нкифоров ","RedWinks ");
        Mechanic<Truck> meh3=new Mechanic<>(" Игорь "," Кирилов ","1 TV ");
        List<Mechanic> mechanics = List.of(meh1, meh2, meh3);
        toyota.addMehanic(meh1);
        toyota.addSponsor(sponsor2);
        toyota.addMehanic(meh1);
        truck1.addMehanic(meh2);
        truck1.addSponsor(sponsor1,sponsor2);
        bus2.addMehanic(meh3);
        bus2.addSponsor(sponsor3);
        truck4.addMehanic(meh1,meh1);
        truck4.addSponsor(sponsor2,sponsor1);
        System.out.println("______________________________________");
        System.out.println(toyota.getMechanics());


    }

    private static void service(Car... cars) {
        for (int i = 0; i < cars.length; i++) {
             serviceCar(cars[i]);
        }
    }

    private static void serviceCar(Car car) {
        try {
            if (!car.servise()) {
                throw new RuntimeException(" Автомобиль " + car.getBrand() + " " + car.getModel() + " диагностику не прошел");
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


    }
}
