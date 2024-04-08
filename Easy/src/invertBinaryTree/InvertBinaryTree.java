package invertBinaryTree;

import util.TreeNode;

public class InvertBinaryTree {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),
                new TreeNode(7,new TreeNode(6),new TreeNode(9)));
        TreeNode treeTest = new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),
                new TreeNode(7,new TreeNode(6),new TreeNode(8)));
        TreeNode reverseTree = new TreeNode(4,new TreeNode(7,new TreeNode(9),new TreeNode(6)),
                new TreeNode(2,new TreeNode(3),new TreeNode(1)));


        System.out.println(tree);
        System.out.println(tree.equals(treeTest)); // equals Test

        assert invertTree(tree).equals(reverseTree);
        System.out.println("Working");
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        invertNodes(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void invertNodes(TreeNode node){
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

    }
}
