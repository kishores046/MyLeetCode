import java.util.*;
public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==k){
            return nums;
        }
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int iterable_element : nums) {
            map.put(iterable_element,map.getOrDefault(iterable_element,0)+1);
        }
       PriorityQueue<Integer> minHeap=new PriorityQueue<>(Comparator.comparingInt(map::get));
       for(int key:map.keySet()){
        minHeap.add(key);
        if(minHeap.size()>k){
            minHeap.poll();
        }
       }
        int[] result=new int[k];
        for(int i=k-1;i>=0;i--){
            result[i]=minHeap.poll();
        }
        return result;
        
    }
}
