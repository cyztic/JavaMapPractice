import java.util.*;
import java.util.stream.Collectors;

public class Driver {

    public static void main(String[] args) {
        //MAP PRACTICE WITH STREAMS
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(10, "Josh");
        map.put(100, "Bob");
        map.put(0, "Kari");
        map.put(89, "Robert");
        map.put(20000, "Zane");
        map.put(2071, "Rick");
        map.put(1, "Trevor");

        System.out.println("Sorted by key: ");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Sorted by value: ");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Print only greater than 15: ");
        map.entrySet().stream()
                .filter((x -> x.getKey() > 15))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Create new map of only even numbers");
        //map to map
        Map<Integer, String> y =
                map.entrySet().stream()
                        .filter((x -> x.getKey() % 2 == 0))
                        .collect(Collectors.toMap(
                                e -> (e.getKey()),
                                e -> (e.getValue())
                        ));

        y.entrySet().stream()
                .forEach(System.out::println);
    }
}