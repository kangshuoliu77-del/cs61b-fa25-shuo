import java.util.*;

public class Tmp {
    public static void main(String[] args) {
//        int[] zeroedArray = new int[3];
//        int[] array = {4, 7, 10};
//        array[0] = 5;
//        System.out.println(array[0]);
//        System.out.println(Arrays.toString(array));
//        System.out.println(array.length);

//        int[] array = {1, 2, 4};
//        for (int i : array) {
//            System.out.println(i);
//        }

//        List<String> lst = new ArrayList<>();
//        lst.add("zero");
//        lst.add("one");
//        lst.set(0, "zed");
//        System.out.println(lst.get(0));
//        System.out.println(lst.size());
//
//        if (lst.contains("one")) {
//            System.out.println("one in lst");
//        }
//
//        for (String elem : lst) {
//            System.out.println(elem);
//        }


//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(1);
//        set.add(2);
//        set.remove(2);
//        System.out.println(set.size());
//
//        if (set.contains(1)) {
//            System.out.println("1 in set");
//        }
//
//        for (int elem : set) {
//            System.out.println(elem);
//        }

        Map<String, String> map = new HashMap<>();
        map.put("hello", "hi");
        map.put("hello1", "goodbye");

        System.out.println(map.get("hello"));
        System.out.println(map.size());

        if (map.containsKey("hello")) {
            System.out.println("\"hello\" in map");
        }

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
