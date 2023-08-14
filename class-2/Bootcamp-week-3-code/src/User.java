public class User {

    private double balance = 0;
    private final ShoppingCart myCart;

    public User() {
        this.myCart = new ShoppingCart();
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double balance) {
        this.balance = this.balance + balance;
    }

    public ShoppingCart getMyCart() {
        return myCart;
    }

    //confirm order :

    public void confirmPurchase()
    {
        double orderPrice = myCart.getTotalPriceOfAllItems();

        if(orderPrice <= balance)
        {
            balance = balance - orderPrice;
            myCart.clear();

            //remove from superMarket as well :
        }
        else
        {
            System.out.println("Not enough balance!!!.....add more balance");
        }
    }

    private int findIndexOfMatchingOfItem(CartItem myItem)
    {
        for(int index = 0;index < myCart.getCartItems().size(); index++)
        {
            CartItem item = myCart.getCartItems().get(index);
            if(myItem.getName().equals(item.getName()) && myItem.getBrand().equals(item.getBrand()) &&  (myItem.getPrice()==(item.getPrice())))
            {
                //item found based on name, brand and price
                return index;
            }

        }

        //item does not exist
        return -1;
    }

    public void addItemToCart(CartItem item) {

        //either update count by if item already existed in the cart
        int indexOfItemInCart = findIndexOfMatchingOfItem(item);

        if(indexOfItemInCart !=-1)
        {
            myCart.getCartItems().get(indexOfItemInCart).add1Item();
        }
        else
        {
            //insert item if it didn't exist with count 1

            CartItem myItem = new CartItem(item.getName(),item.getBrand(),item.getPrice(),item.getDescription(),item.getItemCategory(),1);

            myCart.addCartItemToShoppingCart(myItem);


        }

    }

    public void removeItemFromCart(int indexInShoppingCart) {

        CartItem myItem = myCart.getCartItems().get(indexInShoppingCart);

        if (myItem != null)
        {
            myItem.remove1Item();

            if(myItem.getItemCount().equals(0))
            {
                //remove from list if the count of an item is 0
                myCart.getCartItems().remove(myItem);
            }
        }

    }

    public boolean placeOrder() {

        double totalCartAmount = myCart.getTotalPriceOfAllItems();

        if(totalCartAmount <= this.balance )
        {
            balance = balance- totalCartAmount;
            return true;

        }
        else
        {
            return false;
        }

    }
}
