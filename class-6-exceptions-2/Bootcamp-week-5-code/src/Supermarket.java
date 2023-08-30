import console.Display;
import pricestrategy.IncreasedPriceStrategy;
import pricestrategy.ReducedPriceStrategy;

import java.util.ArrayList;
import java.util.List;
;

public class Supermarket {



    // ArrayList of the items available in shop
    private final List<CartItem> shopItemList;
    User mySingleUser;


    public Supermarket() {
        //now initializing the items with the array size of 6
        shopItemList = new ArrayList<>();
        mySingleUser = new User();

    }

    public List<CartItem> getShopItemList() {
        return shopItemList;
    }

    static List<Action> allowAbleActions()
    {
        List<Action> allowedActions = new ArrayList<>();
        allowedActions.add(new DisplaySHoppingListItemsAction());
        //allowedActions.add(new ModifyItemPriceAction());
        return allowedActions;
    }


    public void printStatus() {
        Display.println("Welcome to FIT2099 Supermarket");
        createItems();
        consoleMenu();
        Display.println("---END---");
        Display.println("###################################");
        Display.println("Thank you for visiting FIT2099 Supermarket!");
    }
    public void createItems() {
        // Creating the items and adding them to the array
        shopItemList.add(new EggPack("Free Range Eggs 12 pack", "Egg-ceptional Eggs", 5.20, "Start your day with Egg-ceptional Eggs, laid by free-range hens and guaranteed to be egg-cellent.", 12, "2023-12-06",10,new IncreasedPriceStrategy()));
        shopItemList.add(new EggPack("Free Range Eggs 12 pack", "Egg-straordinary Eggs", 4.80, "The perfect choice for discerning egg lovers who appreciate the egg-ceptional taste, ethical sourcing, and the joy of cooking with eggs that are simply egg-straordinary", 12, "2023-09-09",10,new IncreasedPriceStrategy()));
        shopItemList.add(new Fruit("Navel Orange", "Honeybells", 0.80, "With every bite, you'll experience a zesty explosion of flavour that will make you say, \"Orange you glad I picked this one?\"", "Ripe",15,new ReducedPriceStrategy()));
        shopItemList.add(new Fruit("Fresh Banana", "Chiquita", 0.72, "Savour the naturally sweet flavour that will make you say, \"Isn't this banana a-peel-ing?\"", "Underripe",20,new IncreasedPriceStrategy()));
        shopItemList.add(new Beverage("Espresso Iced Coffee", "Brew-tiful Beans", 4.50, "Get ready to embark on a brew-tiful journey of flavour and boldness that will leave you craving for more. It's time to let your taste buds espresso themselves!", "0.75", false,12,new IncreasedPriceStrategy()));
        shopItemList.add(new Beverage("Sparkling Wine", "Wine not", 20.00, "Life is too short to settle for anything less than a sparkling adventure!", "0.3", true,18,new IncreasedPriceStrategy()));
    }

    public void consoleMenu() {

        List<Action> allowedActionsForConsole = new ArrayList<>();
        allowedActionsForConsole.addAll(User.allowAbleActions());
        allowedActionsForConsole.addAll(CartItem.allowAbleActions());

        allowedActionsForConsole.addAll(ShoppingCart.allowAbleActions());
        allowedActionsForConsole.addAll(Supermarket.allowAbleActions());

        Menu myMenu = new Menu();
        Action userAction;

        do{
            userAction  = myMenu.showMenu(allowedActionsForConsole);
            if(userAction!=null) {

                String userActionDesc = null;
                try {
                    userActionDesc = userAction.execute(mySingleUser, this);
                    Display.println(userActionDesc);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }

        }while (userAction != null);
    }



}
