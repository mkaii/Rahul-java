import console.Display;

import java.util.Random;

public class Utility {

    public static Integer generateRandomId(Category category)
    {
        int min = 0;
        int max=  0;

        switch (category){
            case BEVERAGE -> {
                min = 11111;
                max = 99999;
                break;
            }
            case EGG -> {
                min = 111111;
                max = 999999;
                break;
            }
            case FRUIT -> {
                min = 11111111;
                max = 99999999;
                break;
            }
            default ->
            {
                //note : if someone added a new category type in my enum then it should be added in the switch case
                Display.println("category didn't match with any type");
            }

        }

        Random random = new Random();

        return min + random.nextInt(max- min +1);


    }
}
