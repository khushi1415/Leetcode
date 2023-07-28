class Solution {
    public int pivotInteger(int n) {
        int total_sum = 0, removed_sum = 0;
        for(int x=1; x<=n; x++) total_sum += x;
        for(int x=1; x<=n; x++){
            if(total_sum == removed_sum + x){
                return x;
            }
            total_sum -= x;
            removed_sum += x;
        }
        return -1;
    }
}