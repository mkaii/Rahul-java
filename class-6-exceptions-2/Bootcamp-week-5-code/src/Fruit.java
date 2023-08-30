import pricestrategy.PriceStrategy;


/**
 * Represents an item of type "Fruit" with specific attributes like ripeness.
 */
public class Fruit extends CartItem{

    private final String ripeness;

    /**
     * Constructs a Fruit item with specified attributes.
     *
     * @param name The name of the fruit.
     * @param brand The brand of the fruit.
     * @param price The price of the fruit.
     * @param description The description of the fruit.
     * @param ripeness The ripeness level of the fruit.
     */
    public Fruit(String name, String brand, double price, String description, String ripeness) {
        super(name, brand, price, description, Category.FRUIT);
        this.ripeness = ripeness;
    }



    /**
     * Constructs a Fruit item with specified attributes including count of item and price strategy.
     *
     * @param name The name of the fruit.
     * @param brand The brand of the fruit.
     * @param price The price of the fruit.
     * @param description The description of the fruit.
     * @param ripeness The ripeness level of the fruit.
     * @param countOfItem The count of items in the fruit.
     * @param priceStrategy The price strategy for the fruit.
     */
    public Fruit(String name, String brand, double price, String description, String ripeness, Integer countOfItem, PriceStrategy priceStrategy) {
        super(name, brand, price, description, Category.FRUIT,countOfItem,priceStrategy);
        this.ripeness = ripeness;
    }


    /**
     * Returns the ripeness level of the fruit.
     *
     * @return The ripeness level of the fruit.
     */
    public String getRipeness() {
        return ripeness;
    }


    @Override
    public double getRewardPoints() {
        return 0.5 * getPrice() * getItemCount();
    }

    /**
     * Returns a string representation of the Fruit's attributes.
     *
     * @return A string containing the Fruit's attributes.
     */
    @Override
    public String toString() {
        return super.toString()  +
                "\nripeness: " + ripeness;

    }
}
