public class RotateString {
    public static void main(String args[]){
        String s="abcde",goal="cdeab";
        RotateString obj=new RotateString();
        System.out.println(obj.isRotateString(s,goal));
        }
    
    public boolean isRotateString(String s,String goal){
        if(s.length()!=goal.length()){
             return false;
        }
        String final_str=" ";
        for(int i=0;i<s.length();i++){
            final_str=s.substring(i+1,s.length())+s.substring(0,i+1);
            if(goal.equals(final_str)){
             return true;
            }
    }
    return false;
    }
}