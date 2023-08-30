/**
 * The {@code Action} interface represents a pricing strategy that can be executed
 * in a supermarket system. Classes implementing this interface define specific actions
 * that can be applied to adjust prices for users based on certain conditions.
 *
 * This interface provides two methods for each pricing strategy:
 *
 *   {@link #execute(User, Supermarket)}: Executes the pricing strategy for a given user
 *       within the context of a supermarket and returns a result message.
 *   {@link #menuDescription()}: Provides a short description of the pricing strategy
 *       suitable for displaying in a menu or user interface.
 * @see User
 * @see Supermarket
 */
public interface Action {

    /**
     * Executes the pricing strategy for a specified user within the context of a supermarket.
     * The implementation of this method should adjust prices or perform actions based on
     * the user and supermarket information, and return a message describing the action taken.
     *
     * @param user The user for whom the pricing strategy is executed.
     * @param supermarket The supermarket in which the pricing strategy is applied.
     * @return A message describing the result of the pricing strategy execution.
     */
    String execute(User user, Supermarket supermarket) throws Exception;

    /**
     * Provides a short description of the pricing strategy suitable for displaying in menus
     * or user interfaces. This description should briefly convey the purpose or effect of
     * the pricing strategy to users.
     *
     * @return A short description of the pricing strategy.
     */
    String menuDescription();

}
