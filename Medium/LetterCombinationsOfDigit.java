import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfDigit {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList<>();
        Map<Integer,String> combinations=getMap();
        List<String> re=new ArrayList<>();
        re.add("");
        for(int i=0;i<digits.length();i++){
            char digit=digits.charAt(i);
            String letters=combinations.get(digit-'0');
            List<String> temp=new ArrayList<>();
            for(String prefix:re){
                for(char c:letters.toCharArray()){
                    temp.add(prefix+c);
                }
            }
            re=temp;
        }
        return re;

    }
    public static Map<Integer, String> getMap(){
        Map<Integer,String> combinations=new HashMap<>();
        combinations.put(2,"abc");
        combinations.put(3,"def");
        combinations.put(4,"ghi");
        combinations.put(5,"jkl");
        combinations.put(6,"mno");
        combinations.put(7,"pqrs");
        combinations.put(8,"tuv");
        combinations.put(9,"wxyz");
        return combinations;

    }
}
