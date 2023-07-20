class Solution {
    public int sumOfMultiples(int n) {
        int result = 0;
        for(int k = 1; k <= n; k++)
        {
        
            if(k % 3 == 0 || k % 5 == 0 || k % 7 == 0)
            {
                result += k;
            }
        }
        
        return result;
    }
}
