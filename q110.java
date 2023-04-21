class q110 {
    public boolean isBalanced(TreeNode root) {
        return getDepth(root) != -1 ? true : false;
    }

    private int getDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        if (leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth-rightDepth) > 1) return -1;

        return Math.max(leftDepth, rightDepth) + 1;
    }
}