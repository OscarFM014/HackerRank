import java.util.*;

public class SockMerchant{

    static int sockMerchant(int n, int[] ar) {
        List<Integer> aux = new ArrayList<>();
        int cont = 0;
        for(int i = 0; i < ar.length; i++){
            int bus = aux.indexOf(ar[i]);
            if (bus >= 0){
                aux.remove(bus);
                cont++;
            }else{
                aux.add(ar[i]);
            }
        }
        return (cont);

    }

    public static void main(String[] args){
        int ar [] = {1,2,3,3,4,1};
        System.out.println(sockMerchant(9, ar));

    }
}
