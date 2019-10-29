import java.util.Scanner;
public class Margarite {




    public static int solve(int inicio , int fin){
        int result = 0; 

        while (inicio <= fin){
            if (inicio % 2 == 0){
                result =  result + inicio;
            }else{
                result =  result - inicio;
            }
            inicio = inicio + 1;
            }
        return result;

    }

    public static void main(String args[]){
        Scanner res = new Scanner(System.in);

        int n = res.nextInt();
        int[] lista = new int [n];


        for (int i = 0; i < n; i++){
            int inicio = res.nextInt();
            int fin = res.nextInt();
            lista[i] = solve(inicio, fin);
        }

        for (int i = 0; i < n; i++){
            System.out.println(lista[i]);
        }

        

        
        res.close();


    }
}