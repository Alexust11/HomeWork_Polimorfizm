public class Main {
    public static void main(String[] args) {
        PassengerCar bmw = new PassengerCar("bmw","bmw X5", 3.3f, 250);
        PassengerCar lada = new PassengerCar("lada","Granta", 1.8f, 180);
        PassengerCar uaz = new PassengerCar("UAZ","Patriot", 2.5f, 150);
        PassengerCar toyota = new PassengerCar("toyota","camri", 2.5f, 200);



        //----------------------------------------------------
        Bus bus1 = new Bus("liaz","лиаз-5256", 6.65f, 23);
        Bus bus2 = new Bus("PAZ","Вектор Next", 4.43f, 43);
        Bus bus3 = new Bus("PAZ", "ПАЗ-3206", 4.67f, 28);
        Bus bus4 = new Bus("Volvo", "Volvo 9500", 7.7f, 53);


        //---------------------------------------------------------------------------------------
        Truck truck1 = new Truck("Hino", "Hino 300", 3f, 4600);
        Truck truck2 = new Truck("Hino", "Hino 700", 12.9f, 18000);
        Truck truck3 = new Truck("GAZ","Валдай Next",2.8f, 4700);
        Truck truck4 = new Truck("kamaz", "Компас", 3.76f, 5990);

        bmw.startMovement();
        bus1.finishMovement();
        truck1.startMovement();

        System.out.println(bmw);
        System.out.println(bus2);
        System.out.println(truck3);


    }
}