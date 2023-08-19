import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------Map-------------");

        Map<String,Integer> studentGradesMap = new HashMap<>();

        System.out.println("SIZE OF MAP :" + studentGradesMap.size());

        //add elements top a Map:

        studentGradesMap.put("Rahul",90);
        studentGradesMap.put("Disha",20);
        studentGradesMap.put("Shivam",30);
        studentGradesMap.put("Kamya",40);
        studentGradesMap.put("Mainak",60);

        System.out.println("SIZE OF MAP :" + studentGradesMap.size());

        System.out.println(studentGradesMap.get("Kamya"));

        System.out.println("Disha present: " + studentGradesMap.containsKey("Disha"));

        System.out.println("------key Set-------");
        for(String student : studentGradesMap.keySet())
        {
            System.out.println("key : " + student + " , value : " + studentGradesMap.get(student));
        }

        System.out.println("------values-------");
        for(Integer marks : studentGradesMap.values())
        {
            System.out.println(marks);
        }

        System.out.println("------entrySet-------");
        for(Map.Entry<String,Integer> entry: studentGradesMap.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        studentGradesMap.remove("Disha");
        System.out.println("Disha present: " + studentGradesMap.containsKey("Disha"));

        studentGradesMap.clear();

        System.out.println("SIZE OF MAP :" + studentGradesMap.size());

        System.out.println(studentGradesMap);

        System.out.println("Map is empty : " + studentGradesMap.isEmpty());

    }
}
