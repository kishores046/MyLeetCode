import java.util.Arrays;

public class MaximumMatchingOfPlayersWithTrainers {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0, j = 0;
        int res = 0;
        while (i < players.length && j < trainers.length) {
            if (trainers[j] >= players[i]) {
                i++;
                res++;
                j++;
            } else {
                j++;
            }
        }
        return res;
    }
}