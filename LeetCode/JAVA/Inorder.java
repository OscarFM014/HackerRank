/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */

public class Inorder {
    List<Integer> fila = new ArrayList<Integer>();

    private void inorderTraversala(TreeNode root) {
        if (root != null) {
            inorderTraversala(root.left);
            fila.add(root.val);
            inorderTraversala(root.right);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        inorderTraversala(root);
        return fila;
    }

}