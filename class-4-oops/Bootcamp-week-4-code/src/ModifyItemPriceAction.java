import pricestrategy.IncreasedPriceStrategy;
import pricestrategy.ReducedPriceStrategy;
import pricestrategy.RegularPriceStrategy;

import java.util.Scanner;

public class ModifyItemPriceAction implements Action{
    @Override
    public String execute(User user, Supermarket supermarket) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter item index for modifying price : ");
        int index = Integer.parseInt(sc.nextLine())-1;

        System.out.println("Enter percentage for modifying price : ");
        double percentage = Double.parseDouble(sc.nextLine());

        System.out.println("Enter pricing strategy for modifying price : ");
        System.out.println("Press 1 for increased pricing : ");
        System.out.println("Press 2 for reduced pricing : ");
        System.out.println("Press 3 for regular pricing : ");

        int choice = Integer.parseInt(sc.nextLine());

        switch(choice)
        {
            case 1->
            {
                supermarket.applyPricingStrategy(new IncreasedPriceStrategy(),index,percentage);
            }
            case 2->
            {
                supermarket.applyPricingStrategy(new ReducedPriceStrategy(),index,percentage);
            }
            case 3->
            {
                supermarket.applyPricingStrategy(new RegularPriceStrategy(),index,percentage);
            }
        }

        return "Price modified based on Strategy given.";


    }

    @Override
    public String menuDescription() {
        return "Modify price, based on pricing strategy";
    }
}
