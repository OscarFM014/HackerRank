import java.util.HashSet;
import java.util.Scanner;

public class Superhero{


    public static String solve(String hero, String other){
        HashSet <Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        if (hero.length() != other.length()){
            return "NO";
        }

        for(int i = 0; i < hero.length(); i++){

            if (!(vowels.contains(hero.charAt(i))) && vowels.contains(other.charAt(i) )){
                return "NO";
            }

            if ( vowels.contains(hero.charAt(i)) && !(vowels.contains(other.charAt(i))) ){
                return "NO";
            }
        }

        return "YES";
        

    }
    public static void main(String args []){
        Scanner res = new Scanner(System.in);
        String n = res.nextLine();
        String z = res.nextLine();

        System.out.println( solve (n, z));
        
        res.close();


    }
}