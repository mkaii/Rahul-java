import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    Scanner scanner;
    Map<Character,Action > actionMap ;

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

    void buildMappingForActions(List<Action> allowedActions)
    {

        int charNumber = 96; //ascii code of char just before 'a'
        actionMap = new HashMap<Character,Action>();
        for(Action action : allowedActions)
        {
            actionMap.put((char) ((char)charNumber+1),action);
            charNumber++;
        }

    }

    //Do we really need the Allowed
    public Action showMenu(List<Action> allowedActions)
    {
        if(actionMap == null)
        {
            buildMappingForActions(allowedActions);
        }

        System.out.println("###################################");

        for(Character hotKey : actionMap.keySet())
        {
            System.out.println(hotKey + ": " + actionMap.get(hotKey).menuDescription());
        }
        String userChoice = scanner.nextLine();

        return actionMap.get(userChoice.charAt(0));
    }
}
