public class Peak {
    public static int findPeakElement(int[] nums) {
        int izq = 0;
        int der = izq + 2;

        if (nums.length <= 1) {
            return 0;
        }

        if (nums[0] > nums[1]) {
            return 0;
        }

        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        for (int i = 1; i < nums.length - 1; i++) {

            if (nums[i] > nums[izq] && nums[i] > nums[der]) {
                return i;
            }
            izq = izq + 1;
            der = der + 1;
        }

        return 0;
    }

    public static void main(String args[]) {
        int[] a = { 1, 2, 3, 1 };
        System.out.println(findPeakElement(a));
    }

}