import java.util.List;

public class DisplaySHoppingListItemsAction implements Action {
    @Override
    public String execute(User user, Supermarket supermarket) {

        List<CartItem> shoppingListItems =  supermarket.getShopItemList();

        for (int i = 0; i < shoppingListItems.size(); i++) {
            System.out.println("Item (" + (i + 1) + ")");
            System.out.println(shoppingListItems.get(i).toString() + "\n");
        }

        return "The shop items of the user are displayed.";
    }

    @Override
    public String menuDescription() {

        return "View Items";
    }
}
