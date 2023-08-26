class Solution {
    Integer[][][][][][][] dp = new Integer[11][6][6][22][2][2][2];
    public int numberOfBeautifulIntegers(int low, int high, int k) {
        String lower = Integer.toString(low),higher = Integer.toString(high);
        int m = lower.length(),n = higher.length();
        for(int i=1;i<=n-m;i++) lower = "0"+lower;
        int count = helper(lower,higher,0,0,0,0,1,1,0,k);
        return count;
    }
    private int helper(String lower,String higher,int idx,int even,int odd,int mod,int tight1,int tight2,int leadingZero,int k){
        if(idx == lower.length()) return (leadingZero == 1 && even == odd && mod % k == 0) ? 1 : 0;
        if(even > 5 || odd > 5) return 0;
        if(dp[idx][even][odd][mod][tight1][tight2][leadingZero] != null) return dp[idx][even][odd][mod][tight1][tight2][leadingZero];
        int min = tight1 == 1?lower.charAt(idx) - '0' : 0;
        int max = tight2 == 1?higher.charAt(idx) - '0' : 9;
        int count = 0;
        for (int i = min; i <= max; i++) {
            int newtight1 = tight1 == 1 && i == min ? 1 : 0;
            int newtight2 = tight2 == 1 && i == max ? 1 : 0;
            int newmod = ((10*mod)%k + i%k)%k;
            if(leadingZero== 0){
                if(i == 0){
                    count += helper(lower,higher,idx+1,even,odd,mod,newtight1,newtight2,0,k);
                }
                else count += helper(lower,higher,idx+1,even + ((i%2==0)?1:0),odd + ((i%2!=0)?1:0),newmod,newtight1,newtight2,1,k);
            }
            else{
                count += helper(lower,higher,idx+1,even + ((i%2==0)?1:0),odd + ((i%2!=0)?1:0),newmod,newtight1,newtight2,1,k);
            }
        }
        return dp[idx][even][odd][mod][tight1][tight2][leadingZero] = count;
    }
}
