/**

PROBLEM - 

Given a binary tree, return the preorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
Follow up: Recursive solution is trivial, could you do it iteratively?

*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryPreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> op = new ArrayList<>();
        
        if(root != null){
            
           preorder(root,aop);
        }
          
        
        return op;
             
    }
    
    private void preorder(TreeNode root,List<Integer> op){
        
        op.add(root.val);
        
        if(root.left != null){
            preorder(root.left,op);
            
        }
        if(root.right != null){
            preorder(root.right,op);
            
        }
            
         
        
        
    }

}
