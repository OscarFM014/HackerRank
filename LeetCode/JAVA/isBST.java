import java.util.*;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */

public class isBST {
    ArrayList<Integer> aux = new ArrayList<Integer>();

    private void valid(TreeNode root) {
        if (root != null) {
            valid(root.left);
            aux.add(root.val);
            valid(root.right);
        }
    }

    public boolean isValidBST(TreeNode root) {
        valid(root);
        for (int i = 0; i < aux.size() - 1; i++) {
            if (aux.get(i) >= aux.get(i + 1)) {
                return false;
            }
        }
        return true;

    }

}
