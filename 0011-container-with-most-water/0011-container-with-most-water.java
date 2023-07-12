class Solution {
    public int maxArea(int[] height) {
        int size = height.length;
        if(size == 1){return 0;}
        if(size == 2){return Math.min(height[0],height[1]) ;}
        
        int left = 0;
        int right = size-1;
        int max_area = 0;
        
        while(left != right){
            if(height[left] < height[right]){
                max_area = Math.max(max_area, height[left]*(right-left));
                left++;
            }
             else{
                 max_area = Math.max(max_area, height[right]*(right-left));
                 right--;
             }            
        }
       return max_area;
        
    }
}