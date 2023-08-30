import console.Display;
import console.Input;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
;

public class Menu {


    Map<Character, Action> actionMap ;

    public Menu() {



        //a-> action-1
        //b-> action-2
        //c-> action-3
        //d-> action-4
        //e-> action-5
        //f-> action-6
        //g-> action-7
        //h->new feature -increase price of an item

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

        Display.println("###################################");

        for(Character hotKey : actionMap.keySet())
        {
            Display.println(hotKey + ": " + actionMap.get(hotKey).menuDescription());
        }
        String userChoice = Input.read();

        return actionMap.get(userChoice.charAt(0));
    }
}
