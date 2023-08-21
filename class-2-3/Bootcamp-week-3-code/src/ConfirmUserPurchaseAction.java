public class ConfirmUserPurchaseAction implements Action {
    @Override
    public String execute(User user, Supermarket supermarket) {

        boolean isPurchaseAllowed = user.placeOrder();

        if(isPurchaseAllowed) {

            //remove bought items from the SuperMarket list

            for (int index = 0; index < user.getMyCart().getCartItems().size(); index++) {
                CartItem cartItem = user.getMyCart().getCartItems().get(index);

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

            return "Order confirmed.";
        }
        else
        {
            return "Not enough balance!!!";
        }
    }

    @Override
    public String menuDescription() {

        return "Confirm purchase";
    }
}
