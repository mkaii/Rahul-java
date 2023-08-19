public abstract class Item {

    // these are the attributes of the Item Class
    private final String name;
    private final String brand;
    private final double price;
    private final String description;


    // Now using Constructor to initialize the attribute
    public Item(String name, String brand, double price, String description) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    // using the getters ...
    public String getName() {

        return name;
    }

    public String getBrand() {

        return brand;
    }

    public double getPrice() {

        return price;
    }

    public String getDescription() {

        return description;
    }



    @Override
    // toString: display the attributes of the item
    public String toString() {
        return "Name: " + name + "\nBrand: " + brand + "\nPrice: $" + price + "\nDescription: " + description;
    }
}
