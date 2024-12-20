
import java.util.*;

public class day_28 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kunal",89);
        map.put("Karan",99);
        map.put("Rahul",94);

        System.out.println(map.get("Karan"));
        System.out.println(map.getOrDefault("Apoorv",78));
        System.out.println(map.containsKey("Karan"));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(60);
        set.add(65);
        set.add(85);
        set.add(5);

        System.out.println(set);
    }
}
