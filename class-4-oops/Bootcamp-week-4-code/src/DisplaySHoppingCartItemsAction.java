public class DisplaySHoppingCartItemsAction implements Action {
    @Override
    public String execute(User user, Supermarket supermarket) {

        //print user balance
        System.out.println("User balance: " + user.getBalance());

        //print user's shopping cart
        for (int i = 0; i < user.getMyCart().getCartItems().size(); i++) {
            System.out.println("Item (" + (i + 1) + ")");
            CartItem cartItem = user.getMyCart().getCartItems().get(i);
            System.out.println(cartItem.toString());
        }

        if(user.getMyCart().getCartItems().size() > 0) {
            System.out.println();
            return "The cart items of the user are displayed.";
        }
        else {
            System.out.println();
            return "No items in the cart.";
        }
    }

    @Override
    public String menuDescription() {

        return "View shopping cart";
    }
}
