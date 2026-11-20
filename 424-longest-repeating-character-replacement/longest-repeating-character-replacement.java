class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0;
        int j = 0;
        int m = 0;
        int maxFreq = 0;

        int[] arr = new int[26];

        while (j < s.length()) {

            arr[s.charAt(j) - 'A']++;

            maxFreq = Math.max(maxFreq, arr[s.charAt(j) - 'A']);

            if ((j - i + 1) - maxFreq > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }

            m = Math.max(m, j - i + 1);

            j++;
        }

        return m;
    }
}