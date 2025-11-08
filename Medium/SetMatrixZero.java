public class SetMatrixZero {
        public void setZeroes(int[][] matrix) {
            int n=matrix[0].length;
            int m=matrix.length;
            int[] col=new int[m];
            int[] row=new int[n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==0){
                        col[i]=1;
                        row[j]=1;
                    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(col[i]==1 || row[j]==1)matrix[i][j]=0;
                }
            }
        }
}
