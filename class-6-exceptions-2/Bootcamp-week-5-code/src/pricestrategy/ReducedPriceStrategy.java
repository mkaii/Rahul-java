package pricestrategy;

/**
 * Represents a price strategy that reduces the original price by a given percentage.
 */
public class ReducedPriceStrategy implements PriceStrategy{

    /**
     * Calculates the modified price by reducing the original price
     * by the specified percentage.
     *
     * @param price The original price.
     * @param percentage The percentage reduction.
     * @return The modified price after the reduction.
     */
    @Override
    public double getModifiedPrice(double price,double percentage) {
        return (price * (1-(percentage * 0.01)));
    }
}
