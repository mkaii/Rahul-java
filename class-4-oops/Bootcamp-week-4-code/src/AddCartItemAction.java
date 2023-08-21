import java.util.Scanner;

public class AddCartItemAction implements Action {

    @Override
    public String execute(User user, Supermarket supermarket) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Select an Item to add to your Shopping cart");

        //from a user perspective it should be 1 based indexing that's why minus 1 has been used.
        int indexInShoppingCart = Integer.parseInt(sc.nextLine()) - 1;

        user.addItemToCart(supermarket.getShopItemList().get(indexInShoppingCart));

        return "Item added to user's Cart";
    }

    @Override
    public String menuDescription() {

        return "Add item";
    }
}
