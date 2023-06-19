class Solution {
    boolean ans = true;
    public boolean isUnivalTree(TreeNode root) {
        int x = root.val;
        return func(root, x);
    }
    boolean func(TreeNode root, int x) {
        if (root==null) return ans;
        if (ans==false) return ans;
        if (root.left!=null) {
            if (x!=root.left.val) return ans = false;
            func(root.left, x);
        }
        if (root.right!=null) {
            if (x!=root.right.val) return ans = false;
            func(root.right, x);
        }
        return ans;
    }
}