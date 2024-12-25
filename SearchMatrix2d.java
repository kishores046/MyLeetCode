public class SearchMatrix2d{
    public static void main(String args[]){
        int[][] matrix={
            {1,3,5},
            {7,9,11},
            {13,15,17}
        };
        int target=5 ;
        boolean result=find(matrix,target);
        System.out.println(result);
}
                
         public static boolean find(int[][] matrix, int target) {
            int rows=matrix.length;
            int cols=matrix[0].length;
            int row=0;
            int col=cols-1;
            while(row<rows && col>=0){
                if(matrix[row][col]==target){
                    return true;
                }
                else if(matrix[row][col]<target){
                    row++;
                }
                else{
                    col--;
                }
            }
            return false;
            }
           
        }
    



