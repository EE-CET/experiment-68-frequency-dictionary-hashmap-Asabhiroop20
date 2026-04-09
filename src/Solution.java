import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;     
import java.util.Collections;  

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] words = line.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for (String key : keys) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}