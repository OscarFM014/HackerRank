public class Palindromo{

    static boolean palindromo(String s){
        if (s.length() == 0){return true;}

        s = s.toLowerCase();
        int f = 0;
        int l = s.length()-1;
        while (f < l){
           while (f < l && !Character.isLetterOrDigit(s.charAt(f))){
                f++;
            }

            while ( f < l && !Character.isLetterOrDigit(s.charAt(l))){
                l--;
            }

            if( s.charAt(f) != (s.charAt(l))){
                return false;
            }

            f++;
            l--;
        }
        return true;




    }


    public static void main (String args[]){
        String word = ",.";
        System.out.println(palindromo(word));



    }
}