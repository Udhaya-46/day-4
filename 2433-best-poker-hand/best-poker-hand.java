class Solution {
    public String bestHand(int[] ranks, char[] suits) {

        // Check for Flush
        boolean flush = true;
        for (int i = 1; i < 5; i++) {
            if (suits[i] != suits[0]) {
                flush = false;
                break;
            }
        }
        if (flush) return "Flush";

        // Count rank frequencies
        int[] freq = new int[14];
        int maxFreq = 0;

        for (int rank : ranks) {
            freq[rank]++;
            maxFreq = Math.max(maxFreq, freq[rank]);
        }

        if (maxFreq >= 3) return "Three of a Kind";
        if (maxFreq == 2) return "Pair";

        return "High Card";
    }
}