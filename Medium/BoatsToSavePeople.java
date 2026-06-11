import java.util.Arrays;
public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0,right=people.length-1;
        int boat=0;
        while(left<=right){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            boat++;
        }
        return boat;
    }


    static void main() {
        System.out.println(new BoatsToSavePeople().numRescueBoats(new int[]{3,2,2,1},3));
    }
}
