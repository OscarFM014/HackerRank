public class Islas{

    static int islas(int[][] isla){
        int res = 0;

        for(int i = 0; i< isla.length; i++){
            for(int j = 0; j < isla[i].length; j ++){
                if (isla[i][j] == 1){
                    res += 1;
                    helper(isla, i, j);
                }
            }
        }
        return res;
    }

    static void helper(int [][] isla, int i, int j){
        if(isla[i][j] == 0 || i < 0 || j < 0 || i >= isla.length || j >= isla.length){
            return;
        }
        isla[i][j] = 0;
        
        helper(isla, i+1,j);
        helper(isla, i-1, j);
        helper(isla, i, j+1);
        helper(isla, i, j-1);
        return ;

    }




    public static void main (String args []){
        int isla [][] = {{0,1,1,0},
                         {0,1,1,0},
                         {1,0,0,1}};

        System.out.println(islas(isla));

    }


}