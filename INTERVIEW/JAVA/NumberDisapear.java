import java.util.*;

public class NumberDisapear{

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<Integer>();
        HashSet<Integer> numbers = new HashSet<Integer>();

        for(int i: nums){
            numbers.add(i);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!numbers.contains(i)){
                missing.add(i);
            }
        }

        return missing;
    }
}

