class Symmetric {

    public void isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode izq, TreeNode der) {
        if (izq == null || der == null) {
            return izq == der;
        }

        if (izq.val != der.val) {
            return false;
        }

        return isSymmetric(izq.left, der.right) && isSymmetric(izq.right, der.left);

    }
}