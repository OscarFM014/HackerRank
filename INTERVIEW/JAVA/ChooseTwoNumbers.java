import java.util.*;

public class ChooseTwoNumbers {

    public static void solve(int[] arrayA, int[] arrayB) {
        HashSet<Integer> dic = new HashSet<>();
        for (int i : arrayA) {
            dic.add(i);
        }

        for (int i : arrayB) {
            dic.add(i);
        }

        for (int i = 0; i < arrayA.length; i++) {

            for (int j = 0; j < arrayB.length; j++) {

                if (!dic.contains(arrayA[i] + arrayB[j])) {
                    System.out.println(arrayA[i]);
                    System.out.println(arrayB[j]);
                    return;
                }

            }

        }

    }

    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);
        int sizeA = res.nextInt();
        int[] numerosA = new int[sizeA];

        for (int i = 0; i < sizeA; i++) {
            int numbera = res.nextInt();
            numerosA[i] = numbera;
        }

        int sizeB = res.nextInt();
        int[] numerosB = new int[sizeB];

        for (int i = 0; i < sizeB; i++) {
            int numberb = res.nextInt();
            numerosB[i] = numberb;
        }

        solve(numerosA, numerosB);
        res.close();
    }
}