// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void myMethod(int x)
    {
        System.out.println("method number " + x);
    }

    public static void myMethod(String x)
    {
        System.out.println("method string " + x);
    }
    public static void main(String[] args) {

       /*Parent myObj = new Parent();
        System.out.println(myObj.getEX());

        Child c1 = new Child();
        System.out.println(c1.getName());
        System.out.println(c1.getEX());
*/
        Child c2 = new Child();
        System.out.println(c2.getEX());

        System.out.println("-------------------");
        Parent p2 = new Parent();
        System.out.println(p2.getEX());

        System.out.println("-------------------");
        Parent p3 = new Child();
        System.out.println(p3.getEX());

        myMethod("abc");

        System.out.println("-------------------");

        Square sq1 = new Square();
        sq1.getArea();

        System.out.println("-------------------");

        Rectangle r1 = new Rectangle();
        r1.getArea();

        System.out.println("-------------------");

        Shape r2 = new Rectangle();
        r2.getArea();

        System.out.println("-------------------");

        IShape t1 = new Triangle();
        t1.getArea();


    }
}