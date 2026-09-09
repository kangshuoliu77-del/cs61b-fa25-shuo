import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Implement this method
        Map<Character, Integer> map1 = new TreeMap<>();
        for (int i = 1; i <= 26; i++) {
            map1.put((char) (i + 96), i);
        }
        return map1;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Implement this method
        Map<Integer,Integer> map2 = new TreeMap<>();
        for (int i = 0; i < nums.size(); i++) {
            map2.put(nums.get(i), (int) Math.pow(nums.get(i), 2));
        }
        return map2;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Implement this method
        Map<String, Integer> map3 = new TreeMap<>();
        for (int i = 0; i < words.size(); i++) {
            map3.put(words.get(i), 0);
        }
        for (String key : map3.keySet()) {
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
                if (key.equals(words.get(i))) {
                    count++;
                }
                map3.put(key, count);
            }
        }
        return map3;
    }
}
