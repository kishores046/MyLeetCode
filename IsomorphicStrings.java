package LEETCODE_JAVA.EASY;

import java.util.HashMap;


class IsomorphicStrings{
    public static void main(String[] args) {
        String s="add",t="egg";
        IsomorphicStrings obj=new IsomorphicStrings();
        System.out.println(obj.isIsomporhicStrings(s,t));
    }
    public boolean isIsomporhicStrings(String s,String t){
        if(t.length()!=s.length()){
            return false;
        }
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if mappings are consistent
            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) {
                    return false;
                }
            } else {
                mapS.put(charS, charT);
            }

            if (mapT.containsKey(charT)) {
                if (mapT.get(charT) != charS) {
                    return false;
                }
            } else {
                mapT.put(charT, charS);
            }
        }
        return true;
    }

    }
