package LEETCODE_JAVA.EASY;

public class CircularSentence {
    public boolean isCircularSentence(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                if(str.charAt(i-1)==str.charAt(i+1)){
                }
                else{
                    return false;
                }
            }
            if(i==str.length()-1){
                if(str.charAt(i)==str.charAt(0)){
                }
                else{
                    return false;
                }
            }
        }
     
        return true;
        }
    public static void main(String[] args) {
       String str="Leetcode enjoys sound delightfull";
        //String str="eetcode";
        CircularSentence obj=new CircularSentence();
        System.out.println(obj.isCircularSentence(str));
    }
}
