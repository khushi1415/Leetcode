import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        SortedMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        int prev = 0;
        int sum = 0;
        for(int key : map.keySet()) {
            int temp = map.get(key); // Store current key safely
            sum = sum + prev; // Sum = sum + previous 
            map.put(key, sum); //Store in map the sum
            prev = temp; // Store temp in previous
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}