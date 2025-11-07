public class CountUnguardedCells {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

        int[][] castle=new int[m][n];

        for (int[] g : guards) castle[g[0]][g[1]] = 1;

        for (int[] w : walls) castle[w[0]][w[1]] = -1;
        int mark = 2; // for guarded cells

        for (int[] g : guards) {
            int x = g[0], y = g[1];
            for (int i = x + 1; i < m; i++) {
                if (castle[i][y] == -1 || castle[i][y] == 1) break;
                if (castle[i][y] == 0) castle[i][y] = mark;
            }

            // up
            for (int i = x - 1; i >= 0; i--) {
                if (castle[i][y] == -1 || castle[i][y] == 1) break;
                if (castle[i][y] == 0) castle[i][y] = mark;
            }

            // right
            for (int j = y + 1; j < n; j++) {
                if (castle[x][j] == -1 || castle[x][j] == 1) break;
                if (castle[x][j] == 0) castle[x][j] = mark;
            }

            // left
            for (int j = y - 1; j >= 0; j--) {
                if (castle[x][j] == -1 || castle[x][j] == 1) break;
                if (castle[x][j] == 0) castle[x][j] = mark;
            }
        }


        int unguarded = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (castle[i][j] == 0) unguarded++;
            }
        }
        return unguarded;
    }

}
