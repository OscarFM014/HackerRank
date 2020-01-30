public class MinimumRecursive {
    public static int min(int[] arr, int i) {

        if (i == 1) {
            return arr[0];
        }

        return Math.min(arr[i - 1], min(arr, i - 1));

    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(min(arr, arr.length));
    }

}