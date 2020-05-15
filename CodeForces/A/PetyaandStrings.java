
//Problem:
//https://codeforces.com/contest/112/problem/A
import java.io.*;
import java.util.*;

public class PetyaandStrings {

    public static String bigger(String fLine, String sLine) {
        HashSet<String> fs = new HashSet<>();
        fLine = fLine.toLowerCase();
        sLine = sLine.toLowerCase();
        fs.add(fLine);

        if (fs.contains(sLine)) {
            return "0";
        }

        for (int i = 0; i < fLine.length(); i++) {
            int f = (int) fLine.charAt(i);
            int s = (int) sLine.charAt(i);
            if (f < s) {
                return "-1";
            } else if (f > s) {
                return "1";
            }
        }

        return "0";
    }

    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);
        String fLine = res.nextLine();
        String sLine = res.nextLine();

        System.out.println(bigger(fLine, sLine));
        res.close();

        // Oscar
    }
}