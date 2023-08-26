import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.max;

class Solution {
    public int findSubstringInWraproundString(String p) {
        if(p == null || p.isEmpty() || p.isBlank()) {
            return 0;
        }

        int[] dp = new int[p.length()];
        int[] chars = new int[26];
        dp[0] = 1;
        chars[p.charAt(0) - 'a'] = 1;
        char last = p.charAt(0);
        char curr;
        for(int i = 1; i < p.length(); i++) {
            curr = p.charAt(i);
            if(last + 1 == curr || (last == 'z' && curr == 'a')) {
                dp[i] = dp[i-1] + 1;
            } else {
                dp[i] = 1;
            }
            chars[curr - 'a'] = max(chars[curr - 'a'], dp[i]);
            last = curr;
        }

        return Arrays.stream(chars).sum();
    }
}