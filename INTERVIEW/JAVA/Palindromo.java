public class Palindromo{

    static boolean palindromo(String pal){
        if (pal.length() == 0){return true;}

        int f = 0;
        int l = pal.length()-1;
        while (f != l && f < l){
            while (Character.isLetter(pal.charAt(f)) == false){
                System.out.println("false");
                f++;
            }

            while (Character.isLetter(pal.charAt(l)) == false){
                System.out.println("false");
                l--;
            }

            if( pal.charAt(f) != (pal.charAt(l))){
                return false;
            }

            f++;
            l--;
        }
        return true;




    }


    public static void main (String args[]){
        String word = "ava";
        System.out.println(palindromo(word));



    }
}