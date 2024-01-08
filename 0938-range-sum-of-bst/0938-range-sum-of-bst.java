class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0; // base case.
        return (L <= root.val && root.val <= R ? root.val : 0) + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);
    }
}