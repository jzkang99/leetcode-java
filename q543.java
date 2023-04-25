public class q543 {
	private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return diameter;
    }

    private int traverse(TreeNode root) {
        if (root == null) return 0;

        int left = traverse(root.left);
        int right = traverse(root.right);

        diameter = Math.max(diameter, left+right);

        return Math.max(left, right) + 1;
    }
}
