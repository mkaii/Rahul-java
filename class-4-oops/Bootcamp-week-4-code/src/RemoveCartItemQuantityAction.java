import java.util.Scanner;

public class RemoveCartItemQuantityAction implements Action {
    @Override
    public String execute(User user, Supermarket supermarket) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Select an Item to remove a quantity from :");

        //from a user perspective it should be 1 based indexing of shopping cart that's why minus 1 has been used.
        int indexInShoppingCart = Integer.parseInt(sc.nextLine()) - 1;

        user.removeItemFromCart(indexInShoppingCart);

        return "Cart item removed.";
    }

    @Override
    public String menuDescription() {

        return "Remove item quantity by 1";
    }
}
