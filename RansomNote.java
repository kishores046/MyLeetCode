import java.util.HashMap;
public class RansomNote {
    public static void main(String[] args) {
        String magazine="aaaaa";
        String ransomNote="aa";
        System.out.println(RansomNote.check(magazine,ransomNote));             
            }
        public static boolean check(String magazine,String ransomNote){
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<magazine.length();i++){
            Character ch=magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
       
        for(int i=0;i<ransomNote.length();i++){
            Character ch=ransomNote.charAt(i);
            if(!map.containsKey(ch) || map.get(ch)<=0){
               return false;
            }
            else{
              map.put(ch,map.get(ch)-1);
            }
            
        }
                return true;
    }
}
