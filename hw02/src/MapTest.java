import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> L = new TreeMap<>();
        L.put("liu", 18);
        L.put("shuo", 20);
        L.put("kang", 30);
        int num = L.get("liu");
        System.out.println(num);
    }
}
