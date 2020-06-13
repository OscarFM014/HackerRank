import jdk.nashorn.internal.runtime.regexp.joni.ast.ConsAltNode;

class ConvertArrayBST{
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0|| nums.length == 1){
            return null;
        }


        return contructBSTRecursive(nums, 0, nums.length - 1); //pointers
    }

    public TreeNode contructBSTRecursive(int[] nums, int left, int right){
        if(left > right ){
            return null;
        }
        
        int mid = left + (right - left) / 2;
        
        TreeNode current = new TreeNOde(nums[mid]);

        current.left = contructBSTRecursive(nums, left, mid - 1);
        current.rigth = construcBSTRecursive(nums, mid + 1, right);
        return current;

    }


    
}