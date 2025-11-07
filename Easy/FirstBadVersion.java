

 class FirstBadVersion{
    public int firstBadVersion(int n) {
        int left = 1;
        int  right = n;
        int  mid;
     
        while (left < right) {
            mid = (right - left) / 2 + left;  


            if (isBadVersion(mid)) {
                right = mid;   
            } else {
                left = mid + 1;  
            
            }
        }

        return left;  
    }
    /*Consider this as that version control api's method */
    private boolean isBadVersion(int mid) {
        
        throw new UnsupportedOperationException("Unimplemented method 'isBadVersion'");
    }
    
}
