class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] temp=str.toCharArray();
            Arrays.sort(temp);
            String s=new String(temp);
            map.computeIfAbsent(s,k->new ArrayList<>()).add(str);
        }
        List<List<String>> result=new ArrayList<>(map.values());
        return result;
    }
}
