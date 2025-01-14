class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] prefix=new int[gain.length+1];
        prefix[0]=0;
        for(int i=1;i<gain.length+1;i++){
            prefix[i]=prefix[i-1]+gain[i-1];
        }
       int max=Integer.MIN_VALUE;
       for(int i=0;i<prefix.length;i++){
         max=Math.max(prefix[i],max);
       }
       return max;
    }
}
