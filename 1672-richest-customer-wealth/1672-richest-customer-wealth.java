class Solution {
    public int maximumWealth(int[][] nums) {
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            int temp_wealth = 0;
            for(int j=0; j<nums[i].length; j++){
                temp_wealth +=nums[i][j];
            }
            sum = Math.max(sum, temp_wealth);
        }
        return sum;
    }
}