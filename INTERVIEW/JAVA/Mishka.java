import java.util.Scanner;

public class Mishka{

    public static int solve(int x,int n, int lista[]){
        int izq = 0;
        int der = lista.length - 1;
        int count = 0;

        if(lista.length == 0){
            return 0;
        }
        while( (lista[izq] <= n || lista[der] <= n) && izq < der){

            if (lista[izq] <= n){
                count = count + 1;
                izq = izq + 1;
            }
            
            if (lista[der] <= n){
                count = count + 1;
                der = der - 1;
            }
        }

        if (izq == der && lista[izq] <= n){
            count = count +1 ;
        }
        
        return count;
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
        //{4,2,3,1,5,1,6,4};
        System.out.println(solve(x , n, lista));
        res.close();


    }
}