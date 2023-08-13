public class Beverage extends Item{

    private final String volume;
    private final boolean isCarbonated;

    public Beverage(String name, String brand, double price, String description, String volume, boolean isCarbonated) {
        super(name, brand, price, description);
        this.volume = volume;
        this.isCarbonated = isCarbonated;
    }

    public String getVolume() {

        return volume;
    }

    public boolean isCarbonated() {

        return isCarbonated;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVolume: " + volume + "\nIs carbonated? " + (isCarbonated ? "Yes" : "No");
    }
}
