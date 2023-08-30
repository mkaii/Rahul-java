/**
 * Represents an action to confirm a user's purchase.
 */
public class ConfirmUserPurchaseAction implements Action {


    /**
     * Executes the action by confirming a user's purchase and updating items' quantities.
     *
     * @param user The user performing the action.
     * @param supermarket The supermarket context.
     * @return A message indicating the confirmation status of the purchase.
     */
    @Override
    public String execute(User user, Supermarket supermarket) throws Exception {

        boolean isPurchaseAllowed = user.placeOrder();
        boolean isCartEmpty = user.getMyCart().getCartItems().isEmpty();

        if (!isPurchaseAllowed)
        {
            //return "Not enough balance!!!";
            throw new Exception("## Error ## : Current balance: "  + user.getBalance() + ", is less than total Cart value: "  + user.getMyCart().getTotalPriceOfAllItems() + "!!!");

        }
        if (isCartEmpty)
        {
            //return "Not enough balance!!!";
            throw new Exception("## Warning ## : Your cart is empty!! Please add items to your cart to CONFIRM order");
        }
       else {

            //remove bought items from the SuperMarket list

            for (int index = 0; index < user.getMyCart().getCartItems().size(); index++) {
                CartItem cartItem = user.getMyCart().getCartItems().get(index);

                user.setRewardPoints(cartItem.getRewardPoints());
                for (CartItem shopItem : supermarket.getShopItemList()) {
                    if (cartItem.getName().equals(shopItem.getName()) && cartItem.getBrand().equals(shopItem.getBrand()) && (cartItem.getPrice() == (shopItem.getPrice()))) {

                        int cartQuantity = cartItem.getItemCount();
                        while(cartQuantity > 0) {
                            shopItem.remove1Item();
                            cartQuantity--;
                        }
                        break;
                    }
                }
            }

            //clear the Cart
            user.getMyCart().clear();

            return "Purchase Confirmed. Thanks for shopping at FIT2099 supermarket!";
        }

    }

    /**
     * Provides a short description of the action suitable for menus or user interfaces.
     *
     * @return A short description of the action.
     */
    @Override
    public String menuDescription() {

        return "Confirm purchase";
    }
}
