
//Problem:
//https://codeforces.com/contest/59/problem/A
import java.util.*;

public class Word {

    public static String changeWord(String word) {
        int lowercase = 0;
        int uppercase = 0;

        for (int letter = 0; letter < word.length(); letter++) {
            int ascii = word.charAt(letter);
            if (ascii >= 97) {
                lowercase++;
            } else {
                uppercase++;
            }
        }

        if (lowercase >= uppercase) {
            return word.toLowerCase();
        }

        return word.toUpperCase();
    }

    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);
        String word = res.nextLine();

        System.out.println(changeWord(word));
        res.close();

    }
}
// Oscar