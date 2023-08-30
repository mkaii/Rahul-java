package pricestrategy;


/**
 * Represents a regular price strategy that maintains the original price without modification.
 */
public class RegularPriceStrategy implements PriceStrategy{

    /**
     * Returns the original price unchanged, as this strategy represents
     * no modification to the price.
     *
     * @param price The original price.
     * @param percentage The percentage value (not used in this strategy).
     * @return The original price.
     */
    @Override
    public double getModifiedPrice(double price,double percentage) {
        return price;
    }
}
