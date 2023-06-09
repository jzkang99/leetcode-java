public class q101 {
    public boolean isSymmetric(TreeNode root) {
        return checkTwoNodes(root.left, root.right);
    }

    private boolean checkTwoNodes(TreeNode node1, TreeNode node2) {
        if (node1==null && node2==null) return true;

        if (node1==null || node2==null) return false;

        if (node1.val != node2.val) return false;

        return checkTwoNodes(node1.left, node2.right) && checkTwoNodes(node1.right, node2.left);
    }
}
