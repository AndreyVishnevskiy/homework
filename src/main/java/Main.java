import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Первый");
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");

        Set<String> set = new HashSet<>();
        set.add("Воторй");
        set.add("Воторй");

        Set<String> set2 = new TreeSet<>();
        set2.add("b");
        set2.add("a");
        set2.add("c");
        Set<String> set3 = new LinkedHashSet<>();
        set3.add("x");
        set3.add("t");
        set3.add("y");

        System.out.println(list);
        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Колбоса");
        hashMap.put(2, "Сосиска");
        hashMap.put(3, "Морковка");

        System.out.println(hashMap);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.keySet() + " " + hashMap.values());

        List <String> test = list.stream()
                .filter(element -> element.contains("т"))
                .collect(Collectors.toList());
        System.out.println("stream: " + test);
    }
}