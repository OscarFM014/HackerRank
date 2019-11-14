import java.util.PriorityQueue;
import java.util.Scanner;
public class Primos{

    public static int solve(int rows, int columns, int[][] matriz){
        PriorityQueue <Integer> primos = new PriorityQueue<>();
        
        for (int i = 0; i < columns; i++){
            int aux = 0;
            
            for(int j = 0; j < rows; j++){
                if(matriz[i][j] != 2 || matriz[i][j] != 3 || matriz[i][j] != 5 || matriz[i][j] != 7 || matriz[i][j] != 11){
                    
                    if( matriz[i][j] % 2 == 0 || matriz[i][j] % 3 == 0 || matriz[i][j] % 5 == 0 || matriz[i][j] % 7 == 0 || matriz[i][j] % 11 ==0 || matriz[i][j] == 1){
                        aux = aux + 1;
                    }            
                }
            }
            primos.add(aux);
        }



        return primos.poll();


    }



    public static void main(String [] args){
        Scanner res = new Scanner(System.in);
        int rows = res.nextInt();
        int columns = res.nextInt();
        int [][] matriz = new int [columns][rows];


        for (int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                int number = res.nextInt();
                matriz[i][j] = number;
            }
        }

        System.out.println(solve(rows,columns,matriz));




        
    }
}