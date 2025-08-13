import java.util.HashSet;

class HappyNumber {
    public boolean isHappy(int n) {
        
        HashSet<Integer> seen=new HashSet<>();
        int current=n;
        while(!seen.contains(current)){
            seen.add(current);
            int sum=0;
            while(current>0){
                int digit=current%10;
                sum+=(digit*digit);
                current/=10;
            }
            if(sum==1)return true;
            current=sum;
        }
        return false;
    }
}
