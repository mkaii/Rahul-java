import console.Display;
import pricestrategy.PriceStrategy;

import java.util.ArrayList;
import java.util.List;

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

    public double getRewardPoints()
    {
        return 0;
    }



    public CartItem(String name, String brand, double price, String description, Category itemCategory, Integer itemCount) {
        super(name, brand, price, description);
        this.itemCount = itemCount;
        itemTotalPrice =  this.itemCount * super.getPrice();
        this.itemCategory = itemCategory;
        id = Utility.generateRandomId(this.itemCategory);

    }

    public CartItem(String name, String brand, double price, String description, Category itemCategory, Integer itemCount,PriceStrategy priceStrategy) {
        super(name, brand, price, description);
        this.itemCount = itemCount;
        itemTotalPrice =  this.itemCount * super.getPrice();
        this.itemCategory = itemCategory;
        id = Utility.generateRandomId(this.itemCategory);

        //modify price based on price strategy :

        double modifiedPrice = priceStrategy.getModifiedPrice(getPrice(),20);
        setPrice(modifiedPrice);
        itemTotalPrice = getPrice() * itemCount;

    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
        itemTotalPrice = getPrice() * itemCount;
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
           // Display.println("1 item removed");
        }
        else
        {
            Display.println("Cannot remove any more item");
        }
    }

    static List<Action> allowAbleActions()
    {
       List<Action> allowedActions = new ArrayList<>();
        allowedActions.add(new AddCartItemAction());
        allowedActions.add(new AddCartItemQuantityAction());
        allowedActions.add(new RemoveCartItemQuantityAction());

        return allowedActions;
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
