import java.util.Scanner;
public class Subtraction{

    public static void solve(int n, Long[] lista){
        for (int i = 0; i < lista.length - 1; i++){
            if (lista[i] - lista[i+1] >= 2 ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            i++;
        }
    }

    
    public static void main(String args[]){
        Scanner res = new Scanner(System.in);
        int n = res.nextInt();
        Long [] lista = new Long [n*2];

        for (int i = 0; i < n*2; i++){
            Long num = res.nextLong();
            lista[i] = num;
        }
        solve( n, lista);
        res.close();


    }
}