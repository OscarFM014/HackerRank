import java.util.Scanner;
public class Grapes{

    public static String solve(int andrew, int dmitri, int michael, int green , int purple, int black){
        int total = green + purple + black;

        if (green >= andrew){
            green = green - andrew;
            total = green + purple + black;
        }else{
            return "NO";
        }

        if( (total - black) >= dmitri){
            total = total - dmitri;
        }else{
            return "NO";
        }

        if(total < michael){
            return "NO";
        }

        return "YES";

    }



    public static void main(String args[]){
        Scanner res = new Scanner(System.in);

        int andrew = res.nextInt();
        int dmitri = res.nextInt();
        int michael = res.nextInt();

        int green = res.nextInt();
        int purple = res.nextInt();
        int black = res.nextInt();

        System.out.println(solve(andrew, dmitri, michael, green, purple, black));
        res.close();


    }
}