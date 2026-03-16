void main() {
    List<List<Integer>> t=new ArrayList<>();
    t.add(Arrays.asList(3,6));
    t.add(Arrays.asList(1,5));
    t.add(Arrays.asList(4,7));
    System.out.println(numberOfPoints(t));
}
public int numberOfPoints(List<List<Integer>> nums) {

    nums.sort(Comparator.comparingInt(List::getFirst));
    int index=0;

    for(int i=1;i<nums.size();i++){
        if (nums.get(index).get(1) >= nums.get(i).get(0)) {


            nums.get(index).set(1,
                    Math.max(nums.get(index).get(1), nums.get(i).get(1))
            );

        } else {

            index++;
            nums.set(index, nums.get(i));
        }
    }
    List<List<Integer>> result=nums.subList(0, index + 1);
    int sum=0;
    for(List<Integer> r:result){
        sum+=(r.get(1)-r.get(0)+1);
    }
    return sum;


}