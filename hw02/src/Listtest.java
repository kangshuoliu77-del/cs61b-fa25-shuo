import java.util.ArrayList;
import java.util.List;

public class Listtest {
    public static void main(String[] args) {
        List<String> L = new ArrayList<>();
        L.add("a");
        L.add("b");
        L.add("c");

        System.out.println(L.get(1));
    }
}
