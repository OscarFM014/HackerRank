import java.util.Scanner;
//! Problem: 
//https://codeforces.com/contest/231/problem/A


public class Team {


    private static int solutions(int[][] matrix) {
        int numberSolutions = 0;
        int participant = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                if(matrix[i][j] == 1){
                    participant++;
                }
            }
            if(participant >= 2){
                numberSolutions++;
            }
            participant = 0;
        }
        return numberSolutions;
    }
    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);
        int problems = res.nextInt();
        int[][] matrix = new int[problems][3];
        for (int i = 0; i < problems; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = res.nextInt();
            }
        }

        System.out.println(solutions(matrix));

        res.close();
    }
}
// Oscar
    