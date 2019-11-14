public class Backspace {

    public boolean backspaceCompare(String S, String T) {
        String aux = "";
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i + 1) != '#') {
                aux = aux + S.charAt(i);
            }
        }

    }

}