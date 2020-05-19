import java.util.*;

//Status: In process
public class Candies {

    public static int solution(int[] array, String[] operations) {
        int parSum = 0;
        int sum = 0;
        int beg = 0;
        int fin = 0;
        short flag = 0;
        int sec = 1;

        for (int i = 0; i < operations.length; i++) {
            String[] aux = operations[i].split(" ");
            // System.out.println(operations.length);
            if (aux[0].equals("Q")) {
                beg = Integer.parseInt(aux[1]);
                fin = Integer.parseInt(aux[2]);
                for (int j = beg; j < fin; j++) {
                    if (flag == 0) {
                        parSum = parSum + array[j - 1] * sec;
                        sec++;
                        flag = 1;
                    } else {
                        parSum = parSum - array[j - 1] * sec;
                        sec++;
                        flag = 0;
                    }
                    System.out.println(array[j - 1]);
                }
                sum = sum + parSum;
                parSum = 0;
                flag = 0;
            } else {
                for (int pos = 1; pos < aux.length; pos++) {
                    array[pos - 1] = Integer.parseInt(aux[pos]);
                }
            }

            // System.out.println(operations[i]);
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        int cases = res.nextInt();
        int elements = 0;
        int operations = 0;
        int[] n = new int[elements];

        System.out.println();
        for (int i = 0; i < cases; i++) {
            elements = res.nextInt();
            operations = res.nextInt();
            n = new int[elements];
            for (int j = 0; j < elements; j++) {
                n[j] = res.nextInt();
            }
            res.nextLine();
            String[] todo = new String[operations];
            for (int op = 0; op < operations; op++) {
                todo[op] = res.nextLine();
            }
            System.out.println("Case #" + (i + 1) + ": " + solution(n, todo));
            // solution(n, todo);
        }
    }
}