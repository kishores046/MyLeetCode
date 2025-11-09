public class GuessGameHighOrLow {
    public int guessNumber(int n) {
        int low=1,high=n;
        int pick=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(guess(mid)==0){
                pick=mid;
                break;
            }else if(guess(mid)==-1){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return pick;
    }

    private int guess(int mid) {
        return 0;//just placeholder don't create this method in your code
    }
}
