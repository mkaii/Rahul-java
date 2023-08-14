public class CartItem extends Item{


    private final Integer id;
    private Integer itemCount;//default Integer value is anyway 0 only
    private Double  itemTotalPrice;
    private final Category itemCategory;


    public CartItem(String name, String brand, double price, String description, Category itemCategory) {
        super(name, brand, price, description);
        itemCount = 0;
        itemTotalPrice = 0D;
        this.itemCategory = itemCategory;
        id = Utility.generateRandomId(this.itemCategory);

    }

    public CartItem(String name, String brand, double price, String description, Category itemCategory, Integer itemCount) {
        super(name, brand, price, description);
        this.itemCount = itemCount;
        itemTotalPrice =  this.itemCount * super.getPrice();
        this.itemCategory = itemCategory;
        id = Utility.generateRandomId(this.itemCategory);

    }

    public Integer getId() {
        return id;
    }

    public Category getItemCategory() {
        return itemCategory;
    }

    public Integer getItemCount() {
        return itemCount;
    }


    public Double getItemTotalPrice() {
        return itemTotalPrice;
    }

    public void add1Item()
    {
        itemCount++;
        itemTotalPrice = itemTotalPrice + super.getPrice();
    }


    public void remove1Item()
    {
        if(itemCount > 0)
        {
            itemCount--;
            itemTotalPrice = itemTotalPrice - super.getPrice();
            System.out.println("1 item removed");
        }
        else
        {
            System.out.println("Cannot remove any more item");
        }
    }


    @Override
    public String toString() {
        return "Item Details: " +
                "id: " + id +
                "\nname: " + getName() +
                "\nbrand: " + getBrand() +
                "\nprice :" + getPrice() +
                "\ndescription: " + getDescription() +
                "\nitemCount: " + itemCount +
                "\nitemTotalPrice: " + itemTotalPrice +
                "\nitemCategory: " + itemCategory;

    }
}
