import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().trim();
        String[] words = line.split("\\s+");

        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}