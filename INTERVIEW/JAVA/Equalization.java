import java.util.HashSet;
import java.util.Scanner;

public class Equalization{


    public static String solve(char [] first, char [] second){

        HashSet <Character> res1 = new HashSet<>();
        

        for(int i = 0; i < first.length; i++){
            res1.add( first[i] ) ;
        }

        for(int i = 0; i < second.length; i++){
            if( res1.contains( second[i])) {
                return "YES";   
            }
        }



        return "NO";
    }


    public static void main(String args []){
        Scanner res = new Scanner(System.in);
        
        int q = Integer.parseInt(res.nextLine());
        String [] resu = new String [q];

        for(int i = 0; i < q; i++){
            char[] first = res.nextLine().toCharArray();
            char[] second = res.nextLine().toCharArray();
            resu[i] = solve(first, second);
        }

        for(String i: resu){
            System.out.println(i);
        }

        res.close();


    } 
}