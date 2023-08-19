public class Beverage extends CartItem{

    private final String volume;
    private final boolean isCarbonated;

    public Beverage(String name, String brand, double price, String description, String volume, boolean isCarbonated) {
        super(name, brand, price, description, Category.BEVERAGE);
        this.volume = volume;
        this.isCarbonated = isCarbonated;
    }

    public Beverage(String name, String brand, double price, String description, String volume, boolean isCarbonated, Integer countOfItem) {
        super(name, brand, price, description, Category.BEVERAGE,countOfItem);
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
        return super.toString() +
                "\nvolume: '" + volume +
                "\nisCarbonated: " + (isCarbonated ? "Yes" : "No");

    }
}
