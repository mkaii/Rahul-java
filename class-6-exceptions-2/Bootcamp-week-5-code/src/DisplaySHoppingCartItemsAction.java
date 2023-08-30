import console.Display;

/**
 * Represents an action to display items in the user's shopping cart.
 */
public class DisplaySHoppingCartItemsAction implements Action {

    /**
     * Executes the action by displaying items in the user's shopping cart.
     *
     * @param user The user performing the action.
     * @param supermarket The supermarket context.
     * @return A message indicating the result of displaying the cart items.
     */
    @Override
    public String execute(User user, Supermarket supermarket) {

        //println user balance
        Display.println("User balance: " + user.getBalance());
        Display.println("User Reward Points : " + user.getRewards());

        Display.addNewLine();

        //println user's shopping cart
        for (int i = 0; i < user.getMyCart().getCartItems().size(); i++) {
            Display.println("Item (" + (i + 1) + ")");
            CartItem cartItem = user.getMyCart().getCartItems().get(i);
            Display.println(cartItem.toString());
            Display.addNewLine();

        }

        if(user.getMyCart().getCartItems().size() > 0) {
            Display.addNewLine();
            return "The cart items of the user are displayed.";
        }
        else {
            Display.addNewLine();
            return "Your shopping cart is empty.";
        }
    }


    /**
     * Provides a short description of the action suitable for menus or user interfaces.
     *
     * @return A short description of the action.
     */
    @Override
    public String menuDescription() {

        return "View shopping cart";
    }
}
