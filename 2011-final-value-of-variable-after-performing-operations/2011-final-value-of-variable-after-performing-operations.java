class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        int i=0, j=operations.length-1;

        while(i < j && i != j){
            x += (44 - operations[i].charAt(1));
            x += (44 - operations[j].charAt(1));
            i++;
            j--;
        }
        if(i == j)
            x += (44 - operations[i].charAt(1));
        return x;
    }
}