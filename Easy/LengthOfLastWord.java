class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int start_index=s.lastIndexOf(' ');
        int len=s.substring(start_index+1,s.length()).length();
        return len;
    }}