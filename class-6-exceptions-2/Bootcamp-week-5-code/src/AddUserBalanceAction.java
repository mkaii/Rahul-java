import console.Display;
import console.Input;


/**
 * Represents an action to add balance to the user's account.
 */
public class AddUserBalanceAction implements Action {

    /**
     * Executes the action by allowing the user to add balance to their account.
     *
     * @param user The user performing the action.
     * @param supermarket The supermarket context.
     * @return A message indicating the balance added to the account.
     */
    @Override
    public String execute(User user, Supermarket supermarket) {



        Display.println("Enter a number to add to your current balance : ");
        double amountToBeAdded = Double.parseDouble(Input.read());

        user.addBalance(amountToBeAdded);

        return amountToBeAdded + " was added in the original balance";
    }


    /**
     * Provides a short description of the action suitable for menus or user interfaces.
     *
     * @return A short description of the action.
     */
    @Override
    public String menuDescription() {

        return "Add balance";
    }
}
