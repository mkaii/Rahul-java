package game;

import edu.monash.fit2099.engine.actors.Actor;
import edu.monash.fit2099.engine.items.DropAction;
import edu.monash.fit2099.engine.items.Item;
import edu.monash.fit2099.engine.positions.GameMap;

import java.util.Random;

public class HealingVileDropAction extends DropAction {
    /**
     * Constructor.
     *
     * @param item the item to drop
     */
    public HealingVileDropAction(Item item) {
        super(item);
    }

    /**
     * When an item is dropped, remove the item from the actor's inventory and add it to the current location of the actor.
     *
     * @param actor The actor performing the action.
     * @param map The map the actor is on.
     * @return a string describing who has dropped which item.
     */
    @Override
    public String execute(Actor actor, GameMap map) {

        Random random = new Random();
        if (random.nextFloat() <= 0.20) {
            //drop a key with 20% accuracy
            return super.execute(actor,map);
        }

        return null;
    }
}
