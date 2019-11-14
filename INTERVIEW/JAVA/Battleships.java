public class Battleships {

    public int countBattleships(char[][] board) {

        int res = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    res += 1;
                    helper(board, i, j);
                }
            }
        }

        return res;
    }

    public void helper(char[][] board, int i, int j) {

        if (i < 0 || i >= board.length || j >= board.length || j < 0) {
            return;
        }
        if (board[i][j] == '.') {
            return;
        }

        board[i][j] = '.';

        helper(board, i + 1, j);
        helper(board, i - 1, j);
        helper(board, i, j + 1);
        helper(board, i, j - 1);
        return;

    }

}