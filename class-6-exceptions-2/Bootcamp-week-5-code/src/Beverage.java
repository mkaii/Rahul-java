import pricestrategy.PriceStrategy;

/**
 * Represents an item of type "Beverage" with specific attributes like volume and carbonation status.
 */
public class Beverage extends CartItem{

    private final String volume;
    private final boolean isCarbonated;


    /**
     * Constructs a Beverage item with specified attributes.
     *
     * @param name The name of the beverage.
     * @param brand The brand of the beverage.
     * @param price The price of the beverage.
     * @param description The description of the beverage.
     * @param volume The volume of the beverage.
     * @param isCarbonated Whether the beverage is carbonated.
     */
    public Beverage(String name, String brand, double price, String description, String volume, boolean isCarbonated) {
        super(name, brand, price, description, Category.BEVERAGE);
        this.volume = volume;
        this.isCarbonated = isCarbonated;
    }

    /**
     * Constructs a Beverage item with specified attributes including count of item and price strategy.
     *
     * @param name The name of the beverage.
     * @param brand The brand of the beverage.
     * @param price The price of the beverage.
     * @param description The description of the beverage.
     * @param volume The volume of the beverage.
     * @param isCarbonated Whether the beverage is carbonated.
     * @param countOfItem The count of items in the beverage.
     * @param priceStrategy The price strategy for the beverage.
     */
    public Beverage(String name, String brand, double price, String description, String volume, boolean isCarbonated, Integer countOfItem, PriceStrategy priceStrategy) {
        super(name, brand, price, description, Category.BEVERAGE,countOfItem,priceStrategy);
        this.volume = volume;
        this.isCarbonated = isCarbonated;
    }

    /**
     * Returns the volume of the beverage.
     *
     * @return The volume of the beverage.
     */
    public String getVolume() {

        return volume;
    }

    /**
     * Returns whether the beverage is carbonated.
     *
     * @return {@code true} if the beverage is carbonated, {@code false} otherwise.
     */
    public boolean isCarbonated() {

        return isCarbonated;
    }

    @Override
    public double getRewardPoints() {
        return (0.8 * getPrice() + 0.1 * Double.parseDouble(getVolume())) * getItemCount();
    }
    /**
     * Returns a string representation of the Beverage's attributes.
     *
     * @return A string containing the Beverage's attributes.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nvolume: '" + volume +
                "\nisCarbonated: " + (isCarbonated ? "Yes" : "No");

    }
}
