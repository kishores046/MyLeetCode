class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {

        int[][] mat=new int[n][n];

        // Initialize boundaries
        int top = 0, bottom = n - 1, left = 0, right = n - 1,nums=1;

        // Iterate until all elements are printed
        while (top <= bottom && left <= right) {

            // Print top row from left to right
            for (int i = left; i <= right; ++i) {
                
                    
        mat[top][i]=nums;
                nums++;
            }
            top++;

            // Print right column from top to bottom
            for (int i = top; i <= bottom; ++i) {
                mat[i][right]=nums;
                nums++;
            }
            right--;

            // Print bottom row from right to left (if exists)
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    mat[bottom][i]=nums;
                    nums++;
                }
                bottom--;
            }

            // Print left column from bottom to top (if exists)
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    mat[i][left]=nums;
                        nums++;
                }
                left++;
            }
        }

        return mat;
    }
}
