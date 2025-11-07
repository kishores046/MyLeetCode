public class LongestCommonPrefix {
     public String longestCommonPrefix(String[] strs) {
      
        StringBuilder prefix=new StringBuilder(strs[0]);
         for (String str : strs) {
             while (!str.startsWith(prefix.toString())) {
                 prefix.deleteCharAt(prefix.length() - 1);
             }
             if (prefix.isEmpty()) {

                 return "";
             }
         }
        return prefix.toString();
        
    }
}
