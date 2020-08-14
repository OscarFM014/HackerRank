public class appleorange{
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int in_apple = 0;
        int in_orange = 0;
        for (int i = 0; i < apples.length; i++){
            if ( ((apples[i] + a) <= t) && ((apples[i] + a) >= s) ){
                ++in_apple;
            }
        }

        for (int i = 0; i < oranges.length; i++){
            if ( ((oranges[i] + b) <= t) && ((oranges[i] + b) >= s) ){
                ++in_orange;
            }
        }

        System.out.println(in_apple);
        System.out.println(in_orange);



    }
    public static void main (String args[]){
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int [] apples = {-2, 2, 1};
        int [] oranges = {5, -6};

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}