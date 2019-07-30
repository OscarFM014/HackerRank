public class arraysd {
    static int[] reverseArray(int[] a) {
        int [] reverse = new int [a.length];
        for (int i = a.length - 1; i >= 0; i--){
            reverse[(a.length-1)-i] = a[i];
            //!System.out.println(reverse[(a.length-1)-i]);
        }
        return reverse;

    }
    public static void main(String args[]){
        int []array = {1,2,3,4,5};
        System.out.println(reverseArray(array));
    }
}