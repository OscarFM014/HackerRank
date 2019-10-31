import java.util.*;
public class Prank{


    public static int solve(int size, int [] numbers){
        int cuenta = 0;
        boolean [] valores = new boolean[size]; 
        
        for(int i = 0; i < size - 1; i++){
            if (numbers[i+1] - numbers[i] != 1){
                
                if (i!=0){
                    valores[i-1] = false;
                }
                
                valores[i] = false;
                valores[i+1] = false;
            }else{

                if (valores[i]==false){
                    valores[i] = false;
                    valores[i+1] = true;
                }else{
                    valores[i] = true;
                    valores[i+1] = true;
                }
                
                
            }
        }

        for(int i = 0; i < valores.length; i++){
            if(valores[i] == true){
                cuenta = cuenta + 1;
            }
        }

        if (cuenta == size){
            return cuenta-1;
        }
        return cuenta;
    }
    


    public static void main(String args[]){
        Scanner res = new Scanner(System.in);
        int size = res.nextInt();
        int [] numeros = new int [size];

        for (int i = 0; i < size; i++){
            int number = res.nextInt();
            numeros[i] = number;
        }


        System.out.println(solve(size,numeros));
        
        res.close();

    
    }
}