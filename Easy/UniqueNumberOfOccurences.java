import java.util.*;
class UniqueNumberOfOccurences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> map1 = new HashSet<>();
        for (int i:map.values()){
            if (!map1.add(i)){
                return false;
            }
        }

        return true;
    }
}
