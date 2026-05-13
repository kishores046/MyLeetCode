import java.util.Arrays;

class RotateBox{
    public char[][] rotateTheBox(char[][] boxGrid) {
        char[][] res=new char[boxGrid[0].length][boxGrid.length];

        for(int i=0;i<boxGrid.length;i++){
            int right = boxGrid[i].length - 1;

            for(int left = boxGrid[i].length - 1; left >= 0; left--){

                if(boxGrid[i][left] == '*'){
                    right = left - 1;   // reset after obstacle
                }
                else if(boxGrid[i][left] == '#'){
                    char temp = boxGrid[i][right];
                    boxGrid[i][right] = '#';
                    if(right != left) boxGrid[i][left] = '.';
                    right--;
                }
            }
        }

        // transpose
        for(int i=0;i<boxGrid.length;i++){
            for(int j=0;j<boxGrid[i].length;j++){
                res[j][boxGrid.length - 1 - i]=boxGrid[i][j];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        char[][] arr = {
                {'#', '#', '*', '.', '*', '.'},
                {'#', '#', '#', '*', '.', '.'},
                {'#', '#', '#', '.', '#', '.'}
        };
        System.out.println(Arrays.deepToString(new RotateBox().rotateTheBox(arr)));
    }
}