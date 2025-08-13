import java.util.Arrays;
public class ValidAnagram {
    public static void main(String args[]){
        String s="newyorktimes";
        String t="monkeyswrite";
        System.out.println(isvalidAnagram(s,t));
    }
        public static boolean isvalidAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] c=s.toCharArray();
        char[] c1=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        for(int i=0;i<c.length;i++){
            if(c[i]!=c1[i]){
                return false;
            }
        }
        
       return true;
        
    }
}
