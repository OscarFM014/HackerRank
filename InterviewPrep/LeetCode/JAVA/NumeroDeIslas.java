public class NumeroDeIslas {

    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int resultado = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1')
                    resultado = resultado + cont(grid, i, j);
            }
        }

        return resultado;

    }

    public int cont(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || i == grid.length || grid[i][j] == '0') {
            return 0;
        }

        grid[i][j] = '0';

        cont(grid, i + 1, j);
        cont(grid, i, j + 1);
        cont(grid, i - 1, j);
        cont(grid, i, j - 1);

        return 1;
    }

}
