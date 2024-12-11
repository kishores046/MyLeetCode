package LEETCODE_JAVA.EASY;

import java.util.Arrays;

public class MissingNumber {
    public int findMissingNumber(int arr[]){
       int n=arr.length;
       for(int i=0;i<=n;i++){
        if(Arrays.binarySearch(arr,i)<0){
            return i;
        }
       }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={3,0,1};
        Arrays.sort(arr);
        //System.out.println(Arrays.binarySearch(arr,3));
        MissingNumber obj=new MissingNumber();
       System.out.println(obj.findMissingNumber(arr));
    }
}
