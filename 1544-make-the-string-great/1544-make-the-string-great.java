public class Solution {
    public String makeGood(String s) {
        StringBuilder res = new StringBuilder();

        int i = 0;

        while (i < s.length()) {
            int m = res.length();
            if (m > 0 && Math.abs(res.charAt(m - 1) - s.charAt(i)) == 32) {
                res.deleteCharAt(m - 1);
                i++;
            } else if (i + 1 < s.length() && Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32) {
                i += 2;
            } else {
                res.append(s.charAt(i));
                i++;
            }
        }

        return res.toString();
    }
}
