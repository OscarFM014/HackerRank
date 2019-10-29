import java.util.Scanner;

public class Origami{

    public static int solve(int friends, int notebook){
        int red = 2;
        int green = 5;
        int blue = 8;

        int nr = red * friends;
        int ng = green * friends;
        int nb = blue * friends;

        int total = 0;

        if (nr % notebook > 0){
            total = (total + nr /notebook ) + 1;
        } else {
            total = (total + nr /notebook );
        }

        if (ng % notebook > 0){
            total = (total + ng /notebook ) + 1;
        } else {
            total = (total + ng /notebook );
        }

        if (nb % notebook > 0){
            total = (total + nb /notebook ) + 1;
        } else {
            total = (total + nb /notebook );
        }


        return total;


    }


    public static void main(String args[]){
        Scanner res = new Scanner(System.in);

        int friends = res.nextInt();
        int notebooks = res.nextInt();

        System.out.println(solve(friends, notebooks));
        res.close();


    }
}