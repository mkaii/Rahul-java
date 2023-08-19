public class Child extends Parent{

    private int y;

    public String getName()
    {
        return "Rahul";
    }

    @Override
    public int getEX()
    {
        System.out.println("Inside child class");
        return y;
    }
}
