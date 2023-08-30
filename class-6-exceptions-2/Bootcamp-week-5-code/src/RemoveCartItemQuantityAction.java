import console.Display;
import console.Input;

;


/**
 * Represents an action to remove a quantity of an item from the user's shopping cart.
 */
public class RemoveCartItemQuantityAction implements Action {

    /**
     * Executes the action by allowing the user to remove a quantity of an item from their cart.
     *
     * @param user The user performing the action.
     * @param supermarket The supermarket context.
     * @return A message indicating the removal of the cart item.
     */
    @Override
    public String execute(User user, Supermarket supermarket) {



        Display.println("Select an Item to remove a quantity from :");

        //from a user perspective it should be 1 based indexing of shopping cart that's why minus 1 has been used.
        int indexInShoppingCart = Integer.parseInt(Input.read()) - 1;

        user.removeItemFromCart(indexInShoppingCart);

        return "Cart item removed.";
    }


    /**
     * Provides a short description of the action suitable for menus or user interfaces.
     *
     * @return A short description of the action.
     */
    @Override
    public String menuDescription() {

        return "Remove item quantity by 1";
    }
}
