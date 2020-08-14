import java.util.*;
public class Digits{

    public static String solve(String number) {        
        if (number.length() == 2 && number.charAt(0) >= number.charAt(1)){
            return "NO";
        }else {
            return "YES " + "2 " + number.substring(0,1) + " " + number.substring(1);
        }


    }

    public static void main(String args[]){
        Scanner res = new Scanner(System.in);
        int n = res.nextInt();
        String [] result = new String [n];
 
        for (int i = 0; i < n; i++){
            int size = res.nextInt();
            int x = res.nextInt();
            result [i] = solve(Integer.toString(x));
        }
 
        for(int i = 0; i < n; i++){
            System.out.println(result[i]);
        }
        

        
        res.close();

    }
}