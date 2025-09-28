// Creator (Factory Method)
public abstract class CarFactory {
    public abstract Car createCar();


    public Car buildCar() {
        Car car = createCar();
        car.assemble();
        car.testDrive();
        return car;
    }
}
