import java.util.*;
public class Unimodal {


    public static String solve(int size, int [] number){
        int mayor = Integer.MIN_VALUE;
        boolean flag = true;
        boolean menor = false;

        for (int i = 0; i < size; i++){
            if(number[i] == mayor && menor){
                return "NO";
            }

            if (number[i] > mayor && flag){
                mayor = number [i];

            }else if(number[i] == mayor){
                flag = false;
                mayor = number[i];

            }else if(number[i] < mayor){
                flag = false;
                menor= true;
                mayor = number[i];

            }else{
                return "NO";
            }
        }   

        return "YES";
    }






    public static void main(String ars[]){
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