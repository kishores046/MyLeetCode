import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOfSpecialChars {
    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> lowerSeen = new HashMap<>();
        Map<Character, Integer> upperSeen = new HashMap<>();

        Set<Character> counted = new HashSet<>();
        Set<Character> invalid = new HashSet<>();

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            if (Character.isUpperCase(c)) {

                char lower = (char)(c + 32);

                if (lowerSeen.containsKey(lower)
                        && !counted.contains(lower)
                        && !invalid.contains(lower)) {

                    count++;
                    counted.add(lower);
                }

                upperSeen.put(c, i);

            } else {

                char upper = (char)(c - 32);

                if (upperSeen.containsKey(upper)) {

                    if (counted.contains(c)) {
                        count--;
                        counted.remove(c);
                    }

                    invalid.add(c);
                }

                lowerSeen.put(c, i);
            }
        }

        return count;
    }

    static void main() {
        System.out.println(new NumberOfSpecialChars().numberOfSpecialChars("AbBCab"));
    }
}
