import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static void main(String[] args)
    {
        //MAP PRACTICE WITH STREAMS
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(10, "Josh");
        map.put(100, "Bob");
        map.put(0, "Kari");
        map.put(89, "Robert");
        map.put(20000, "Zane");

        System.out.println("Sorted by key: ");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Sorted by value: ");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }

}
