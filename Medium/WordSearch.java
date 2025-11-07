public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean dfs(char[][] board, String word, int i, int j, int index, boolean[][] visited) {

        if (index == word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length ||
                board[i][j] != word.charAt(index) || visited[i][j]) {
            return false;
        }

        visited[i][j] = true;


        boolean found = dfs(board, word, i + 1, j, index + 1, visited) ||
                dfs(board, word, i - 1, j, index + 1, visited) ||
                dfs(board, word, i, j + 1, index + 1, visited) ||
                dfs(board, word, i, j - 1, index + 1, visited);


        visited[i][j] = false;

        return found;
    }
}
