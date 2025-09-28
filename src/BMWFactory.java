// Concrete Factory
public class BMWFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }
}

