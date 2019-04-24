public class candles{
    
    static int birthdayCakeCandles(int[] ar) {
        int mayor = ar[0];
        int aux = 0;
        for (int i = 0; i < ar.length; i++){
            if (ar[i] >= mayor){
                mayor = ar[i];
            }
        }

        for (int i = 0; i < ar.length; i++){
            if (ar[i] == mayor){
                aux = aux + 1;
            }
        }

        return aux;

    }

    public static void main(String args[]){
        int ar [] = {1,2,4,5,7,8,9,10};
        System.out.println(birthdayCakeCandles(ar));

    }

}