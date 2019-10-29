import java.util.HashSet;
import java.util.Scanner;

public class Diverse{

    public static void solve(int x , int n, int []lista ){
        HashSet<Integer> rep = new HashSet<>();
        HashSet<Integer> index = new HashSet<>();

        for(int i = 0; i < lista.length; i++){
            if (rep.contains(lista[i]) == false){
                rep.add(lista[i]);
                index.add(i+1);
                --n;
                if (n == 0){
                    break;
                }
            }
        }

        if(x == 0){
            System.out.println("NO");
        }
        else if(n == 0){
            System.out.println("YES");
            for(int k : index){
                System.out.print(k + " ");
            }
        }else{
            System.out.println("NO");
        }

        
 
    }


    public static void main(String args[]){
        Scanner res = new Scanner(System.in);

        int x = res.nextInt();
        int n = res.nextInt();
        int [] lista = new int [x];

        for (int i = 0; i < x; i++){
            int num = res.nextInt();
            lista[i] = num;
        }
        solve(x , n, lista);
        res.close();


    }
    

}