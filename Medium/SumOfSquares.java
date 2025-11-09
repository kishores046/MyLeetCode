public class SumOfSquares {
    public boolean judgeSquareSum(int c) {
        if(c<=2)return true;
        int start=0;
        int end=(int)Math.sqrt(c);
        while(start<=end){
            long ans=(long)start*start+(long)end*end;
            if(ans==c){
                return true;
            }else if(ans>c){
                end--;
            }else{
                start++;
            }
        }
        return false;
    }
}
