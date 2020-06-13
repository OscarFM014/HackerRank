import java.util.HashSet;

public class Duplicates {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numeros = new HashSet();

        for (int i : nums) {
            numeros.add(i);
        }

        if (numeros.size() == nums.length) {
            return false;
        }
        return true;
    }

}