public class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        int j = 0;
        for(int i = s.length()-1; i >= 0; i--){
            num += Math.pow(26,j)*(s.charAt(i)-64);
            j++;
        }
        return num;
    }
}