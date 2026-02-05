import com.google.j2objc.annotations.LoopTranslation;
import org.checkerframework.common.value.qual.EnsuresMinLenIf;

import java.util.*;

public class TestBefore {
    public static void main(String[] args) {
//        Arrays
        int[] zeroedArray = new int[3];
        int[] array = {4, 7, 10};
        array[0] = 5;
        System.out.println(Arrays.toString(array));

        System.out.println("******************************");

//        Loop
       // int[] array2 = {1, 2, 3};
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("******************************");

//         Lists
        List<String> L = new ArrayList<>();
        L.add("abc");
        L.add("def");
        System.out.println(L.get(0));
        System.out.println(L.size());
        if (L.contains("abc")) {
            System.out.println("abc in L");
        }
        for (String i : L) {
            System.out.println(i);
        }
        /*
         *ArrayList<Integer> int
         *ArrayList<Character> char
         * */
        System.out.println("******************************");

//        Set
        Set<Integer> set =  new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.remove(2);
        System.out.println(set.size());
        if (set.contains(1)) {
            System.out.println("1 in set");
        }
        for (int elem : set) {
            System.out.println(elem);
        }

        /*
        * Java 有两种类型的集合 ：TreeSet 和 HashSet。TreeSet 保持元素按“排序”顺序排列，且速度很快。相比之下，HashSet 没有固定的“顺序”，但通常非常快
        * */
        System.out.println();
        System.out.println("******************************");

//        Maps
        Map<String, Integer> map = new HashMap<>();
        map.put("kang", 10);
        map.put("shuo", 20);
        map.put("liu", 5);
        System.out.println(map.get("kang"));
        System.out.println(map.size());

        if (map.containsKey("kang")) {
            System.out.println("kang in map");
        }

        for (String key : map.keySet()) {
            System.out.print(key);
            System.out.println(map.get(key));
        }

        for (int val : map.values()) {
            System.out.print(val);
        }

        System.out.println("******************************");


//        Classes(Point)
        Point p1 = new Point(5, 9);
        Point p2 = new Point(-3, 3);
        System.out.println("Point 1: ("+p1.x+", "+p1.y+")");
        System.out.println("Distance:" + p1.distanceTo(p2));
        p1.translate(2, 2);
        System.out.println("Point 1: ("+p1.x+", "+p1.y+")");
    }
}
