package pricestrategy;



/**
 * Represents a price strategy that increases the original price by a given percentage.
 */
public class IncreasedPriceStrategy implements PriceStrategy{

    /**
     * Calculates the modified price by increasing the original price
     * by the specified percentage.
     *
     * @param price The original price.
     * @param percentage The percentage increase.
     * @return The modified price after the increase.
     */
    @Override
    public double getModifiedPrice(double price, double percentage) {
        return (price * (1+(percentage * 0.01)));
    }
}
