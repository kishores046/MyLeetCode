void main() {
    int[][] logs = {
            {2033, 2034},
            {2039, 2047},
            {1998, 2042},
            {2047, 2048},
            {2025, 2029},
            {2005, 2044},
            {1990, 1992},
            {1952, 1956},
            {1984, 2014}
    };
    System.out.println(maximumPopulation(logs));

}
public int maximumPopulation(int[][] logs) {
    int[] prefixSum=new int[100];
    for (int[] arr:logs){
        prefixSum[arr[0]-1950]++;
        prefixSum[arr[1]-1950]--;
    }

    for(int i=1;i<prefixSum.length;i++){
        prefixSum[i]+=prefixSum[i-1];
    }

    int maxPopulation=0;
    int year = 1950;
    for (int i = 0; i < prefixSum.length; i++) {
        if (prefixSum[i] > maxPopulation) {
            maxPopulation = prefixSum[i];
            year = 1950 + i;
        }
    }

    return year;
}