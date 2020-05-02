//! Problem: 
//https://codeforces.com/contest/263/problem/A
import java.util.Scanner;

public class BeatifulMatrix {


    private static int beatifulMoves(int[][] matrix) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(matrix[i][j] == 1){
                    return Math.abs(i-2) + Math.abs(j-2);
                }
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = res.nextInt();
            }
        }

        System.out.println(beatifulMoves(matrix));

        res.close();
    }
}
// Oscar