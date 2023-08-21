package pricestrategy;

public class ReducedPriceStrategy implements PriceStrategy{
    @Override
    public double getModifiedPrice(double price,double percentage) {
        return (price * (1-(percentage * 0.01)));
    }
}
