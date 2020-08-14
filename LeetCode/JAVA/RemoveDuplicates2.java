import java.util.*;

public class RemoveDuplicates2 {

    public static void solve(int size, int[] numeros) {
        HashMap<Integer, Integer> sol = new HashMap<>();
        HashSet<Integer> dic = new HashSet<>();
        HashSet<Integer> rep = new HashSet<>();
        String 
        for (int i : numeros) {
            if (dic.contains(i)) {
                rep.add(i);
            }
            dic.add(i);
        }

        for (int i = size - 1; i >= 0; i--) {

        }

    }

    public static void main(String args[]) {
        Scanner res = new Scanner(System.in);
        int size = res.nextInt();
        int[] numeros = new int[size];

        for (int i = 0; i < size; i++) {
            int number = res.nextInt();
            numeros[i] = number;
        }

        solve(size, numeros);
        res.close();

    }
}