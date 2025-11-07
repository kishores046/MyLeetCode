import java.util.HashMap;

class BullsAndCows {
    public String getHint(String secret, String guess) {
         int cows=0,bulls=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<secret.length();i++){
            char ch1=secret.charAt(i);
            char ch2=guess.charAt(i);
            if(ch1==ch2){
                bulls++;
            }else map.put(ch1,map.getOrDefault(ch1,0)+1);
        }
      
        for(int i=0;i<guess.length();i++){
            char ch1=secret.charAt(i);
            char ch2=guess.charAt(i);
            if(ch1!=ch2 && map.containsKey(ch2) && map.get(ch2)>0){
                cows++;
                map.put(ch2,map.get(ch2)-1);
            }
        }
        return bulls+"A"+cows+"B";
        
    }
}
