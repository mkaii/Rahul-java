import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    Scanner scanner;
    Map<String,Action > actionMap = new HashMap<>();

    public Menu() {

        scanner  = new Scanner(System.in);
        //a-> action-1
        //b-> action-2
        //c-> action-3
        //d-> action-4
        //e-> action-5
        //f-> action-6
        //g-> action-7

    }

    public Action showMenu(List<Action> allowedActions)
    {
        String userChoice = scanner.nextLine();
        return actionMap.get(userChoice);
    }
}
