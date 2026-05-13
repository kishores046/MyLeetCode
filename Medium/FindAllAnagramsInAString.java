import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s,String p){
        List<Integer> res=new ArrayList<>();
        int[] sFreq=new int[26];
        int[] pFreq=new int[26];
        for(int i=0;i<p.length();i++)pFreq[p.charAt(i)-'a']++;
        int k=p.length();
        for(int i=0;i<s.length();i++){
            sFreq[s.charAt(i)-'a']++;
            if(i>=k)sFreq[s.charAt(i-k)-'a']--;
            if(Arrays.equals(sFreq,pFreq))res.add(i-k+1);
        }

        return res;
    }

    static void main() {
        System.out.println(new FindAllAnagramsInAString().findAnagrams("cbaebabacd","abc"));
    }
}
