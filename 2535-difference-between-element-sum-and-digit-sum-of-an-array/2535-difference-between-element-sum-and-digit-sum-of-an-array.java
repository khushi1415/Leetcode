class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0, dsum = 0;
        for(int i=0; i<nums.length; i++){
            esum += nums[i];
            while(nums[i] != 0){
                dsum += nums[i]%10;
                nums[i] /= 10;
            }
        }
        return Math.abs(dsum-esum);
    }
}