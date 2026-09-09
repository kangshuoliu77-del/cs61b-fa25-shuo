import java.util.ArrayList;
import java.util.List;

public class ListExercises {
    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Implement this method
        int num = 0;
        for (int i = 0; i < L.size(); i++) {
            num += L.get(i);
        }
        return num;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Implement this method
        List<Integer> L_even = new ArrayList<>();
        for (int i = 0; i < L.size(); i++) {
            if (L.get(i) % 2 == 0) {
               L_even.add(L.get(i));
            }
        }
        return L_even;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Implement this method
        List<Integer> L_common = new ArrayList<>();
        for (int i = 0; i < L1.size(); i++) {
            for (int j = 0; j < L2.size(); j++) {
                if (L1.get(i) == L2.get(j)) {
                    L_common.add(L1.get(i));
                }
            }
        }
        return L_common;
    }

    public static int countOccurrencesOfWord(List<String> words, String w) {
        // TODO: Implement this method
        return 0;
    }

    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Implement this method
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (words.get(i).charAt(j) == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
