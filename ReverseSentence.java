import java.util.StringTokenizer;

public class ReverseSentence {
     public String reverseWords(String s) {
       StringTokenizer st=new StringTokenizer(s," ");
        int count=st.countTokens();
        String array[]=new String[count];
        while(st.hasMoreTokens()){
          array[count-1]=st.nextToken();
          count--;
        }
        StringBuilder rev=new StringBuilder();
        for(int j=0;j<array.length;j++){
               
                if(j!=0){
                    rev.append(" ");
                }
                rev.append(array[j]);
           
        }
        int len=rev.length();
        if(rev.charAt(rev.length()-1)==' '){
            rev.deleteCharAt(len-1);
        }
        return rev.toString();
        
    }
    public static void main(String args[]){
        Solution obj=new Solution();
        System.out.println(obj.reverseWords("the sky is blue"));
    }
}
