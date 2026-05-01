public class MaxVowelsInSubstringInGivenLen {
    static void main(String[] args) {
        new MaxVowelsInSubstringInGivenLen().maxVowelsInSubstring("aeiou",2);
    }

    public int maxVowelsInSubstring(String S,int k) {
        int initialWindow=0,j=k-1;
        for(int i=0;i<k;i++){
            if("aeiou".indexOf(S.charAt(i))!=-1)initialWindow++;
        }
        int max=initialWindow;
        for(int i=k;i+j<S.length();i++){
            max=Math.max(max,check(S.substring(i,i+j+1)));
        }

        System.out.println(max);
        return max;
    }

    private int check(String substring) {
        int count=0;
        for(int i=0;i<substring.length();i++){
            if ("aeoiu".indexOf(substring.charAt(i))!=-1)count++;
        }
        return count;
    }

}
