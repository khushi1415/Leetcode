class Solution {
    public int minimumSum(int num) {
        char[] arr= String.valueOf(num).toCharArray();
        Arrays.sort(arr);

        int num1 = (arr[0]-'0');
        int num2 = (arr[3]-'0');
        int num3= (arr[1]-'0');
        int num4 = (arr[2]-'0');

        int sum1= num1*10 + num2;
        int sum2= num3*10+ num4;
int finalsum = sum1+sum2;
        return finalsum;
    }
}