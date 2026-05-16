package Hard;

import java.util.Arrays;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int[] freqTarget=new int[52];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(Character.isLowerCase(ch)){
                freqTarget[ch-'a']++;
            }else{
                freqTarget[ch-'A'+26]++;
            }
        }
        int i=-1,j=-1;
        int left=0;
        int[] freqSource=new int[52];

        int len=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            freqSource[Character.isLowerCase(s.charAt(right))?s.charAt(right)-'a':s.charAt(right)-'A'+26]++;
            while (check(freqSource,freqTarget)){
                if(len>right-left+1) {
                    i = left;
                    j = right;
                    len=j-i+1;
                }
                freqSource[Character.isLowerCase(s.charAt(left))?s.charAt(left)-'a':s.charAt(left)-'A'+26]--;
                left++;

            }
        }
        System.out.println(s.substring(i,j+1));

        if(i==-1 && j==-1)return null;
        return s.substring(i,j+1);
    }

    private boolean check(int[] freqSource,int[] freqTarget){
        for(int i=0;i<freqSource.length;i++){
            if(freqSource[i]<freqTarget[i]) {
                return false;
            }
        }
        return true;
    }
    static void main(String[] args) {
        System.out.println(new MinimumWindowSubstring().minWindow("ADOBECODEBANC","ABC"));
    }
}
