class Solution {
    public int countPairs(int[] nums, int k) {
        Map<Integer, List<Integer>> indices = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            indices.computeIfAbsent(nums[i], l -> new ArrayList<>()).add(i);
        } 
        int cnt = 0;
        for (List<Integer> ind : indices.values()) {
            for (int i = 0; i < ind.size(); ++i) {
                for (int j = 0; j < i; ++j) {
                    if (ind.get(i) * ind.get(j) % k == 0) {
                        ++cnt;
                    }
                }
            }
        }
        return cnt;
    }
}