/*
https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
*/


  /*
  *Definition for a binary tree node.
  */
  public class TreeNode {
     int val;
     TreeNode left;
    TreeNode right;
   TreeNode(int x) { val = x; }
 }
 
/* SOLUTION */
 public class FlattenTree {   
    
 public void flatten(TreeNode root) 
    {
        if(root==null)
            return;
        TreeNode head=new TreeNode(0);
        head.right=root;
        TreeNode n=head;
        while(n.right!=null)
        {
            n=n.right;
            TreeNode temp=n.right;
            if(n.left!=null)
            {
            TreeNode templ=n.left;
            while(templ.right!=null)
            {
                templ=templ.right;
            }
            
            n.right=n.left;
            n.left=null;
            templ.right=temp;
            }
        }
        
    }

}