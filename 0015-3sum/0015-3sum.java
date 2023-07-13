class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        //0 1 2 3
        //a + b + c = 0;
        // b + c = 0 - a
        for(int i = 0; i < nums.length -2; i++) {
            int a = nums[i];
            if(i > 0 && nums[i-1] == nums[i])
                continue;
            int j = i + 1, k = nums.length - 1;
            while(j < k) {
                int sum = a + nums[j] + nums[k];
                if(sum > 0) {
                    k--;
                }
                else if(sum < 0) {
                    j++;
                }
                else {
                    List<Integer> sublist = Arrays.asList(new Integer[] { a, nums[j], nums[k] });
                    result.add(sublist);
                    //2,2,2,2
                    while(j < nums.length - 1 && nums[j + 1] == nums[j])
                        j++;
                    j++;
                    while(k > j && nums[k-1] == nums[k])
                        k--;
                    k--;
                }
            }
        }
        return result;
    }
}