import java.util.*;
class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
          HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Use a list to store the intersection
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1); // Decrease the count
            }
        }

        // Convert resultList to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result; 
    }
    public static void main(String args[]){
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] inter=new Solution().intersect(nums1,nums2);
        System.out.println(Arrays.toString(inter));
    }
}
