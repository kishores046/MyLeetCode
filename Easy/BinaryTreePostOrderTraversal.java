
import java.util.*;



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> list=new ArrayList<>();
       postorder(root,list);
       return list;
    }
    public void postorder(TreeNode node,List<Integer> list){
        if(node!=null){
            postorder(node.left,list);
            postorder(node.right,list);
            list.add(node.val);
        }
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        List<Integer> result=new Solution().postorderTraversal(root);
        System.out.println(result);
    }}
