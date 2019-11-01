import java.util.HashSet;
import java.util.Scanner;
public class DistinctDigit{

    public static int solve(int ini, int fin){
        String inicial = Integer.toString(ini);

        while (ini != fin+1){
            HashSet <Character> dic = new HashSet<>();
            
            inicial = Integer.toString(ini);

            for(int i = 0; i < inicial.length(); i++){
                dic.add( inicial.charAt(i));
            }

            if ( dic.size() == inicial.length() ){
                return ini;
            }
            
            ini = ini + 1;
        }
        
        return -1;

    }

    


    public static void main(String args []){
        Scanner res = new Scanner(System.in);
        int ini = res.nextInt();
        int fin = res.nextInt();

        System.out.println(solve(ini, fin));


    }


}