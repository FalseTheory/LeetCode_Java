package PathSum;

import util.TreeNode;

public class PathSum {


    public static void main(String[] args) {
        TreeNode node = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        int targetSum = 5;
        assert !hasPathSum(node, targetSum);
        System.out.println("Working");
    }
    public static boolean hasPathSum(TreeNode root, int targetSum){

        if(root==null){
            return false;
        }
        targetSum -=root.val;
        if(targetSum==0){
            if(root.left==null && root.right==null){
                return true;
            }
        }
        if(hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum)){
            return true;
        }else{
            return false;
        }

    }
}
