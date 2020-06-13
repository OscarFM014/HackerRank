class SumOfLeftLeaves {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        suma(root);
        return sum;
    }
    
    private void suma(TreeNode root) {
        if(root!=null){
            if(root.left != null && root.left.left == null && root.left.right == null){
                sum += root.left.val;
            }
            suma(root.left);
            suma(root.right);
        }
       
        
    }
}