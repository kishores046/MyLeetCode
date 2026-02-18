void main() {
    int[][] bookings={{1,2,10},{2,3,20},{2,5,25}};
    int n=5;
    System.out.println(Arrays.toString(corpFlightBookings(bookings,n)));
}
public int[] corpFlightBookings(int[][] bookings, int n) {

    int[] res=new int[n];
    for(int[] arr:bookings){
       res[arr[0]-1]+=arr[2];
       if(arr[1]<n)res[arr[1]]-=arr[2];
       System.out.println(Arrays.toString(res));
    }

    for(int i=1;i< res.length;i++){
        res[i]+=res[i-1];
    }

    return res;
}