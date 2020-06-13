import java.util.Scanner;
public class Parity{

    public static String solve(int x, int n, int[] lista){



        Long number = 0L;
        n = n -1;

        for (int i = 0; i < lista.length; i++){
            number = (lista[i] * ((long) Math.pow(x, n)) ) + number;
            n = n - 1;
        }
        //System.out.println(number);

        if (number % 2 == 0){
            return "Even";
        }else if(number % 2 !=0){
            return "Odd";
        }else{
            return "Even";
        }
    }

    
    public static void main(String args[]){
        Scanner res = new Scanner(System.in);
        int x = res.nextInt();
        int n = res.nextInt();
        int[] lista = new int [n];

        for (int i = 0; i < n; i++){
            int num = res.nextInt();
            lista[i] = num;
        }
        System.out.println(solve(x,n, lista));
        res.close();


    }
}