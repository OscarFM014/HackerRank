
//!Problem:
//http://codeforces.com/contest/677/problem/A
import java.util.*;

public class VanyaAndFence {

    private static int calculateDistance(int[] heights, int wall) {
        if (wall <= 0 || heights.length == 0) {
            return 0;
        }

        int totalDistance = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > wall) {
                totalDistance = totalDistance + 2;
            } else {
                totalDistance++;
            }
        }

        return totalDistance;
    }

    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);
        int friends = res.nextInt();
        int wall = res.nextInt();
        int[] heights = new int[friends];

        for (int i = 0; i < friends; i++) {
            int number = res.nextInt();
            heights[i] = number;
        }

        System.out.println(calculateDistance(heights, wall));
        res.close();
    }

}
// Oscar