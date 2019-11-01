import java.util.*;
public class One{

    public static void solve (int size, int [] numbers){
        
    }



    public static void main(String args[]){
        Scanner res = new Scanner(System.in);
        int size = res.nextInt();
        int salto = res.nextInt();
        int numeros = res.nextInt();
        int [] numeros = new int [size];

        for (int i = 0; i < size; i++){
            int number = res.nextInt();
            numeros[i] = number;
        }

        System.out.println(solve(size, numeros));


        res.close();


    }
}