class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        findDia(root);
        return maxDia;
    }
    private int maxDia = 0;
    private int findDia(TreeNode root){
        if(root == null)return 0;
        int leftDepth = findDia(root.left);
        int rightDepth = findDia(root.right);
        int currDia = leftDepth + rightDepth;
        maxDia = Math.max(maxDia, currDia);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}