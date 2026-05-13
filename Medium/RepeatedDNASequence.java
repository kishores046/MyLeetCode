import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequence {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<10)return new ArrayList<>();
        if(s.length()==10)return new ArrayList<>();

        StringBuilder sb=new StringBuilder(s.substring(0,10));
        Set<String> seen=new HashSet<>();
        Set<String> res=new HashSet<>();
        seen.add(sb.toString());
        for(int i=10;i<s.length();i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            if(seen.contains(sb.toString())){
                res.add(sb.toString());
            }else seen.add(sb.toString());
        }

        return new ArrayList<>(res);
    }

    static void main() {
        System.out.println(new RepeatedDNASequence().findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }

    /*
    * public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        Set<String> seen = new HashSet<>();
        Set<String> res = new HashSet<>();

        for (int i = 0; i <= n - 10; i++) {
            String sub = s.substring(i, i + 10); // fixed size

            if (!seen.add(sub)) { // already exists
                res.add(sub);
            }
        }

        return new ArrayList<>(res);
*/
}
