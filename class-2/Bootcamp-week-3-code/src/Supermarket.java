import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Supermarket {

    // ArrayList of the items available in shop
    private final List<CartItem> shopItemList;
    User mySingleUser;
    Scanner scanner;

    public Supermarket() {
        //now initializing the items with the array size of 6
        shopItemList = new ArrayList<>();
        mySingleUser = new User();
        scanner = new Scanner(System.in);
    }



    public void printStatus() {
        System.out.println("Welcome to FIT2099 Supermarket");
        createItems();
        consoleMenu();
        System.out.println("Thank you for visiting FIT2099 Supermarket!");
    }
    public void createItems() {
        // Creating the items and adding them to the array
        shopItemList.add(new EggPack("Free Range Eggs 12 pack", "Egg-ceptional Eggs", 5.20, "Start your day with Egg-ceptional Eggs, laid by free-range hens and guaranteed to be egg-cellent.", 12, "2023-12-06",10));
        shopItemList.add(new EggPack("Free Range Eggs 12 pack", "Egg-straordinary Eggs", 4.80, "The perfect choice for discerning egg lovers who appreciate the egg-ceptional taste, ethical sourcing, and the joy of cooking with eggs that are simply egg-straordinary", 12, "2023-09-09",10));
        shopItemList.add(new Fruit("Navel Orange", "Honeybells", 0.80, "With every bite, you'll experience a zesty explosion of flavour that will make you say, \"Orange you glad I picked this one?\"", "Ripe",15));
        shopItemList.add(new Fruit("Fresh Banana", "Chiquita", 0.72, "Savour the naturally sweet flavour that will make you say, \"Isn't this banana a-peel-ing?\"", "Underripe",20));
        shopItemList.add(new Beverage("Espresso Iced Coffee", "Brew-tiful Beans", 4.50, "Get ready to embark on a brew-tiful journey of flavour and boldness that will leave you craving for more. It's time to let your taste buds espresso themselves!", "750mL", false,12));
        shopItemList.add(new Beverage("Sparkling Wine", "Wine not", 20.00, "Life is too short to settle for anything less than a sparkling adventure!", "300mL", true,18));
    }

    public void consoleMenu() {
        int selection;

        do {
            System.out.println("1) Add balance");
            System.out.println("2) Add item");
            System.out.println("3) Add item quantity by 1");
            System.out.println("4) Remove item quantity by 1");
            System.out.println("5) View items");
            System.out.println("6) View shopping cart");
            System.out.println("7) Confirm purchase");
            System.out.println("8) Exit");
            selection = Integer.parseInt(scanner.nextLine());
            switch (selection) {
                case 1 -> addBalance();
                case 2 -> addItem();
                case 3 -> addItemQuantity();
                case 4 -> removeItemQuantity();
                case 5 -> displayItems();
                case 6 -> displayShoppingCart();
                case 7 -> confirmPurchase();
            }
        } while (selection != 8);
    }



    private void addBalance() {

        System.out.println("Enter a number to add to your current balance : ");
        double amountToBeAdded = Double.parseDouble(scanner.nextLine());

        mySingleUser.addBalance(amountToBeAdded);


    }

    private void addItem() {

        System.out.println("Select an Item to add to your Shopping cart");

        //from a user perspective it should be 1 based indexing that's why minus 1 has been used.
        int indexInShoppingCart = Integer.parseInt(scanner.nextLine()) - 1;

        mySingleUser.addItemToCart(shopItemList.get(indexInShoppingCart));

    }

    private void addItemQuantity() {

        System.out.println("Select an Item to add a quantity to");

        //from a user perspective it should be 1 based indexing of shopping list that's why minus 1 has been used.
        int indexInShoppingItemList = Integer.parseInt(scanner.nextLine()) - 1;

        mySingleUser.addItemToCart(shopItemList.get(indexInShoppingItemList));
    }

    private void removeItemQuantity() {

        System.out.println("Remove an Item to remove a quantity from :");

        //from a user perspective it should be 1 based indexing of shopping cart that's why minus 1 has been used.
        int indexInShoppingCart = Integer.parseInt(scanner.nextLine()) - 1;

        mySingleUser.removeItemFromCart(indexInShoppingCart);

    }

    // Now displaying the items in the super-market in the ArrayList based on 1 based indexing....
    public void displayItems() {
        for (int i = 0; i < shopItemList.size(); i++) {
            System.out.println("Item (" + (i + 1) + ")");
            System.out.println(shopItemList.get(i).toString() + "\n");
        }
    }

    private void displayShoppingCart() {

        //print user balance
        System.out.println("User balance: " + mySingleUser.getBalance());

        //print user's shopping cart
        for (int i = 0; i < mySingleUser.getMyCart().getCartItems().size(); i++) {
            System.out.println("Item (" + (i + 1) + ")");
            CartItem cartItem = mySingleUser.getMyCart().getCartItems().get(i);
            System.out.println(cartItem.toString());
        }
    }


    private void confirmPurchase() {

        boolean isPurchaseAllowed = mySingleUser.placeOrder();

        if(isPurchaseAllowed) {
            //remove bought items from the SuperMarket list

            for (int index = 0; index < mySingleUser.getMyCart().getCartItems().size(); index++) {
                CartItem cartItem = mySingleUser.getMyCart().getCartItems().get(index);

                for (CartItem shopItem : shopItemList) {
                    if (cartItem.getName().equals(shopItem.getName()) && cartItem.getBrand().equals(shopItem.getBrand()) && (cartItem.getPrice() == (shopItem.getPrice()))) {
                        shopItem.remove1Item();
                        break;
                    }
                }
            }

            //clear the Cart
            mySingleUser.getMyCart().clear();
        }
        else
        {
            System.out.println("Not enough balance!!!");
        }
    }




}
