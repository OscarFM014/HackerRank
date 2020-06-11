import java.util.HashSet;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) {
                hs.remove(nums[i]);
            } else {
                hs.add(nums[i]);
            }
        }

        int result = 0;

        for (int i : hs) {
            result = i;
        }
        return result;

    }

    public static void main(String args[]) {
        int[] arr = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(arr));
    }
}
