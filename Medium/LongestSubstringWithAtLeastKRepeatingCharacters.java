public class LongestSubstringWithAtLeastKRepeatingCharacters {

    public int longestSubstring(String s, int k) {
        return helper(s, 0, s.length(), k);
    }

    private int helper(String s, int start, int end, int k) {


        if (end - start < k) return 0;


        int[] freq = new int[26];
        for (int i = start; i < end; i++) {
            freq[s.charAt(i) - 'a']++;
        }


        for (int mid = start; mid < end; mid++) {

            if (freq[s.charAt(mid) - 'a'] < k) {


                int left = helper(s, start, mid, k);
                int right = helper(s, mid + 1, end, k);

                return Math.max(left, right);
            }
        }


        return end - start;
    }

    public static void main(String[] args) {
        LongestSubstringWithAtLeastKRepeatingCharacters obj =
                new LongestSubstringWithAtLeastKRepeatingCharacters();

        System.out.println(obj.longestSubstring("aaabb", 3)); // 3
    }
}