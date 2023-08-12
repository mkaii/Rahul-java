import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing arraylist.....");

        List<String> myList = new ArrayList<>();
        //List<String> myList = new LinkedList<>();

        //using the size() method to get the number of elements in the Arraylist
        System.out.println("Size of the list is :"+ myList.size());

        myList.add("Rahul");
        myList.add("Rahul");
        myList.add("Shivam");
        myList.add("Disha");
        myList.add("Kamya");

        for(String name: myList)
        {
            System.out.println(name);
        }

        //System.out.println(myList.get(1));
        System.out.println("Size of the list is :"+ myList.size());

        System.out.println("----------------------------------------");

        myList.remove(2);

        for(String name: myList)
        {
            System.out.println(name);
        }

        System.out.println("Size of the list is :"+ myList.size());


        System.out.println("------SORT------");

        Collections.sort(myList);//arrange in ascending order

        for(String name: myList)
        {
            System.out.println(name);
        }

        System.out.println("------Reverse SORT------");

        //myList.sort(Collections.reverseOrder());

        Collections.sort(myList, Collections.reverseOrder());//arrange in descending oder

        for(String name: myList)
        {
            System.out.println(name);
        }

        System.out.println("-------SET-----------");


        Set<String> mySet = new HashSet<>();


        //using the size() method to get the number of elements in the Arraylist
        System.out.println("Size of the set is :"+ mySet.size());

        mySet.add("Rahul");
        mySet.add("Rahul");
        mySet.add("Shivam");
        mySet.add("Disha");
        mySet.add("Kamya");

        System.out.println("Size of the set is :"+ myList.size());

        for(String name : mySet)
        {
            System.out.println(name);
        }

        System.out.println("Set contains the string :"+ mySet.contains("Rahul"));


    }
}
