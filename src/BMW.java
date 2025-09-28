// Concrete Product
public class BMW implements Car {
    private String brand = "BMW";
    private String engineType = "V6 Turbo";
    private int year = 2025;

    @Override
    public void assemble() {
        System.out.println("Assembling " + brand + " with engine: " + engineType);
    }

    @Override
    public void testDrive() {
        System.out.println("Test driving " + brand + " " + year + " model...");
    }

    @Override
    public String getBrand() {
        return brand;
    }
}
