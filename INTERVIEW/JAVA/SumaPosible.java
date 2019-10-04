import java.util.Hashtable;

public class SumaPosible{

    static int[] sumaPosible(int n ,int [] numeros ){

        int [] answer = new int [2];
        Hashtable <Integer, Integer> h = new Hashtable<Integer, Integer>();

        for (int i = 0; i < numeros.length; i++){
            if (h.containsKey(numeros[i])){
                answer[0] = numeros[i];
                answer[1] = h.get(numeros[i]);
            }else{
                h.put(n-numeros[i], numeros[i]);
            }
        }

        for (int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }

        return answer;
    }




    public static void main(String args []){
        int [] lista = {1,2,3,4,5};
        int n = 6;
        sumaPosible(n,lista);
    }



}