package pricestrategy;

public class IncreasedPriceStrategy implements PriceStrategy{

    @Override
    public double getModifiedPrice(double price, double percentage) {
        return (price * (1+(percentage * 0.01)));
    }
}
