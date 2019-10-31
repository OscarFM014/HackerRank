import java.util.*;
import java.util.Scanner;

public class Substring {


    public static void solve(int size, char[] word){
        HashSet <Character> letras = new HashSet<Character>();
        
        for (int i = 0; i < size; i++){
            letras.add( word[i] );
        }

        if (letras.size() <= 1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
            
            if (word[0] != word[1]){
                System.out.print(word[0]);
                System.out.print(word[1]);
            }else{
                int i = 0;
                while(word[i] == word[i+1]){
                    i = i + 1;
                }
                System.out.print(word[i]);
                System.out.print(word[i+1]);
            }
            
        }
    }
    public static void main(String ars[]){
        Scanner res = new Scanner(System.in);
        int size = Integer.parseInt(res.nextLine());;
        char[] word = res.nextLine().toCharArray();

        solve(size,word);
        res.close();

    }
}