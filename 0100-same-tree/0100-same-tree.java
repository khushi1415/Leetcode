class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameNode(p, q);
    }
    public boolean isSameNode(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return false;
        }
        if((p.val != q.val) || !isSameNode(p.left, q.left) || !isSameNode(p.right, q.right)){
            return false;
        }
        return true;
    }
}