import java.util.*;
public class Digits{

    public static String solve(String number) {
        //HashSet <String> x = new HashSet<>();
        String one = number.substring(0,1);
        String rest = number.substring(1);
        
        if (number.length() == 2 && number.charAt(0) >= number.charAt(1)){
            return "NO";
        }else {
            String result = "YES " + "2 " + one + " " + rest;
            return result;
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