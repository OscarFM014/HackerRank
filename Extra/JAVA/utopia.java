public class utopia{
    static int utopianTree(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++){
            if(result % 2 == 0){
                result = result + 1;
            }else{
                result = result * 2;
            }
            System.out.println(i+ " - " + result);
        }
        return result;

    }
    public static void main(String args[]){
        System.out.println(utopianTree(2));


    }

}