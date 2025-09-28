// Client
public class Main {
    public static void main(String[] args) {
        // Создаем BMW
        CarFactory bmwFactory = new BMWFactory();
        Car bmw = bmwFactory.buildCar();
        System.out.println("Car built: " + bmw.getBrand());
        System.out.println("------------------");

        // Создаем Toyota
        CarFactory toyotaFactory = new ToyotaFactory();
        Car toyota = toyotaFactory.buildCar();
        System.out.println("Car built: " + toyota.getBrand());
    }
}
