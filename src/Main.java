// Client
public class Main {
    public static void main(String[] args) {

        CarFactory bmwFactory = new BMWFactory();
        Car bmw = bmwFactory.buildCar();
        System.out.println("Car built: " + bmw.getBrand());
        System.out.println("------------------");

        CarFactory toyotaFactory = new ToyotaFactory();
        Car toyota = toyotaFactory.buildCar();
        System.out.println("Car built: " + toyota.getBrand());
    }
}
