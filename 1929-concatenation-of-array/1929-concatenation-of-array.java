class Solution {
    public int[] getConcatenation(int[] nums) {
         int output[] = new int[nums.length + nums.length];
         
         System.arraycopy(nums, 0, output, 0, nums.length);
         System.arraycopy(nums, 0, output, nums.length, nums.length);
         
         return output;
    }
}