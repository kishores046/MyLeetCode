

 //Definition for a binary tree node.

import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> list=new ArrayList<>();
       inorder(root,list);
       return list;
    }
    public void inorder(TreeNode node,List<Integer> list){
        if(node!=null){
            inorder(node.left,list);
            list.add(node.val);
            inorder(node.right,list);
        }
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        List<Integer> result=new BinaryTreeInorderTraversal().inorderTraversal(root);
        System.out.println(result);
    }}
