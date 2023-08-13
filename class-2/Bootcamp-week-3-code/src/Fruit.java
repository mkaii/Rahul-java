public class Fruit extends Item{

    private final String ripeness;
    // try using enum
    public Fruit(String name, String brand, double price, String description, String ripeness) {
        super(name, brand, price, description);
        this.ripeness = ripeness;
    }

    public String getRipeness() {
        return ripeness;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRipeness: " + ripeness;
    }
}
