import java.util.HashMap;
import java.util.Hashtable;

class SigleNumber{
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer> ();

        for(int i = 0; i < nums.length; i++){
           numbers.put(getOrDefault(nums[i], 0) + 1);   
        }

        System.out.print(numbers);
        return 0;
        
        

    }

    public static void main(String [] args){
        int [] x = {2,2,1};
        System.out.println(singleNumber(x));
    }

}