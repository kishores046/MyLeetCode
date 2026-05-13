import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertArrayTo2DArrayBasedOnCondition {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i:nums) freq.put(i,freq.getOrDefault(i,0)+1);
        List<List<Integer>> res=new ArrayList<>();
        while(!freq.isEmpty()){
            List<Integer> r=new ArrayList<>();
            for(Map.Entry<Integer,Integer> e:freq.entrySet()){
                r.add(e.getKey());
                freq.compute(e.getKey(),(k,v)->v!=null?v-1:0);
            }
            freq.entrySet().removeIf(entry -> entry.getValue() == 0);
            res.add(r);
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println(new ConvertArrayTo2DArrayBasedOnCondition().findMatrix(new int[]{1,3,4,1,2,3,1}));
    }
}

/*
Map<Integer, Integer> freq = new HashMap<>();
for (int i : nums) {
    freq.put(i, freq.getOrDefault(i, 0) + 1);
}

List<List<Integer>> res = new ArrayList<>();

while (!freq.isEmpty()) {
    List<Integer> r = new ArrayList<>();

    Iterator<Map.Entry<Integer, Integer>> it = freq.entrySet().iterator();

    while (it.hasNext()) {
        Map.Entry<Integer, Integer> e = it.next();

        r.add(e.getKey());

        int newVal = e.getValue() - 1;

        if (newVal == 0) {
            it.remove();
        } else {
            e.setValue(newVal); // update in-place
        }
    }

    res.add(r);
}

return res;*/