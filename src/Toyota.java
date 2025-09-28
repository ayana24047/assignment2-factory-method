// Concrete Product
public class Toyota implements Car {
    private String brand = "Toyota";
    private String engineType = "Hybrid";
    private int year = 2024;

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
