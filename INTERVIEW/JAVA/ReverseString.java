public class ReverseString{

    static String reverse(String word){
        //First at all make an array of a chars 
        char [] characters = word.toCharArray();
        int f = 0;
        int l = word.length()-1;

        while(f < l){
            char aux = characters[f];
            characters[f++] = characters[l];
            characters[l--] = aux;
        }
        return new String(characters);
    }




    public static void main(String args []){
        System.out.println(reverse("word"));
    }
}