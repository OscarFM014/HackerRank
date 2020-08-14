import java.util.*;

public class StepsMenor{


    public static int solve(int size, int[] numeros){
        int aux = 0;
        int cont = 0;
        for (int i = 0; i < size-1; i++){

            if (numeros[i] < numeros[i+1] && numeros[i] < numeros[i+1]){
                aux = aux + 1;
            }else{
                aux = 0;
            }

            if (aux >= cont ){
                cont = aux;  
            }        
        }


        //if(numeros[size - 2 ] <= numeros[size-1]){
        //    return cont +1 
        //}
        return cont+1;
    }

    public static void main(String args[]){
        Scanner res = new Scanner(System.in);
        int size = res.nextInt();
        int [] numeros = new int [size];

        for (int i = 0; i < size; i++){
            int number = res.nextInt();
            numeros[i] = number;
        }

        System.out.println(solve(size, numeros));


        res.close();


    }
}