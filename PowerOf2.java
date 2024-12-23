import java.util.Scanner;
class PowerOf2 {
    public boolean isPowerOfTwo(int n) {
        //Using Bit Manipulation 
        if(n<=0){
            return false;
        }
        return((n&(n-1))==0);
        
    }
    public static void main(String args[]){
        PowerOf2 obj=new PowerOf2();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean bool=obj.isPowerOfTwo(n);
        System.out.println(bool);
    }
}