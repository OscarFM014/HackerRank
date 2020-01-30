import java.util.*;

public class ValidParetheses {

    public static boolean valida(String s) {
        String[] valores = new String[s.length()];
        valores = s.split("");

        for (String i : valores) {
            System.out.println(s);
        }
        return true;
    }

    public static void main(String args[]) {
        Stack<E> stack = new Stack<E>();

        System.out.println(valida("()2[]32{}23"));
    }
}