import java.util.*;
public class DifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int i:nums1)hs1.add(i);
        for(int i:nums2)hs2.add(i);
        List<Integer> l1=new ArrayList<>(hs1);
        List<Integer> l2=new ArrayList<>(hs2);
        l1.removeAll(hs2);
        l2.removeAll(hs1);
        list.add(l1);
        list.add(l2);
        return list;
    }

}