import console.Display;

import java.util.List;

/**
 * Represents an action to display items available in the supermarket's shopping list.
 */
public class DisplaySHoppingListItemsAction implements Action {

    /**
     * Executes the action by displaying items available in the supermarket's shopping list.
     *
     * @param user The user performing the action.
     * @param supermarket The supermarket context.
     * @return A message indicating the result of displaying the shop items.
     */
    @Override
    public String execute(User user, Supermarket supermarket) {

        List<CartItem> shoppingListItems =  supermarket.getShopItemList();

        for (int i = 0; i < shoppingListItems.size(); i++) {
            Display.println("Item (" + (i + 1) + ")");
            Display.println(shoppingListItems.get(i).toString() + "\n");
        }

        return "The shop items of the user are displayed.";
    }


    /**
     * Provides a short description of the action suitable for menus or user interfaces.
     *
     * @return A short description of the action.
     */
    @Override
    public String menuDescription() {

        return "View Items";
    }
}
