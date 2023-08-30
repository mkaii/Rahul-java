import pricestrategy.PriceStrategy;


/**
 * Represents an item of type "Egg Pack" with specific attributes like the number of eggs per pack and the best before date.
 */

public class EggPack extends CartItem{

    private final int numEggsPerPack;
    private final String bestBeforeDate;

    /**
     * Constructs an EggPack item with specified attributes.
     *
     * @param name The name of the egg pack.
     * @param brand The brand of the egg pack.
     * @param price The price of the egg pack.
     * @param description The description of the egg pack.
     * @param numEggsPerPack The number of eggs per pack.
     * @param bestBeforeDate The best before date of the egg pack.
     */
    public EggPack(String name, String brand, double price, String description, int numEggsPerPack, String bestBeforeDate) {
        super(name, brand, price, description, Category.EGG);
        this.numEggsPerPack = numEggsPerPack;
        this.bestBeforeDate = bestBeforeDate;
    }



    /**
     * Constructs an EggPack item with specified attributes including count of item and price strategy.
     *
     * @param name The name of the egg pack.
     * @param brand The brand of the egg pack.
     * @param price The price of the egg pack.
     * @param description The description of the egg pack.
     * @param numEggsPerPack The number of eggs per pack.
     * @param bestBeforeDate The best before date of the egg pack.
     * @param countOfItem The count of items in the egg pack.
     * @param priceStrategy The price strategy for the egg pack.
     */
    public EggPack(String name, String brand, double price, String description, int numEggsPerPack, String bestBeforeDate, Integer countOfItem, PriceStrategy priceStrategy) {
        super(name, brand, price, description, Category.EGG,countOfItem,priceStrategy);
        this.numEggsPerPack = numEggsPerPack;
        this.bestBeforeDate = bestBeforeDate;
    }


    /**
     * Returns the number of eggs per pack.
     *
     * @return The number of eggs per pack.
     */
    public int getNumEggsPerPack() {
        return numEggsPerPack;
    }


    /**
     * Returns the best before date of the egg pack.
     *
     * @return The best before date of the egg pack.
     */
    public String getBestBeforeDate() {
        return bestBeforeDate;
    }


    @Override
    public double getRewardPoints() {
        return (0.75*getPrice() + 0.2*getNumEggsPerPack()) * getItemCount();
    }

    /**
     * Returns a string representation of the EggPack's attributes.
     *
     * @return A string containing the EggPack's attributes.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nnumEggsPerPack: " + numEggsPerPack +
                "\nbestBeforeDate: " + bestBeforeDate ;

    }
}
