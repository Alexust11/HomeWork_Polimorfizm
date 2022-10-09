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





    }
}