import java.util.*;
public class Rhombus{


    public static int solve(int n){
        return (int) (2 * Math.pow(n, 2) - 2 *n + 1);
    }



    public static void main (String args []){
        Scanner res = new Scanner(System.in);
        int cash = res.nextInt();

        System.out.println(solve(cash));


        res.close();


    }
}