/**
 * Represents an abstract item with attributes such as name, brand, price, and description.
 */
public abstract class Item {


    // these are the attributes of the Item Class
    private final String name;
    private final String brand;
    private double price;
    private final String description;


    /**
     * Constructs an item with specified attributes.
     *
     * @param name The name of the item.
     * @param brand The brand of the item.
     * @param price The price of the item.
     * @param description The description of the item.
     */
    public Item(String name, String brand, double price, String description) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    /**
     * Returns the name of the item.
     *
     * @return The name of the item.
     */
    public String getName() {

        return name;
    }


    /**
     * Returns the brand of the item.
     *
     * @return The brand of the item.
     */
    public String getBrand() {

        return brand;
    }


    /**
     * Returns the price of the item.
     *
     * @return The price of the item.
     */
    public double getPrice() {

        return price;
    }


    /**
     * Returns the description of the item.
     *
     * @return The description of the item.
     */
    public String getDescription() {

        return description;
    }



    /**
     * Sets the price of the item.
     *
     * @param price The new price of the item.
     */
    public void setPrice(double price) {
        this.price = price;
    }




    /**
     * Returns a string representation of the item's attributes.
     *
     * @return A string containing the item's attributes.
     */
    @Override
    // toString: display the attributes of the item
    public String toString() {
        return "Name: " + name + "\nBrand: " + brand + "\nPrice: $" + price + "\nDescription: " + description;
    }
}
