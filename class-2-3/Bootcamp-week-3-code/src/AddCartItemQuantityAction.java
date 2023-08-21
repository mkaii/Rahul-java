import java.util.Scanner;

public class AddCartItemQuantityAction implements Action {
    @Override
    public String execute(User user, Supermarket supermarket) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Select an Item to add a quantity to");

        //from a user perspective it should be 1 based indexing of shopping list that's why minus 1 has been used.
        int indexInShoppingItemList = Integer.parseInt(sc.nextLine()) - 1;

        user.addItemToCart(supermarket.getShopItemList().get(indexInShoppingItemList));

        return "Item added to user's Cart";
    }

    @Override
    public String menuDescription() {

        return "Add item quantity by 1";
    }
}
