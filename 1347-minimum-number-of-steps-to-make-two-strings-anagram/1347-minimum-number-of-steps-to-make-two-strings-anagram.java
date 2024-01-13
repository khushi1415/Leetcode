class Solution {
        public int minSteps(String s, String t) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            ++count[s.charAt(i) - 'a']; 
            --count[t.charAt(i) - 'a']; 
        }
        int steps = 0;
        for (int step : count) {
            if (step > 0) {
                steps += step;
            }
        }
	    return steps;
    }
}