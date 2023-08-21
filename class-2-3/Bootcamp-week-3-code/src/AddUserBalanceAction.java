import java.util.Scanner;

public class AddUserBalanceAction implements Action {
    @Override
    public String execute(User user, Supermarket supermarket) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter a number to add to your current balance : ");
        double amountToBeAdded = Double.parseDouble(sc.nextLine());

        user.addBalance(amountToBeAdded);

        return amountToBeAdded + " was added in the original balance";
    }

    @Override
    public String menuDescription() {

        return "Add balance";
    }
}
