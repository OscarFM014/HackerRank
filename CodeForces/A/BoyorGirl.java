
// Problem: 
// https://codeforces.com/contest/236/problem/A
import java.util.*;

public class BoyorGirl {

    public static String isBoyGirl(String words) {
        HashSet<Character> dic = new HashSet<Character>();

        for (int letter = 0; letter < words.length(); letter++) {
            if (!dic.contains(words.charAt(letter))) {
                dic.add(words.charAt(letter));
            }
        }

        if (dic.size() % 2 == 0) {
            return "CHAT WITH HER!";
        }
        return "IGNORE HIM!";
    }

    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);
        String avatars = res.nextLine();

        System.out.println(isBoyGirl(avatars));
        res.close();

    }
}
// Oscar