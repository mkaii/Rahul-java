package game;

import edu.monash.fit2099.engine.actions.ActionList;
import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.items.DropAction;
import edu.monash.fit2099.engine.positions.Location;
import edu.monash.fit2099.engine.weapons.WeaponItem;
import game.Player;

public class BroadSword extends WeaponItem {



    private boolean isFocusActive;
    private int focusTurnsRemaining;

    private static final int ORIGINAL_DAMAGE = 110;
    private static final int ORIGINAL_HIT_RATE = 80;
    private static final char DISPLAY = '1';

    public BroadSword() {
        super("BroadSword", DISPLAY, ORIGINAL_DAMAGE, "slashes", ORIGINAL_HIT_RATE);
        isFocusActive = false;
        focusTurnsRemaining = 0;

    }

    public boolean isFocusActive() {
        return isFocusActive;
    }

    public int getFocusTurnsRemaining() {
        return focusTurnsRemaining;
    }

    public String activateFocus(Player myPlayer) {
        if (!isFocusActive) {
            isFocusActive = true;
            updateHitRate(90); // Set hit rate to 90%
        }

        focusTurnsRemaining = 5;
        increaseDamageMultiplier(0.1f); // Increase damage multiplier by 10% each time
        myPlayer.decreaseStamina(Math.round(myPlayer.getStamina() * 0.2f)); // Reduce stamina by 20%
        return myPlayer  + " takes a deep breath and focuses all their might!";
    }

    protected void deactivateFocus() {
        if (isFocusActive) {
            isFocusActive = false;
            focusTurnsRemaining = 0;
            updateDamageMultiplier(1.0f); // Reset damage multiplier to 1.0f
            updateHitRate(ORIGINAL_HIT_RATE); // Reset hit rate to 80%
        }
    }


    @Override
    public ActionList allowableActions(Actor player) {
        ActionList actions = super.allowableActions(player);
        actions.add(new ActivateFocusAction());
        return actions;
    }

    @Override
    public void tick(Location currentLocation, Actor actor) {
        if (isFocusActive) {
            focusTurnsRemaining--;
            if (focusTurnsRemaining <0) {
                deactivateFocus(); // Deactivate focus when turns run out

            }
        }
        //reduce stamina is not required as it should only be reduced during activating focus
    }

    @Override
    public DropAction getDropAction(Actor actor) {
        if(portable)
            return new BroadSwordDropAction(this);
        return null;
    }
}