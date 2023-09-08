package game;

import edu.monash.fit2099.engine.actions.Action;
import edu.monash.fit2099.engine.actions.ActionList;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.actors.attributes.ActorAttributeOperations;
import edu.monash.fit2099.engine.actors.attributes.BaseActorAttribute;
import edu.monash.fit2099.engine.actors.attributes.BaseActorAttributes;
import edu.monash.fit2099.engine.displays.Display;
import edu.monash.fit2099.engine.positions.GameMap;
import edu.monash.fit2099.engine.displays.Menu;

/**
 * Class representing the Player.
 * Created by:
 * Modified by:
 */
public class Player extends Actor {

    private static final int STARTING_STAMINA = 200;
    private static final float STAMINA_RECOVERY_RATE = 0.01f;
    private final BroadSword broadSword;

    public Player(String name, char displayChar, int hitPoints) {
        super(name, displayChar, hitPoints);
        // Add new feature: Stamina
        this.addAttribute(BaseActorAttributes.STAMINA, new BaseActorAttribute(STARTING_STAMINA));

        this.broadSword = new BroadSword();
    }

    @Override
    public Action playTurn(ActionList actions, Action lastAction, GameMap map, Display display) {
        // Print player's hit points and stamina
        display.println(this.name + ": " + this.getDisplayChar() + ": Hit-Points: " +
                String.valueOf(this.getAttribute(BaseActorAttributes.HEALTH)) + " Stamina: " +
                String.valueOf(this.getAttribute(BaseActorAttributes.STAMINA)));


        // Check if the player has the BroadSword in their inventory
        boolean hasBroadSword = this.getItemInventory().contains(broadSword);

        if (this.getItemInventory().contains(broadSword)) {
            ActivateFocusAction activateFocusAction = new ActivateFocusAction(broadSword);
            actions.add(activateFocusAction);
        }

        broadSword.tick(this); // Update the state of the broadsword

        // Handle multi-turn Actions
        if (lastAction.getNextAction() != null)
            return lastAction.getNextAction();

        // Return/print the console menu
        Menu menu = new Menu(actions);
        return menu.showMenu(this, display);
    }

    public int getStamina() {
        return this.getAttribute(BaseActorAttributes.STAMINA);
    }

    public void decreaseStamina(int amount) {
        modifyAttribute(BaseActorAttributes.STAMINA, ActorAttributeOperations.DECREASE, amount);
    }

    public void increaseStamina() {
        int staminaIncrease = Math.round(getStamina() * STAMINA_RECOVERY_RATE);
        modifyAttribute(BaseActorAttributes.STAMINA, ActorAttributeOperations.INCREASE, staminaIncrease);
    }

    public void activateFocus() {
        Action action = new ActivateFocusAction(broadSword);
        action.execute(this, null); // Pass null for the map parameter
    }
}
