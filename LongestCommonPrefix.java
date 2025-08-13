public class LongestCommonPrefix {
     public String longestCommonPrefix(String[] strs) {
      
        StringBuilder prefix=new StringBuilder(strs[0]);
         for(int i=0;i<strs.length;i++){
            while (!strs[i].startsWith(prefix.toString())) {
                prefix.deleteCharAt(prefix.length()-1);
            }if (prefix.length()==0) {
                
                return "";
            }
        }
        return prefix.toString();
        
    }
}
