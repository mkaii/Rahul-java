// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Application {
    public static void main(String[] args) {

        // creating a Supermarket object
        Supermarket supermarket = new Supermarket();

        // Calling the printStatus method
        supermarket.printStatus();
        supermarket.createItems();
        supermarket.displayItems();
        supermarket.sayGoodbye();
    }

}