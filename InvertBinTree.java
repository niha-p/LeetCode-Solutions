/*
https://leetcode.com/problems/invert-binary-tree/
*/

/**
 * Definition for a binary tree node.
 */ 
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 

/* SOLUTION */
public class InvertBinTree {
    public TreeNode invertTree(TreeNode root) {
        if (root==null)
            return root;
        TreeNode x=root.left;
        root.left=root.right;
        root.right=x;
        invertTree(root.left);
        invertTree(root.right);
        
        return root;

        
    }
}