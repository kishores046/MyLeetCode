import java.util.Scanner;
public class ExcelSheetNumberConv {
    public boolean isPowerOfTwo(int n) {
        
        if(n<=0){
            return false;
        }
        return((n&(n-1))==0);
        
    }
    public static void main(String[] args){
        ExcelSheetNumberConv obj=new ExcelSheetNumberConv();
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            boolean bool=obj.isPowerOfTwo(n);
            System.out.println(bool);
        }
    }
}