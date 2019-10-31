
import java.util.*;
public class Lottery {

    public static int solve(int cash){
        int billetes = 0;
        while (cash != 0){
            if (cash>= 100 ){
                cash = cash - 100;
                billetes = billetes +1 ;
            }else if(cash >= 20){
                cash = cash - 20;
                billetes = billetes + 1;
            }else if (cash >= 10 ){
                cash = cash - 10 ;
                billetes = billetes +1 ;
            }else if (cash >= 5 ){
                cash = cash - 5 ;
                billetes = billetes +1 ;
            }else{
                cash = cash - 1;
                billetes = billetes + 1;
            }
        }

        return billetes;
    }




    public static void main (String args []){
        Scanner res = new Scanner(System.in);
        int cash = res.nextInt();

        System.out.println(solve(cash));


        res.close();


    }
}