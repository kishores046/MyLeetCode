package LEETCODE_JAVA.MEDIUM;

public class String_atoi {
    public static void main(String[] args) {
        String s="-42";
        String_atoi obj=new String_atoi();
        System.out.println(obj.myAtoi(s));
    }
    public int myAtoi(String s){
        
        int final_int=0;
        int sign=1;
       
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
              if(Character.isWhitespace(ch) && final_int==0){
                continue;
              }
              else if(ch=='0' && final_int==0 && i>0){
                if(s.charAt(i-1)=='-'){
                    sign=-1;
                }
              }
              

              else if(Character.isDigit(s.charAt(i))){
                
                    
                    int n=ch-'0';
                    final_int=(final_int*10+n*sign);
                    try{
                        if(s.charAt(i+1)=='-'){
                            break;
                        }
                    }
                    catch(StringIndexOutOfBoundsException e){
    
                    }
                    
                        }
            else if(Character.isAlphabetic(s.charAt(i))){
                            break;
                        }
           
            else{
                    continue;
                }
                        
                }
                return final_int;
            }
               
}