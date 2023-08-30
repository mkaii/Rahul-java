package pricestrategy;

/**
 * The {@code PriceStrategy} interface represents a strategy for modifying prices based on a percentage value.
 * Classes implementing this interface define specific algorithms for adjusting prices.
 */
public interface PriceStrategy {


    /**
     * Calculates the modified price based on the original price and a specified percentage.
     *
     * @param price The original price.
     * @param percentage The percentage by which to modify the price (can be positive or negative).
     * @return The modified price.
     */
    double getModifiedPrice(double price, double percentage);
}
