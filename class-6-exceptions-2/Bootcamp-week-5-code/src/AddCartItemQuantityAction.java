import console.Display;
import console.Input;

;


/**
 * Represents an action to add a quantity of an item to the user's shopping cart.
 */
public class AddCartItemQuantityAction implements Action {

    /**
     * Executes the action by prompting the user to select an item to add a quantity to.
     *
     * @param user The user performing the action.
     * @param supermarket The supermarket context.
     * @return A message indicating the item was added to the cart.
     */
    @Override
    public String execute(User user, Supermarket supermarket) {


        Display.println("Select an Item to add a quantity to");

        //from a user perspective it should be 1 based indexing of shopping list that's why minus 1 has been used.
        int indexInShoppingItemList = Integer.parseInt(Input.read()) - 1;

        user.addItemToCart(supermarket.getShopItemList().get(indexInShoppingItemList));

        return "Item added to user's Cart";
    }


    /**
     * Provides a short description of the action suitable for menus or user interfaces.
     *
     * @return A short description of the action.
     */

    @Override
    public String menuDescription() {

        return "Add item quantity by 1";
    }
}
