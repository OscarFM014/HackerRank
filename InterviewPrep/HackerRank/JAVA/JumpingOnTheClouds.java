public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {
        int jump = 0;
        int jump2 = 0;
        int pos = 0;
        if (c.length == 0) {
            return 0;
        }

        while (pos < c.length - 2) {
            if (c[jump + 1] == 0) {
                if (c[jump + 2] == 0) {
                    jump = jump + 1;
                }
                jump = jump + 1;
                jump2 = jump2 + 1;
            } else {
                jump = jump + 2;
                jump2 = jump2 + 1;
            }
            pos = jump;
            System.out.println(pos + " pos");
        }

        if (c[pos] == 0 && pos < c.length - 1) {

            if (c[pos + 1] == 0) {
                jump = jump + 1;
            }
            jump2 = jump2 + 1;

        }

        return jump2;
    }

    public static void main(String args[]) {
        int[] first = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 };
        int[] second = { 0, 0, 0, 1, 0, 0 };
        int[] third = { 0, 0, 1, 0, 0, 1, 0 };
        System.out.println(jumpingOnClouds(third));

    }
}