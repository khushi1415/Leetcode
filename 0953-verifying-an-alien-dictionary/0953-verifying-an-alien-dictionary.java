class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] pos = new int[order.length()];
        for (int i = 0; i < order.length(); i++)
            pos[order.charAt(i) - 'a'] = i;
        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1], curr = words[i];
            int len = Math.min(prev.length(), curr.length());
            int countEqual = 0;
            for (int j = 0; j < len; j++) {
                char p = prev.charAt(j), c = curr.charAt(j);
                if (pos[p - 'a'] > pos[c - 'a']) return false;
                else if (pos[p - 'a'] == pos[c - 'a']) countEqual++;
                else break;
            }
            if (countEqual == len && prev.length() > curr.length()) return false;
        }
        return true;
    }
}