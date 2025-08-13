

public class Tolowercase {
   public static void main(String[] args) {
    String str="LOVELY";
    String strF="";
    for(int i=0;i<str.length();i++){
          char ch=(char)(str.charAt(i)+32);
          strF+=ch;
    }
    System.out.println(strF);
   } 
}
