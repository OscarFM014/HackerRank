import java.util.Scanner;
import java.lang.Math; 

public class Positive{

    public static int solve(int n, int lista[]){
        int mitad;
        if (n % 2 == 0){
            mitad = n /2;
        }else{
            mitad = (n / 2) + 1;
        }

        int positive = 0;
        int negative = 0;

        for(int i = 0; i < lista.length; i++){
            if (lista[i] > 0){
                positive++;
            }else if (lista[i] < 0){
                negative++;
            }
        }

        if (positive >= mitad){
            return 1;
        }else if (negative >= mitad){
            return -1;
        }else{
            return 0;
        }


    }


    public static void main(String args[]){
        Scanner res = new Scanner(System.in);
        int n = res.nextInt();
        int [] lista = new int [n*];

        for (int i = 0; i < n; i++){
            int num = res.nextInt();
            lista[i] = num;
        }
        System.out.println( solve( n, lista) );
        res.close();


    }
}