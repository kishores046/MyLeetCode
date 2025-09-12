class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int expected=candyType.length/2;
        for(int i:candyType){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.size()>=expected){
            return expected;
            }
        }
        return map.size();
        
    }
}
