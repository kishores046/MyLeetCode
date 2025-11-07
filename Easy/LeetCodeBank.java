public class LeetCodeBank {
    static void main() {
        int n=20;
         // example input
        int dayTracker = 1;
        int countTracker = 1;
        int i = 1;
        int prevI = i;
        int sum = 0;
        boolean dayTracKerChanged = false;
        while (countTracker <= n) {
            if (dayTracker > 7) {
                // Start of new week
                prevI = prevI + 1;     // Monday increases by 1
                i = prevI;             // Reset i to new Monday amount
                dayTracker = 1;        // Reset week
                dayTracKerChanged = true;
            }

            // Add money for the day
            sum += i;

            // Prepare for next day
            dayTracker++;
            countTracker++;

            // Increment i for next day’s saving
            i++;

            // Reset flag if it was changed
            if (dayTracKerChanged) {
                dayTracKerChanged = false;
            }
        }
        System.out.println(sum);

    }
}
