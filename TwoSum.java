import java.util.HashMap;

class TwoSum{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr={2,7,11,15};
        int sum=18;
        for(int i=0;i<arr.length;i++){
            
            map.put(arr[i],i);
            if(map.containsKey(sum-arr[i])){
                System.out.println(i+","+map.get(sum-arr[i]));
            }
        }


    }
}