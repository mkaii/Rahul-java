import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<CartItem> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public Double getTotalPriceOfAllItems()
    {
        double totalPriceOfCartItems = 0;
        for(CartItem myItem : cartItems)
        {
            totalPriceOfCartItems = totalPriceOfCartItems + myItem.getItemTotalPrice() ;
        }

        return totalPriceOfCartItems;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }


    public void addCartItemToShoppingCart(CartItem item)
    {
        cartItems.add(item);
    }

    public void clear() {

        cartItems.clear();
    }


    //create to string to show all the items in the cart with quantity and total price
    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartItems=" + cartItems +
                '}';
    }
}
