package game;

import edu.monash.fit2099.engine.actions.Action;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.positions.GameMap;

public class ActivateFocusAction extends Action {

    private BroadSword broadSword;

    public ActivateFocusAction(BroadSword broadSword) {
        this.broadSword = broadSword;
    }

    @Override
    public String execute(Actor actor, GameMap map) {
        broadSword.activateFocus((Player) actor);
        return actor + " activates focus mode for the BroadSword.";
    }

    @Override
    public String menuDescription(Actor actor) {
        return "Activate Focus Mode for BroadSword";
    }
}