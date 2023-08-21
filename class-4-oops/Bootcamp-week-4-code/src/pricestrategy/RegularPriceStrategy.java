package pricestrategy;

public class RegularPriceStrategy implements PriceStrategy{
    @Override
    public double getModifiedPrice(double price,double percentage) {
        return price;
    }
}
