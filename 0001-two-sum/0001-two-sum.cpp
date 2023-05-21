class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        for(int i = 0; i < nums.size(); i++){
            for(int c = i+1; c < nums.size(); c++){
                if(nums[i] + nums[c] == target){
                    nums.clear();
                    nums.push_back(c);
                    nums.push_back(i);
                    return nums;
               }
            }
        }
return nums;
    }
};