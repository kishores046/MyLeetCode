public class ContainerWithMostWater {
    static void main() {
        int[] arr={4,3,2,1,4};
        int left=0,right=arr.length-1;
        int res=Integer.MIN_VALUE;
        while(left<=right){
            res=Math.max(res,Math.min(arr[left],arr[right])*(right-left));
            if(arr[left]<arr[right]){
                left++;
            }else right--;
        }
        System.out.println(res);
    }
}
