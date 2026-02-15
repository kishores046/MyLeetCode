void main() {
    int[][] arr={{1,3},{2,6},{5,7},{8,10},{15,18},{17,19}};
    IO.println(Arrays.deepToString(mergeIntervals(arr)));
}

public int[][] mergeIntervals(int[][] intervals) {
    if (intervals.length <= 1) return intervals;


    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    int index = 0;

    for (int i = 1; i < intervals.length; i++) {

        if (intervals[i][0] <= intervals[index][1]) {
            intervals[index][1] =
                    Math.max(intervals[index][1], intervals[i][1]);
        } else {

            index++;
            intervals[index] = intervals[i];
        }
    }

    return Arrays.copyOf(intervals, index + 1);
}