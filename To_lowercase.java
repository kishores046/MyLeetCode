package LEETCODE_JAVA.EASY;

public class To_lowercase {
   public static void main(String[] args) {
    String str="LOVELY",str_f="";
    for(int i=0;i<str.length();i++){
          char ch=(char)(str.charAt(i)+32);
          str_f+=ch;
    }
    System.out.println(str_f);
   } 
}
