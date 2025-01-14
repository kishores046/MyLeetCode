class MergeStringsAlter {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int w1=0,w2=0;
        while(w1<word1.length()||w2<word2.length()){
            if(w1==word1.length()-1 && w2!=word2.length()-1){
                sb.append(word1.charAt(w1));
                sb.append(word2.charAt(w2));
                sb.append(word2.substring(w2+1,word2.length()));
                break;
            }
            else if(w1!=word1.length()-1 && w2==word2.length()-1){
                sb.append(word1.charAt(w1));
                sb.append(word2.charAt(w2));
                sb.append(word1.substring(w1+1,word1.length()));
                break;
            }
            else{
                 sb.append(word1.charAt(w1));
                 sb.append(word2.charAt(w2));
            }
            w1++;
            w2++;
        }
        return new String(sb);
    }
}
