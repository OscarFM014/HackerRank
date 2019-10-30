import java.util.Scanner;
import java.math.*;
public class Margarite {

    public static int solve(int inicio , int fin){
        int diferencia = fin - inicio;

        if (diferencia % 2 == 0){
            diferencia = (diferencia /2) + inicio;
            if (inicio % 2 == 0){
                return diferencia;
            }else{
                return diferencia*-1;
            }
        }else{
            diferencia =  (diferencia + 1) / 2;
            if (inicio % 2 == 0){
                return diferencia*-1;
            }else{
                return diferencia ;
            }
        }

        



        /*
        while (inicio <= fin){
            result = result + ( inicio * (int)Math.pow(-1, inicio) ); 
            inicio = inicio + 1;
        }
        return result;*/

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