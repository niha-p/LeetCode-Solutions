/*
https://leetcode.com/problems/binary-tree-inorder-traversal/
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
public class BinTreeInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list =new ArrayList();
        Stack<TreeNode> stack=new Stack();
        if(root==null) 
            return list;
            
        while(root!=null)
        {
            stack.push(root);
            root=root.left;
            
            while(root==null)
            {
                if(stack.empty())
                    return list;
                root=stack.pop();
                list.add(root.val);
                root=root.right;
            }
        }
        return list;
    }
}