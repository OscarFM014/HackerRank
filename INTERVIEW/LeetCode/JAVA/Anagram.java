import java.util.*;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Hashtable<Character, Integer> hs = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            if (hs.containsKey(s.charAt(i))) {
                hs.put(s.charAt(i), hs.get(s.charAt(i)) + 1);

            } else {
                hs.put(s.charAt(i), 1);

            }

        }

        for (int i = 0; i < t.length(); i++) {
            if (hs.containsKey(t.charAt(i))) {
                if (hs.get(t.charAt(i)) == 0) {
                    return false;
                }
                hs.put(t.charAt(i), hs.get(t.charAt(i)) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ab", "ba"));
    }

}