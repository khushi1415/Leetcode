class Solution {
    public boolean isPerfectSquare(int num) {
        double d1 = Math.sqrt(num);
        double d2 = Math.round(d1);
        double fracValue = d1-d2;
        return Math.abs(fracValue)>0 ? false:true;        
    }
}