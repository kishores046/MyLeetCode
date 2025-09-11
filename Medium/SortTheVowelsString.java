class Solution {
    public String sortVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        String vowels="AEIOUaeiou";
        
        //Efficient Solution
        List<Character> vowel=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(vowels.contains(c+"")){
                vowel.add(c);
            }
        }
        Collections.sort(vowel);
        int count=0;
        for(int i=0;i<sb.length();i++){
            if(vowels.contains(String.valueOf(sb.charAt(i)))){
                sb.setCharAt(i,vowel.get(count));
                count++;
            }
        }
        return sb.toString();
    }
}
