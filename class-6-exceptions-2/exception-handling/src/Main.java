import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void helper()
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = 10 / y;
        System.out.println(x);


    }
    public static void main(String[] args) {

        System.out.println("Rahul started Exceptions!!!");



        //int []arr = new int[5];
        //System.out.println(arr[10]);

        //throw new ClassNotFoundException("Rahul just got an exception");


        try {
            helper();
        }
        catch (RuntimeException ex)
        {
            System.out.println("Rahul caught an exception which happened in some other method");
        }
        finally
        {
            System.out.println("Learning try catch");
        }

        System.out.println("Rahul is studying Exceptions!!!");
    }
}