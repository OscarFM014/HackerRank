import java.util.HashMap;
import java.util.Hashtable;

class TwoSum{

    public static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> index = new Hashtable<Integer, Integer> ();
        int [] resultado = new int [2];

        for(int num = 0; num < nums.length; num ++ ){
            if(index.containsKey( (nums[num]) )){
                resultado[0] = num;
                resultado[1] = index.get(nums[num]);
                return resultado;
            }else{
                index.put(target - nums[num], num);
            }
        }

        for (int i = 0; i < resultado.length; i++){
            System.out.println(resultado[i]);
        }
        
        return resultado;

       



    }



    public static void main (String args []){
        int [] lista = {1,2,3,4,5};
        int n = 6;
        System.out.println(twoSum(lista,n));
        
    }
}