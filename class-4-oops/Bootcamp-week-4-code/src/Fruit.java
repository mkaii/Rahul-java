public class Fruit extends CartItem{

    private final String ripeness;
    // try using enum
    public Fruit(String name, String brand, double price, String description, String ripeness) {
        super(name, brand, price, description, Category.FRUIT);
        this.ripeness = ripeness;
    }

    public Fruit(String name, String brand, double price, String description, String ripeness, Integer countOfItem) {
        super(name, brand, price, description, Category.FRUIT,countOfItem);
        this.ripeness = ripeness;
    }

    public String getRipeness() {
        return ripeness;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "\nripeness: " + ripeness;

    }
}
