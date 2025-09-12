class CountAndSay {
    public String countAndSay(int n) {
        String result ="1";
        for(int i=1;i<n;i++){
            result=say(result);
        }
        return result;
        
    }
    public static String say(String term){
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<term.length();i++){
            if(term.charAt(i)==term.charAt(i-1)){
                count++;
            }
            else{
                sb.append(count).append(term.charAt(i-1));
                count=1;
            }
        }
        return sb.append(count).append(term.charAt(term.length()-1)).toString();
    }
}
