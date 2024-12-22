import java.util.HashSet;
class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1=new HashSet<>();
        HashSet<Integer> hashSet2=new HashSet<>();
        for(int i:nums1){
            hashSet1.add(i);
        }
        for(int i:nums2){
            if(hashSet1.contains(i)){
                hashSet2.add(i);
            }
        }
        int[] array=new int[hashSet2.size()];
        int c=0;
        for(Integer i:hashSet2){
            array[c]=i;
            c++;
        }
     return array;
    }
    public static void main(String args[]){
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] inter=new IntersectionOfTwoArrays().intersection(nums1,nums2);
        System.out.println(Arrays.toString(inter));
    }
}
