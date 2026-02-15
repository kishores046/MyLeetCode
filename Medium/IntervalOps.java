void main() {
    int[][] arr={{1,3},{2,6},{5,7},{8,10},{15,18},{17,19}};
    IO.println(Arrays.deepToString(mergeIntervals(arr)));

    int[][] intervals ={{1,2},{3,5},{6,7},{8,10},{12,16}};//As per Leetcode the intervals array is already sorted by start time
    int[] newInterval={4,8};

   IO.println(Arrays.deepToString(insertInterval(intervals, newInterval)));
}

public int[][] insertInterval(int[][] intervals, int[] newInterval) {


    List<int[]> result = new ArrayList<>();
    int i = 0;
    int n = intervals.length;

    // Phase 1: Add all intervals before newInterval
    while (i < n && intervals[i][1] < newInterval[0]) {
        result.add(intervals[i]);
        i++;
    }


    while (i < n && intervals[i][0] <= newInterval[1]) {
        newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
        newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
        i++;
    }


    result.add(newInterval);


    while (i < n) {
        result.add(intervals[i]);
        i++;
    }

    return result.toArray(new int[result.size()][]);
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


