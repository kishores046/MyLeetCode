//Hamming weight of a binary number refers to number of 1 bit
import java.util.Scanner;
class NumberOfOneBits{
    public int hammingWeight(int n) {
        int count=0,digit;
        while(n>0){
            digit=n%2;
            if(digit==1){
                count++;
            }
            n/=2;
        }
        return count;
    }
    public static void main(String args[]){
        NumberOfOneBits obj=new NumberOfOneBits();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(obj.hammingWeight(n));
        sc.close();
    }
}
/*Using Integer class bitCount() Time complexeity of this solution is O(1)
Space Complexeity is O(1)
class Solution {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
    public static void main(String args[]){
        System.out.println(new Solution().hammingWeight(11));
    }
} */